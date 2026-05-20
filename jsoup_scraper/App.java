package com.prashanth.jsoup_scraper;



import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
        System.out.println( "Scraping started..." );
        //connecting to the website
        Document doc = Jsoup.connect("https://books.toscrape.com/")
        		.userAgent("Mozilla/5.0")
        		.timeout(15000)
        		.get();
        
        //select all book elements
        Elements books = doc.select("article.product_pod");
        System.out.println("Total number of books: "+ books.size());
        
        //Loop and extract the data
        
        for(Element book: books) {
        	String title = book.select("h3 > a").attr("title");
        	String price = book.select("p.price_color").text();
        	String rating = book.select("p.star-rating").attr("class").replace("star-rating", " ");
        	System.out.println("Title: "+title);
        	System.out.println("Price: "+price);
        	System.out.println("Rating: "+rating);
        	System.out.println("_---------------_");
        }
    }
}

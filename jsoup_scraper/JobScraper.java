package com.prashanth.jsoup_scraper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import java.security.cert.X509Certificate;

public class JobScraper {
	private static final String BASE_URL =
		    "https://weworkremotely.com/remote-jobs/search?term=java";
	public List<Job> scrape() {
		List<Job> jobs = new ArrayList<Job>();
		try {
			disableSSLVerification();
		System.out.println("Connecting to indeed...");
		
		Document doc = Jsoup.connect(BASE_URL)
				  .userAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 Chrome/120.0.0.0 Safari/537.36")
	                .header("Accept-Language", "en-US,en;q=0.9")
	                .header("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8")
	                .header("Connection", "keep-alive")
	                .ignoreHttpErrors(true)
	                .followRedirects(true)
	                .timeout(30000)
	                .get();

//		System.out.println("Page Title: " + doc.title());
//        System.out.println("HTML Length: " + doc.html().length());
//        System.out.println("\n--- FULL HTML ---");
//        System.out.println(doc.html());  // print entire HTML
		
		Elements jobCards = doc.select("li.new-listing-container");
		
		System.out.println("Job found "+jobCards.size()+" job listings\n");
		
		for(Element card : jobCards) {
			 if (card.hasClass("listing-ad")) continue;
			  String title    = card.select("h3.new-listing__header__title span").text().trim();
			    String company  = card.select("p.new-listing__company-name").text().trim();
			    String location = card.select("p.new-listing__company-headquarters").text().trim();
			    String url      = "https://weworkremotely.com"
			                    + card.select("a.listing-link--unlocked").attr("href");

			    if (title.isEmpty()) continue;
			    if (location.isEmpty()) location = "Remote";

			    jobs.add(new Job(title, company, location, "Not disclosed", url, "WeworkRemotely"));
			
		}
		 } catch (IOException e) {
	            System.err.println(" Error scraping: " + e.getMessage());
	        }
		return jobs;
	}
	
	private void disableSSLVerification() {
	    try {
	        TrustManager[] trustAll = new TrustManager[]{
	            new X509TrustManager() {
	                public X509Certificate[] getAcceptedIssuers() { return null; }
	                public void checkClientTrusted(X509Certificate[] c, String a) {}
	                public void checkServerTrusted(X509Certificate[] c, String a) {}
	            }
	        };
	        SSLContext sc = SSLContext.getInstance("SSL");
	        sc.init(null, trustAll, new java.security.SecureRandom());
	        javax.net.ssl.HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());
	    } catch (Exception e) {
	        System.err.println("SSL setup failed: " + e.getMessage());
	    }
	}
}

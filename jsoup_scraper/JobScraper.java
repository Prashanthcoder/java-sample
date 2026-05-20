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
	private static final String BASE_URL =  "https://www.timesjobs.com/candidate/job-search.html?searchType=personalizedSearch&from=submit&searchTextSrc=&searchTextText=&txtKeywords=java&txtLocation=";
	
	public List<Job> scrape() {
		List<Job> jobs = new ArrayList<Job>();
		try {
			disableSSLVerification();
		System.out.println("Connecting to TimeJobs...");
		
		Document doc = Jsoup.connect(BASE_URL)
				  .userAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 Chrome/120.0.0.0 Safari/537.36")
	                .header("Accept-Language", "en-US,en;q=0.9")
	                .header("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8")
	                .header("Connection", "keep-alive")
	                .ignoreHttpErrors(true)
	                .followRedirects(true)
	                .timeout(30000)
	                .get();
		
		Elements jobCards = doc.select("li.clearfix.job-bx.what-shd-bx");
		
		System.out.println("Job found "+jobCards.size()+" job listings\n");
		
		for(Element card : jobCards) {
			String title = card.select("h2 a").text().trim();
			String company = card.select("h3.joblist-comp-name").text().trim();
			String location = card.select("ul.top-jd-dtl li").text().trim();
			String salary = card.select("i.salary").text().trim();
			String url = card.select("h2 a").attr("href").trim();
			
			if(title.isEmpty()) continue;
			
			//default values
			
			if(salary.isEmpty()) salary = "Not disclosed";
			if(location.isEmpty()) location = "Not Specified";
			
			jobs.add(new Job(title, company, url, salary, location));
			
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

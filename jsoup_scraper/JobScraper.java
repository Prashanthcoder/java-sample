package com.prashanth.jsoup_scraper;

import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class JobScraper {
	private static final String BASE_URL =  "https://www.timesjobs.com/candidate/job-search.html?searchType=personalizedSearch&from=submit&searchTextSrc=&searchTextText=&txtKeywords=java&txtLocation=";
	
	public List<Job> scrape() throws Exception{
		List<Job> jobs = new ArrayList<Job>();
		
		System.out.println("Connecting to TimeJobs...");
		
		Document doc = Jsoup.connect(BASE_URL)
				.userAgent("Mozilla/5.0")
				.timeout(15000)
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
		return jobs;
	}
}

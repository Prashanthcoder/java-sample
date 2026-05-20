package com.prashanth.jsoup_scraper;

import java.util.List;

public class App{
	public static void main(String[] args) throws Exception {
		JobScraper scraper = new JobScraper();
		List<Job> jobs = scraper.scrape();
		
		if(jobs.isEmpty()) {
			System.out.println("No jobs found. Try again later.");
			return;
		}
		
		System.out.println(String.format("%-40s | %-25s | %-20s | %-15s",
		        "Title", "Company", "Location", "Salary"));
		System.out.println("-".repeat(90));
		jobs.forEach(System.out::println);
		
		CsvExporter exporter = new CsvExporter();
		String filename = exporter.generateFilename();
		exporter.export(jobs, filename);
		
		
		System.out.println("Successfull Jobs scraped: "+jobs.size());
	}
}
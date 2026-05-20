package com.prashanth.jsoup_scraper;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import com.opencsv.CSVWriter;

public class CsvExporter {
	public void export(List<Job> jobs, String filename) {
		try (CSVWriter writer = new CSVWriter(new FileWriter(filename))){
			
			String[] header = {"Title", "Company", "Location", "Salary", "URL"};
			writer.writeNext(header);
			
			//data rows
			
			for(Job job: jobs) {
				String[] rows = {
						job.getTitle(),job.getCompany(),job.getLocation(), job.getSalary(), job.getUrl()
						
				};
				writer.writeNext(rows);
			}
			
			System.out.println("CSV saved as : "+filename);
		}catch(IOException e) {
			System.err.println("Error saving the csv : "+e.getMessage());
		}
	}
	
	
	public String generateFilename() {
		String timestamp = LocalDateTime.now()
				.format(DateTimeFormatter.ofPattern("yyyy-MM-dd_HH-mm-ss"));
		return "java_jobs"+timestamp+".csv";
	}
}

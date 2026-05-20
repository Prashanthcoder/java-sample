package com.prashanth.jsoup_scraper;

public class Job {
	private String title;
	private String company;
	private String url;
	private String salary;
	private String location;
	
	public Job(String title, String company, String url, String salary, String location) {
		this.title = title;
		this.company = company;
		this.url = url;
		this.salary = salary;
		this.location = location;
	}
	
	public String getTitle() {
		return title;
	}
	public String getCompany() {
		return company;
		
	}
	public String getUrl() {
		return url;
	}
	public String getLocation() {
		return location;
	}
	public String getSalary() {
		return salary;
	}
	
	public String toString() {
		return String.format("%-40s | %-25s | %-20s |%5", title, company, location, salary);
	}
	
}

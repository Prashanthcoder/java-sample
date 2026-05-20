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
	
	@Override
	public String toString() {
	    return String.format("%-40s | %-25s | %-20s | %-15s",
	            title.length() > 40 ? title.substring(0, 37) + "..." : title,
	            company.length() > 25 ? company.substring(0, 22) + "..." : company,
	            location.length() > 20 ? location.substring(0, 17) + "..." : location,
	            salary);
	}
	
}

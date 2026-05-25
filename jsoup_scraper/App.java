package com.prashanth.jsoup_scraper;

import java.util.*;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("========================================");
        System.out.println("   Java Job Scraper — Multi Source     ");
        System.out.println("========================================\n");

        // 1. Scrape from multiple sources
        JobScraper wwrScraper = new JobScraper();
        RemoteOkScraper remoteOkScraper = new RemoteOkScraper();

        List<Job> allJobs = new ArrayList<>();
        allJobs.addAll(wwrScraper.scrape());
        allJobs.addAll(remoteOkScraper.scrape());

        if (allJobs.isEmpty()) {
            System.out.println("No jobs found. Try again later.");
            return;
        }

        // 2. Deduplicate by title + company
        List<Job> uniqueJobs = allJobs.stream()
                .collect(Collectors.collectingAndThen(
                        Collectors.toCollection(() -> new TreeSet<>(
                                Comparator.comparing(j -> (j.getTitle() + j.getCompany()).toLowerCase())
                        )),
                        ArrayList::new
                ));

        // 3. Print table
        System.out.println("\n" + String.format("%-40s | %-25s | %-20s | %-15s | %-15s",
                "Title", "Company", "Location", "Salary", "Source"));
        System.out.println("-".repeat(120));
        uniqueJobs.forEach(System.out::println);

        // 4. Summary report
        System.out.println("\n========== SUMMARY ==========");
        System.out.println("Total jobs scraped : " + allJobs.size());
        System.out.println("After deduplication: " + uniqueJobs.size());

        Map<String, Long> bySource = allJobs.stream()
                .collect(Collectors.groupingBy(Job::getSource, Collectors.counting()));
        bySource.forEach((source, count) ->
                System.out.println("  " + source + ": " + count + " jobs"));
        System.out.println("==============================\n");

        // 5. Export to CSV
        CsvExporter exporter = new CsvExporter();
        String filename = exporter.generateFilename();
        exporter.export(uniqueJobs, filename);
    }
}
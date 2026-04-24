package jobtracker;

import java.util.ArrayList;
import java.util.Scanner;

public class JobTrackerApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<JobTracker> tracker = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("1. Add Application\n 2. View Application\n 3. Seach by company\n 4. Exit");
			System.out.println("Enter your choice: ");
			int choice = sc.nextInt();
			sc.nextLine();
			switch(choice) {
			
			case 1:System.out.println("enter company : "); 
				String company = sc.nextLine();
				System.out.println("enter role: ");
				String role = sc.nextLine();
				System.out.println("enter status : ");
				String status = sc.nextLine();
				tracker.add(new JobTracker(company, role, status));
				break;
				
			case 2:
				if(tracker.isEmpty()) {
					System.out.println("No applications please add it");
					}else {
				System.out.println("Here are the Applications you applied for! ");
				for(JobTracker track: tracker) {
				  System.out.println(track);
			}
					}
			break;
			
			case 3: System.out.println("\nEnter company name to search: ");
				String searchCompany = sc.nextLine();
				boolean found=false;
				for(JobTracker jobs: tracker) {
					if(jobs.companyName.equalsIgnoreCase(searchCompany)) {
						System.out.println(jobs);
						found = true;
					}
				}
				if(!found) {
					System.out.println("No company with Name "+searchCompany);
				}
				break;
				
			case 4: return;
			default: System.out.println("please choose the right choice");
			}
		}
	}

}

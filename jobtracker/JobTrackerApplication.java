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
				System.out.println("Here are the Applications you applied for! ");
				for(int i =0;i<tracker.size();i++) {
				Object obj = tracker.get(i);
				  JobTracker jobTracker= (JobTracker)obj;
				  System.out.println(jobTracker);
			}
			break;
			
			case 3: 
			}
		}
	}

}

package jobtracker;

public class JobTracker {
	String companyName;
	String role;
	String status;
	JobTracker(String companyName, String role, String status){
		this.companyName = companyName;
		this.role = role;
		this.status = status;
	}
	
	public String toString() {
		return companyName+" "+role+" "+status;
	}
	
}

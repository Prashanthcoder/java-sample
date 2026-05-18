package dto;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Course{
	@Id
	private int courseId;
	private String courseName;
	private int duration;
	private double fees;
	@OneToMany(mappedBy = "course")
	private List<Registration> registrations;
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public double getFees() {
		return fees;
	}
	public void setFees(double fees) {
		this.fees = fees;
	}
	public List<Registration> getRegistration() {
		return registrations;
	}
	public void setRegistration(List<Registration> registrations) {
		this.registrations = registrations;
	}
}
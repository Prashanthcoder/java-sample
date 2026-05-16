package dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Course {
@Id
int courseid;
@Column
String courseName;
@Column
int Duration;
@Column
double Fees;
public int getCourseid() {
	return courseid;
}
public void setCourseid(int courseid) {
	this.courseid = courseid;
}
public String getCourseName() {
	return courseName;
}
public void setCourseName(String courseName) {
	this.courseName = courseName;
}
public int getDuration() {
	return Duration;
}
public void setDuration(int duration) {
	Duration = duration;
}
public double getFees() {
	return Fees;
}
public void setFees(double fees) {
	Fees = fees;
}
}

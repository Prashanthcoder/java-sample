package dto;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
@Entity
public class Registration {
	@Column
	int CourseId;
	@Column
	int StudId;
	@Column
	String doj;
	public int getCourseId() {
		return CourseId;
	}
	public void setCourseId(int courseId) {
		CourseId = courseId;
	}
	public int getStudId() {
		return StudId;
	}
	public void setStudId(int studId) {
		StudId = studId;
	}
	public String getDoj() {
		return doj;
	}
	public void setDoj(String doj) {
		this.doj = doj;
	}

}

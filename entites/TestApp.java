package TestApp;

import java.time.LocalDate;
import java.util.Date;

import dao.RegistrationDAO;
import dao.StudentDAO;
import dto.Course;
import dto.Registration;
import dto.Student;

public class TestApp {
	public static void main(String[] args) {
		Student student = new Student();
		student.setStuId(787);
		student.setFirstName("Ayyaleppa");
		student.setLastName("HB");
		student.setStreet("Lingsur");
		student.setCity("Raichur");
		student.setDob(LocalDate.parse("2003-07-14"));
		Course course = new Course();
		course.setCourseId(80);
		course.setCourseName("Java");
		course.setDuration(7);
		course.setFees(10000);
		StudentDAO dAO = new StudentDAO();
		System.out.println("student details updated");
//		dAO.saveStudent(student);
		System.out.println("course detials updated successfully");
		dAO.saveCourse(course);
		Registration r = new Registration();
		r.setStudent(student);
		r.setCourse(course);
		r.setDoj(LocalDate.parse("2026-03-26"));
		RegistrationDAO rdao = new RegistrationDAO();
		rdao.saveRegistration(r);
	}
	
}

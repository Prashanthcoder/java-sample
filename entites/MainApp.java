package TestApp;

import dao.RegistrationDAO;
import dto.Registration;

public class MainApp {
	public static void main(String[] args) {
		RegistrationDAO rdao = new RegistrationDAO();
		Registration r = rdao.getRegistration(1);
		System.out.println(r.getStudent().getFirstName());
	}
}

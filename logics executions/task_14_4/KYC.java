package task_14_4;

import java.util.Random;
public class KYC {
	int KYCID;
	String name;
	String Gender;
	
	 String GenerateId(String name, String Gender) {
		Random rand = new Random();
		this.name = name;
		this.Gender = Gender;
		this.KYCID = 100+rand.nextInt(899);
		if(Gender.toUpperCase().equals("MALE")) {
			String GID = KYCID+""+name.length()+Gender.substring(0,1).toUpperCase();
			return GID;
			
		}else if(Gender.toUpperCase().equals("FEMALE")) {
			String GID = KYCID+""+name.length()+Gender.substring(0,1).toUpperCase();
			return GID;
		}
		else {
			return KYCID+""+name.length()+Gender.substring(0,1).toUpperCase()+Gender.substring(1,3).toLowerCase();
		}
	}
}

class PhoneCheck 
{
static void check(boolean is_unlocked, int entered_pass, int correct_pass){
	if(is_unlocked){
		if(entered_pass == correct_pass){
			System.out.println("Password matched access granted");
		}else{
			System.out.println("Password mismatched access denied");
		}
	}
else{
	System.out.println("Phone is locked");
}
}
	public static void main(String[] args) 
	{
		check(false, 3881, 3423);
		check(true, 3881, 3881);
	}
}

class Auth 
{
void checkpass(String pass){
	if(pass.equals("admin")){
		System.out.println("Successful! logged in as Admin");
	}
}
	public static void main(String[] args) 
	{
		String pass = "admin";

	new Auth().checkpass(pass);
	}
}

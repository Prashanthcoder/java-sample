class Account 
{
static void bank(boolean has_account, int pin, int actual_pin){
	if(has_account){
		if(pin==actual_pin){
			System.out.println("You are allowed to withdraw amount");
		}else{
			System.out.println("Incorrect pin");
		}
	}else{
		System.out.println("No account found");
	}
}
	public static void main(String[] args) 
	{
		bank(true, 3881, 3881);
		bank(true, 3982, 3881);
		bank(false, 3433, 2343);
		bank(true, 9943, 9943);
	}
}

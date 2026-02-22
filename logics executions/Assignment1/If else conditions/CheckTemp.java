class CheckTemp 
{
static void SenseTemp(int temperature){
	if(temperature>30){
		System.out.println("Hot");
	}
else{
	System.out.print("cold\n");
}
}
	public static void main(String[] args) 
	{
		SenseTemp(34);
		SenseTemp(44);
		SenseTemp(14);
		SenseTemp(23);
	}
}

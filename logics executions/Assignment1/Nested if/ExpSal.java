class ExpSal 
{
static void CheckExp(int sal, int exp){
	if(sal>50000){
		if(exp>=5){
			System.out.println("Eligible to be a senior.");
		}else{
			System.out.println("More salary but less experience");
		}
	}else{
		System.out.println("salary is 50000 or less");
	}
}
	public static void main(String[] args) 
	{
		CheckExp(49579, 7);
CheckExp(70000, 3);
CheckExp(80000, 7);
CheckExp(40000, 2);
	}
}

class LevelSalaryClassification 
{
static void find(int salary){
	if(salary>=80000){
		System.out.println(salary+" is at Senior level");
	}else if(salary>=50000 && salary<80000){
		System.out.println(salary+ " is Mid Level");
	}else if(salary>=25000 && salary<50000){
		System.out.println(salary+" is Junior Level");
	}else {
		System.out.println(salary+" is Entry Level");
	}
}
	public static void main(String[] args) 
	{
		for (int i = 5000;i<=100000 ;i+=5000 )
		{
		find(i);
		}
	}
}

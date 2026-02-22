class LeapYear 
{
static void YearCheck(int year){
	if(year%4==0){
		if(year%100==0){
				if(year%400==0){
					System.out.println(year+ " Leap century year");
				}
	}else{
		System.out.println(year +" is a leap year");
	}
}
}
	public static void main(String[] args) 
	{
		for(int i=2000; i<=3000; i++){
			YearCheck(i);
		}
	}
}

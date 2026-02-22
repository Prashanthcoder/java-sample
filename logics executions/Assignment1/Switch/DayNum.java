class  DayNum
{
static void day(int ch){
	switch(ch){
		case 1: System.out.println("Sunday");
break;
case 2: System.out.println("Monday");
break;
case 3: System.out.println("Tuesday");
break;
case 4: System.out.println("Wednesday");
break;
case 5: System.out.println("Thurday");
break;
case 6: System.out.println("Friday");
break;
case 7: System.out.println("Saturday");
break;
default: System.out.println("Invalid choice");
	}
}
	public static void main(String[] args) 
	{
		for(int i=8; i>=1;i--)
		day(i);
	}
}

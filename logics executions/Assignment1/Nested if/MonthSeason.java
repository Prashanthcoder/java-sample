class  MonthSeason
{
static void day(int ch){
	switch(ch){
case 12:
	case 1:
	case 2:System.out.println("Winter");
break;
	case 3:
	case 4:
	case 5:System.out.println("Summer");
break;
	case 6:
	case 7:
	case 8:System.out.println("Rainy");
break;
	case 9:
	case 10:
	case 11:System.out.prinltn("Autumn");
break;
default: System.out.println("invalid choice");
	
	}
}
	public static void main(String[] args) 
	{
		for(int i=1;i<=12;i+=3)
		day(i);
	}
}

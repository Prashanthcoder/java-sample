class Temperature 
{
static void WeatherCheck(int temperature){
	if(temperature>=40){
		System.out.println(temperature+" is Very Hot");
	}else if(temperature>=30 && temperature<40){
		System.out.println(temperature+ " is Hot");
	}else if(temperature>=20 && temperature<30){
		System.out.println(temperature+ " is Warm");
	}else if(temperature>=10 && temperature<20){
		System.out.println(temperature+" is Cold");
	}else{
		System.out.println(temperature+ " is Very Cold");
	}
}
	public static void main(String[] args) 
	{
		for (int i = 5;i<=60 ;i+=3 )
		{
WeatherCheck(i);
		}
	}
}

class Discount 
{
void GetDiscount(int bill){
	if(bill>=5000){
		System.out.println(bill+" purchase has 20% discount!");
	}else if(bill<5000 && bill>=3000){
		System.out.println(bill+" purchase has 15% discount!");
	}else if(bill<3000 && bill>=1000){
		System.out.println(bill+" purchase has 10% discount!");
	}else{
		System.out.println("for "+bill+" purchase has no discount");
	}
}
	public static void main(String[] args) 
	{
		Discount ds = new Discount();
		for (int i=700;i<=6000 ;i+=250 )
		{
			ds.GetDiscount(i);
		}
	}
}

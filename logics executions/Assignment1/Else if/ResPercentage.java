//program to print result based on percentage
class  ResPercentage
{
void result(int per){
	if(per>=85){
		System.out.println(per+"% Distinction");
	}else if(per<85 && per>=60){
		System.out.println(per+"% First class");
	}else if(per>=35 && per<60){
		System.out.println(per+"% Passed");
	}else{
		System.out.println(per+"% Failed!");
	}
}
	public static void main(String[] args) 
	{
		ResPercentage rs = new ResPercentage();
		for(int i = 20; i<=100; i+=15)
			rs.result(i);
	}
}

class Voting 
{
static void VoteCheck(int age, String citizen){
	if(age>=18){
		System.out.println(age+" is Eligible to vote");
			if(citizen.equals("Indian")){
				System.out.println("since he is "+citizen+" allowed to vote in India.");
			}else{
				System.out.println("since he is "+citizen+" not allowed to vote in India.");
			}
	}
}
	public static void main(String[] args) 
	{
		VoteCheck(14, "Australian");
		VoteCheck(25, "Indian");
		VoteCheck(35, "Latina");
		VoteCheck(22, "American");

	}
}

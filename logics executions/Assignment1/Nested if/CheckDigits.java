//program to check whether a number is palindrome or not
class CheckDigits 
{
static void check_test(int n){
	if(n>99 && n<1000){
		//System.out.println(n+ " is a three digit number");
int rev=0, temp=n;
			while(n!=0){
			rev = rev*10 + n%10;
			n=n/10;
	}
			if(temp==rev){
				System.out.println(rev+ " is a palindrome");
			}/* else{
				System.out.println(rev+ " is not a palindrome");
			} */
}
else{
	System.out.println(n+ " is not a three digit numbers");
}
}
	public static void main(String[] args) 
	{
		for(int i = 98; i<=999; i++){
			check_test(i);
		}
	}
}

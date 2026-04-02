class Strong{

static int fact(int n){
int facto =1;
	for(int i = 1;i<=n;i++){
	facto = facto*i;
}
return facto;
}
	public static void main(String[] args){
	int n = 145, temp = n, original = n, sum=0;
	int digits=0;
	while(temp>0){
		temp/=10;
		digits++;	
	}

	temp=n;
	while(temp>0){
		int digit = temp%10;
		sum = sum+ fact(digit);
		temp/=10;
}
System.out.println(sum+" "+digits);
if(sum==original){
System.out.println("it is a what? strong number");
}
else{
System.out.println("it is bitch ass number ");
}
}
}
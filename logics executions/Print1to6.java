class Print1to6
{
static void printnum(int start, int end){
	for(int i=start; i<=end; i++)
{
	System.out.print(i+" ");
}
System.out.println();
}

static void printnumMid(int start, int end){
	for(int i=start; i<=end; i++){
		if(i<=end/2)
		System.out.print(i+" ");
	}
System.out.println();
}
static void PrintRev(int start, int end){
	for(int i=end; i>=start; i--){
		System.out.print(i+" ");
	}
System.out.println();
}

static void PrintRevMid(int start, int end){
		for(int i=end; i>=start; i--){
		if(i>end/2)
		System.out.print(i+" ");
}
System.out.println();
}
static void PrintEven(int start, int end){
	for(int i=start; i<=end; i++){
		if(i%2==0){
			System.out.print(i+" ");
		}
	}
System.out.println();
}
static void PrintOdd(int start, int end){
	for(int i=start; i<=end; i++){
		if(i%2!=0){
			System.out.print(i+" ");
		}
	}
System.out.println();
}
static void PrintEvenRev(int start, int end){
	for(int i = end; i>=start; i--){
		if(i%2==0){
			System.out.print(i+" ");
		}
	}
System.out.println();
}
static void PrintOddRev(int start, int end){
	for(int i= end; i>= start; i--){
		if(i%2!=0){
			System.out.print(i+" ");
		}
	}
System.out.println();
}

public static void main(String[] args){
	int start = 1, end = 6;
printnum(start, end);
printnumMid(start, end);
PrintRev(start, end);
PrintRevMid(start, end);
PrintEven(start, end);
PrintOdd(start, end);
PrintEvenRev(start, end);
PrintOddRev(start, end);
}
}
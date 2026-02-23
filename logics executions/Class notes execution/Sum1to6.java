//program to summation of the series of the numbers different methods

class Sum1to6
{
static void Eval1to6(int start, int end){
int sum=0;
	for(int i=start; i<=end; i++){
		sum+=i;
if(i<end){
		System.out.print(i+"+");
			}else{
				System.out.print(i+"=");
			}
	}
System.out.println(sum);
}

static void EvalMid(int start, int end){
	int sum=0;
for(int i=start; i<=end; i++)
{
	if(i<=end/2){
		sum+=i;
if(i<end/2){
		System.out.print(i+"+");
			}else{
				System.out.print(i+"=");
			}
	}
}
System.out.println(sum);
}

static void EvalLastMid(int start, int end){
	int sum=0;
for(int i=start; i<=end;i++)
{
	if(i>end/2){
		sum+=i;
		if(i<end){
		System.out.print(i+"+");
			}else{
				System.out.print(i+"=");
			}
	}
}
System.out.println(sum);
}

static void EvalOdd(int start, int end){
	int sum=0;
for(int i = start; i<=end; i++)
{
	if(i%2!=0){
		sum+=i;
		if(i<end-1){
		System.out.print(i+"+");
			}else{
				System.out.print(i+"=");
			}
	}
}
System.out.println(sum);
}

static void EvalEven(int start, int end){
	int sum=0;
for(int i=start; i<=end; i++)
{
	if(i%2==0){
		sum+=i;
if(i<end){
		System.out.print(i+"+");
			}else{
				System.out.print(i+"=");
			}

	}
}
System.out.println(sum);
}

public static void main(String[] args){
	int start = 1, end = 20;
Eval1to6(start, end);
EvalMid(start, end);
EvalLastMid(start, end);
EvalEven(start, end);
EvalOdd(start, end);

}
}
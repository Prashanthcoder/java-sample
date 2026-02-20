class Prod1to6
{
void EvalRev(int start, int end){
	int res = 1;
	for(int i = end; i>=start;i--){
		res = res*i;
		if(i>start){
			System.out.print(i+"x");
		}else{
			System.out.print(i+"=");
		}
	}
System.out.println(res);
}

void EvalRevMid(int start, int end){
	int res =1;
	for(int i = end; i>=start; i--){
		if(i<=(end/2)){
		res = res*i;
		if(i>start){
		System.out.print(i+"x");
		}else{
			System.out.print(i+"=");
		}
	}
}
System.out.println(res);
}

void EvalLastMid(int start, int end){
	int res =1;
for(int i = end; i>=start; i--){
	if(i>end/2){
		res=res*i;
		if(i>(end/2)+1){
			System.out.print(i+"x");

		
	}else{
		System.out.print(i+"=");
	}
}
}
System.out.println(res);
}

public static void main(String[] args){
	int start = 1, end = 10;

Prod1to6 p = new Prod1to6();
p.EvalRev(start, end);
p.EvalRevMid(start, end);
p.EvalLastMid(start, end);
}
}
class Practice1
{
void SwapWithTemp(int a, int b){
	int temp = a;
b = a;
a = temp;

System.out.println("the values after swapped : a = "+ a+ " b = "+b);
}
void SwapWithoutTemp(int a, int b){
	a = a+b;
	b = a-b;
	a = a-b;
System.out.println("the values after swapped : a = "+ a+ " b = "+b);
}
public static void main(String[] args){
	Practice1 p = new Practice1();
p.SwapWithTemp(34, 98);
p.SwapWithoutTemp(344, 9834);
}
}
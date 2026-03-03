class Multiplication
{
void product(){
	System.out.println("this method is to product start");
}
void product(int a, int b){
	System.out.println(a*b);
}
void product(int a, double b){
	System.out.println(a*b);
}
void product(double a, double b){
	System.out.println(a*b);
}
public static void main(String[] args){
	Multiplication m = new Multiplication();
m.product();
m.product(12, 44);
m.product(34, 87.343);
m.product(23.5, 23.445);
}
}
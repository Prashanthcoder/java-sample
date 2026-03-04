class Addition
{
void add(int a, int b){
	System.out.println(a+b);
}
void add(double a , int b){
	System.out.println(a+b);
}
void add(double a, double b){
	System.out.println(a+b);
}
void add(int a, double b){
	System.out.println(a+b);
}
public static void main(String[] args){
Addition a = new Addition();
	a.add(5, 23);
a.add(5.5, 12);
a.add(23.5, 9.5);
a.add(5, 99.25);
}
}



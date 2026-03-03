class CalculateArea
{
void area(int radius){
	System.out.println("The area of circle : "+(3.14*radius*radius));
}
void area(int l, int b){
	System.out.println("The area of rectangle : "+(l*b));
}
void area(int b, double h){
	System.out.println("The area of parallelogram : "+(b*h));
}
void area(double side){
	System.out.println("the area of the square : "+(side*side));
}
	

public static void main(String[] args){
CalculateArea a = new CalculateArea();
	a.area(5, 4);
a.area(7);
a.area(5, 6.5);
a.area(12.0);
}

}
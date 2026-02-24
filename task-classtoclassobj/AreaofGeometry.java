//program to access from one class to another class with no parameter and no return type
class Sample1{
void Circle(){
	final double pi = 3.142;
	double r = 7.0;
	double area = pi*r*r;
	System.out.println(area);
}	
void Square(){
	double side = 4.0;
	double area = side*side;
	System.out.println(area);
}
void RectangleA(){
	double l = 7.9;
	double b = 3.5;
	double area = l*b;
	System.out.println(area);
}
void Triangle(){
	double b = 7.3;
	double h = 10;
	double area = 0.5*b*h;
	System.out.println(area);
}
void Ellipse(){
	double a = 4.0;
	double b = 4.0;
	final double pi = 3.14;
	double area = pi*a*b;
	System.out.println(area);
}
void Trapezoid(){
	double a = 4.3;
	double b = 34;
	double h = 10;
	double area = 0.5*(a+b)*h;
System.out.println(area);
}
void parallelogram(){
	double b = 6.8;
	double h = 7.9;
	double area = b*h;
	System.out.println(area);
}
void Sector(){
	double r = 4.0;
	double theta = 3.14/4;
	double area = 0.5*r*r*theta;
}
}

class AreaofGeometry
{

public static void main(String[] args){
Sample1 Sample = new Sample1();
Sample.Circle();
Sample.Square();
Sample.Triangle();
Sample.RectangleA();
Sample.Ellipse();
Sample.Trapezoid();
Sample.Sector();
Sample.parallelogram();	
}
}
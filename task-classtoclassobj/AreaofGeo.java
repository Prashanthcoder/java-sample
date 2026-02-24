class Sample2
{
void Circle(double r){
	final double pi = 3.142;
	double area = pi*r*r;
	System.out.println(area);
}
void Square(int side){
	double area = side*side;
	System.out.println(area);
}
void RectangleA(double l, double b){
	double area = l*b;
	System.out.println(area);
}
void Triangle(double b, double h){
double area = 0.5*b*h;
System.out.println(area);
}
void Ellipse(double a , double b){
final double pi = 3.142;
double area = pi*a*b;
System.out.println(area);
}
void Sector(double r, double theta){
	double area = 0.5*r*r*theta;
	System.out.println(area);
}
void parallelogram(double b, double h){
double area = b*h;
System.out.println(area);
}
void Trapezoid(double a, double b, double h){
	double area = 0.5*(a+b)*h;
	System.out.println(area);
}}
class AreaofGeo
{
public static void main(String[] args){
	Sample2 s = new Sample2();
	s.Circle(7.9);
s.Square(14);
s.RectangleA(2.3, 4.5);
s.Triangle(4.5, 34.0);
s.Ellipse(23.5, 10.5);
s.Sector(7.0, 3.142/4);
s.parallelogram(34, 25);
s.Trapezoid(2.4, 5.0, 7.0);
}
}
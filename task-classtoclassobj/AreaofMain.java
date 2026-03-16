class Sample3
{
double Circle(double r){
	return 3.142*r*r;
}
double Square(double side){
	return side*side;
}
double RectangleA(double l, double b){
	return l*b;
}
double Triangle(double b, double h){
	return 0.5*b*h;
}
double Ellipse(double a, double b){
	return 3.142*a*b;
}
double parallelogram(double b, double h){
	return b*h;
}
double Sector(double r, double theta){
	return 3.142*r*r*theta;
}
double Trapezoid(double a, double b, double h){
	return 0.5*(a+b)*h;
}
}
class Areaof
{
public static void main(String[] args){
	Sample3 s = new Sample3();
System.out.println(s.Circle(6.0));
System.out.println(s.Square(6.0));
System.out.println(s.RectangleA(6.0, 7.0));
System.out.println(s.Triangle(6.0, 3.5));
System.out.println(s.Ellipse(6.0, 3.5));
System.out.println(s.parallelogram(6.0, 10));
System.out.println(s.Sector(6.0, 3.14/2));
System.out.println(s.Trapezoid(6.0, 2, 5));
}
}
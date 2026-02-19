class Sample
{
static void AreaofSquare(int s){
int area = s*s;
System.out.println(area);	
}
static void AreaofRectangle(int l, int b){
	int area = l*b;
	System.out.println(area);
}
static void AreaofTriangle(int b, int h){
	double area = 0.5*b*h;
	System.out.println(area);
}
static void AreaofParallelogram(int b, int h){
	int area = b*h;
	System.out.println(area);
}
static void AreaofTrapezoid(int a, int b, int h){
	double area = 0.5*(a+b)*h;
System.out.println(area);
}
static void AreaofEllipse(int a, int b){
	double pi = 3.1428;
	double area = pi*a*b;
	System.out.println(area);
}
static void AreaofCircle(double r){
	double pi= 3.1428;
	double area = pi*r*r;
System.out.println(area);
}
static void AreaofSector(double r, double theta){
	double area = 0.5*r*r*theta;
System.out.println(area);
}
}

class Areaof
{
public static void main(String[] args){
System.out.println("Program to find the area of geometry using the parameters but no return type");
	Sample.AreaofCircle(7.0);
Sample.AreaofParallelogram(2, 3);
Sample.AreaofSector(7.0, 3.1428);
Sample.AreaofSquare(5);
Sample.AreaofRectangle(4, 3);
Sample.AreaofTriangle(7, 2);
Sample.AreaofTrapezoid(1, 8, 3);
Sample.AreaofEllipse(3, 7);
}
}
class Sample1
{
static int AreaofSquare(int s){
	return s*s;	
}
static int AreaofRectangle(int l, int b){
	return l*b;
}
static double AreaofTriangle(int b, int h){
	return 0.5*b*h;
}
static int AreaofParallelogram(int b, int h){
	return b*h;
}
static double AreaofTrapezoid(int a, int b, int h){
	return 0.5*(a+b)*h;
}
static double AreaofEllipse(int a, int b){
	double pi = 3.1428;
	return pi*a*b;
}
static double AreaofCircle(double r){
	double pi= 3.1428;
	return pi*r*r;
}
static double AreaofSector(double r, double theta){
	double area = 0.5*r*r*theta;
	return area;
}
}

class AreaofGeo
{
public static void main(String[] args){
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
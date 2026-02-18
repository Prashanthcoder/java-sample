class Sample
{
static void AreaofSquare(){
int s = 5;
int area = s*s;
System.out.println(area);	
}
static void AreaofRectangle(){
	int l = 3;
	int b = 5;
	int area = l*b;
	System.out.println(area);
}
static void AreaofTriangle(){
	int b = 5;
	int h = 8;
	double area = 0.5*b*h;
	System.out.println(area);
}
static void AreaofParallelogram(){
	int b =3;
	int h=5;
	int area = b*h;
	System.out.println(area);
}
static void AreaofTrapezoid(){
	int a = 8;
	int b= 9;
	int h = 6;
	double area = 0.5*(a+b)*h;
System.out.println(area);
}
static void AreaofEllipse(){
	int a = 8;
	int b = 3;
	double pi = 3.1428;
	double area = pi*a*b;
	System.out.println(area);
}
static void AreaofCircle(){
	double pi= 3.1428;
	double r = 7.0;
	double area = pi*r*r;
System.out.println(area);
}
static void AreaofSector(){
	double r = 7.0;
	double theta = 3.142;
	double area = 0.5*r*r*theta;
System.out.println(area);
}
}

class Demo
{
public static void main(String[] args){
	Sample.AreaofCircle();
Sample.AreaofParallelogram();
Sample.AreaofSector();
Sample.AreaofSquare();
Sample.AreaofRectangle();
Sample.AreaofTriangle();
Sample.AreaofTrapezoid();
Sample.AreaofEllipse();
}
}
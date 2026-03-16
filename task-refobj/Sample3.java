class Sample3
{
 void AreaofSquare(){
int s = 5;
int area = s*s;
System.out.println(area);	
}
 void AreaofRectangle(){
	int l = 3;
	int b = 5;
	int area = l*b;
	System.out.println(area);
}
 void AreaofTriangle(){
	int b = 5;
	int h = 8;
	double area = 0.5*b*h;
	System.out.println(area);
}
 void AreaofParallelogram(){
	int b =3;
	int h=5;
	int area = b*h;
	System.out.println(area);
}
 void AreaofTrapezoid(){
	int a = 8;
	int b= 9;
	int h = 6;
	double area = 0.5*(a+b)*h;
System.out.println(area);
}
 void AreaofEllipse(){
	int a = 8;
	int b = 3;
	double pi = 3.1428;
	double area = pi*a*b;
	System.out.println(area);
}
 void AreaofCircle(){
	double pi= 3.1428;
	double r = 7.0;
	double area = pi*r*r;
System.out.println(area);
}
 void AreaofSector(){
	double r = 7.0;
	double theta = 3.142;
	double area = 0.5*r*r*theta;
System.out.println(area);
}

public static void main(String[] args){
System.out.println("The program to find areas with only methods no parameters and no return type");
Sample3 Sample = new Sample3();
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

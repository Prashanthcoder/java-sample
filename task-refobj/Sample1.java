class Sample1
{
 int AreaofSquare(int s){
	return s*s;	
}
 int AreaofRectangle(int l, int b){
	return l*b;
}
 double AreaofTriangle(int b, int h){
	return 0.5*b*h;
}
 int AreaofParallelogram(int b, int h){
	return b*h;
}
 double AreaofTrapezoid(int a, int b, int h){
	return 0.5*(a+b)*h;
}
 double AreaofEllipse(int a, int b){
	double pi = 3.1428;
	return pi*a*b;
}
 double AreaofCircle(double r){
	double pi= 3.1428;
	return pi*r*r;
}
 double AreaofSector(double r, double theta){
	double area = 0.5*r*r*theta;
	return area;
}

public static void main(String[] args){
System.out.println("The program to find the area using parameters and return type");
Sample1 Sample = new Sample1();
System.out.println(Sample.AreaofCircle(7.0));
System.out.println(Sample.AreaofParallelogram(2, 3));
System.out.println(Sample.AreaofSector(7.0, 3.1428));
System.out.println(Sample.AreaofSquare(5));
System.out.println(Sample.AreaofRectangle(4, 3));
System.out.println(Sample.AreaofTriangle(7, 2));
System.out.println(Sample.AreaofTrapezoid(1, 8, 3));
System.out.println(Sample.AreaofEllipse(3, 7));
}
}
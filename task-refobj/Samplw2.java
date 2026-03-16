class Samplw2
{
 void AreaofSquare(int s){
	System.out.println(s*s);	
}
 void AreaofRectangle(int l, int b){
	System.out.println(l*b);
}
 void AreaofTriangle(int b, int h){
	System.out.println(0.5*b*h);
}
 void AreaofParallelogram(int b, int h){
	System.out.println(b*h);
}
 void AreaofTrapezoid(int a, int b, int h){
	System.out.println(0.5*(a+b)*h);
}
 void AreaofEllipse(int a, int b){
	double pi = 3.1428;
	System.out.println(pi*a*b);
}
 void AreaofCircle(double r){
	double pi= 3.1428;
	System.out.println(pi*r*r);
}
 void AreaofSector(double r, double theta){
	double area = 0.5*r*r*theta;
	System.out.println(area);

}
public static void main(String[] args){
System.out.println("The program to find the area using parameters and return type");
Samplw2 Sample = new Samplw2();
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

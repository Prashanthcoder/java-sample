class Sample{
void AreaofCircle(double r){
	double area = 3.1423*r*r;
	System.out.println("The area of the circle is "+ area);
}
void AreaofRectangle(double l, double b){
	double area = l*b;
	System.out.println("The area of the rectangle is "+area);

}
void AreaofTriangle(double b, double h){
	double area = 0.5*b*h;
	System.out.println("The area of the Triangle is "+area);
}
void AreaofSquare(double s){
	double area = s*s;
	System.out.println("The area of the square is "+area);

}
void AreaofParallelogram(double b, double h){
	double area = b*h;
	System.out.println("The area of the parallelogram is "+area);
}
void AreaofTrapezoid(double a, double b, double h){
	double area = 0.5*(a+b)*h;
	System.out.println("The area of the Trapezoid is "+area);
}
void AreaofEllipse(double a, double b){
	double area = 3.1428*a*b;
	System.out.println("The area of the ellipse is"+ area);
}
void AreaofSector(double r, double theta){
	double area = 0.5*r*r*theta;
	System.out.println("The area of the sector of the radian pi/4 is "+ area);
}

public static void main(String[] args){
	new Sample().AreaofCircle(7.0);
	new Sample().AreaofRectangle(8.0, 3.0);
	new Sample().AreaofTriangle(3.5, 7);
	new Sample().AreaofSquare(4);
	new Sample().AreaofParallelogram(3.0, 52.0);
	new Sample().AreaofTrapezoid(3.2, 5.8, 3.0);
	new Sample().AreaofEllipse(5.5, 2.5);
	new Sample().AreaofSector(7.0, 3.1428/4);
}
}
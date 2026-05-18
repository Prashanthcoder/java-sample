class UsingReturn
{
	public static void main(String[] args) 
	{
		System.out.println("The area of the circle is "+ Acircle(7.0));
	System.out.println("The area of the triangle is " + ATriangle(5.0, 7.0));
	System.out.println("The area of the rectangle is " + ARectangle(11.0, 5.5));
	System.out.println("The area of the Sector where the radian theta is pi/4 "+ASector(7.0, 3.1428/4));
	System.out.println("The area of the parallelogram is "+AParallelogram(20, 7));
	System.out.println("The area of the Trapezoid is " +ATrapezoid(7.0, 5.0, 23.5));
	System.out.println("The area of the Square is "+Asquare(8.0)); 
}
	

	static double Acircle(double r){
		return 3.142*r*r;
	}
	static double Asquare(double side){
		return side*side;
	}
	static double ARectangle(double l, double b){
		return l*b;
	}
	static double ASector(double r, double radians){
		return 0.5*r*r*radians;
	}
	static double ATriangle(double b, double h){
		return 0.5*b*h;
	}
	static double ATrapezoid(double a, double b, double h){
		return 0.5*(a+b)*h;
	}
	static double AParallelogram(double a, double b){
		return 3.14*a*b;
	}
}

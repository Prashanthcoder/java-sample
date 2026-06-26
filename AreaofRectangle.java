import java.util.Scanner;

class AreaofRectangle
{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		AreaofRectangle ar = new AreaofRectangle();
		System.out.println("Enter the length and breadth of rectangle ");
		double l = sc.nextDouble();
		double b = sc.nextDouble();
		double area = ar.areaofRectangle(l, b);
		System.out.println("the area of the rectangle : "+area+"cm^2");
	}
	double areaofRectangle(double l, double b){
		return l*b;
	}
}
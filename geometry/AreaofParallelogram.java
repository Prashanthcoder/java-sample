import java.util.Scanner;
class AreaofParallelogram
{
	double breadth;
	double height;
	double areaofParallelo(double b, double h){
		return b*h;
	}
		
		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			AreaofParallelogram ap = new AreaofParallelogram();
			System.out.println("Enter the breadth and height of the parallelogram ");
			ap.breadth = sc.nextDouble();
			ap.height = sc.nextDouble();
			double area = ap.areaofParallelo(ap.breadth, ap.height);
			System.out.println("The area of parallelogram : "+area+"units square");
			}
		
}
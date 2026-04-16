package interfaceprograms;

interface Circle{
	void area();
}

public class Lambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1 = ()->{
			int r = 7;
			final double pi = 3.142;
			double Area = pi*r*r;
			System.out.println("area of circle "+r+" is "+Area);
		};
		c1.area();
	}

}

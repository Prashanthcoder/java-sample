class AreaofTrapezium
{
	public static void main(String[] args){
	AreaofTrapezium at = new AreaofTrapezium();
	System.out.println(at.AreaofTrap());
	}
	
	double AreaofTrap(){
		int a = 5, b=6, h= 28;
		double area = ((a+b)/2.0)*h;
		return area;
	}
}
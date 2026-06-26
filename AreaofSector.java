class AreaofSector 
{
	public static void main(String[] args) 
	{
		System.out.println(AreaofSec());
	}
	
	public static double AreaofSec(){
	double r = 7.0;
	double pi = 3.1428;
	double theta = pi/4;
	double area = 0.5*r*r*theta;
	return area;
	}
}

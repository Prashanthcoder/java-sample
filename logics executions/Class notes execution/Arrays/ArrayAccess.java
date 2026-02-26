import java.util.*;
class ArrayAccess
{
void AreaofCircle(int r){
	final double pi = 3.1428;
	double area = pi*r*r;
	System.out.println("The area of circle for r = "+r+" is "+area+" Square units");
}

public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	ArrayAccess ac = new ArrayAccess();
	
	System.out.println("Enter the size of array ");
	int size = sc.nextInt();
	int[] a = new int[size];
	System.out.println("Enter the radiuses: ");
	for(int i = 0;i<size;i++){
	System.out.print("radius "+(i+1)+" : ");
		a[i] = sc.nextInt();
	}
	for(int i=0;i<size;i++){
		ac.AreaofCircle(a[i]);
	}
}
}
class Tester
{
int r = 34;
}
class Tista extends Tester
{
void uliya(){
	System.out.println("it is uliya..........");
}
}
class MainClass2
{
public static void main(String[] args){
	Tester t1 = new Tista();
	System.out.println("******upcasting********");
	System.out.println(t1.r);
	System.out.println("**********downcasting********");
	Tista ti =(Tista)t1;
	System.out.println(ti.r);
    ti.uliya();
}
}
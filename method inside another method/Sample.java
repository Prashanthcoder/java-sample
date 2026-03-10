//static methods within classes but method inside another method
class Sample
{
static void disp1(){
	System.out.println("it is disp1..");
}
static void disp2(){
	System.out.println("it is disp2..");
disp1();
}
static void disp3(){
	System.out.println("it is disp3..");
disp2();
}
static void disp4(){
	System.out.println("it is disp4..");
disp3();
}
public static void main(String[] args){
	disp4();
}
}
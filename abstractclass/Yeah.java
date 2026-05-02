package equalsOverride;

//practice lambda expression

interface functional{
	void send();
}
public class Yeah {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		functional f1 = ()-> System.out.println("This is from the lambda expressions");
		f1.send();
	}

}

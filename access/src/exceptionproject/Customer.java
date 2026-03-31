package assignment;

class OutofStock extends Exception{
private	String msg;
	OutofStock(String msg){
		this.msg = msg;
	}
	
	public String getmsg() {
		return msg;
	}
}
class Flipkart{
	static void order(int N) throws OutofStock{
		if(N>0 && N<5) {
			System.out.println("Order successfully for "+N+" orders");
		}else {
			throw  new OutofStock("Out of Stock for "+N+" orders");
		}
	}
}
public class Customer {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			try {
				Flipkart.order(4);
				Flipkart.order(10);
			}catch(OutofStock o) {
				System.out.println(o.getmsg());
			}
	}

}

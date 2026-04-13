package constructoroverloading;


class Players{
	String p_name;
	int id;
	String premium;
	
	Players(){
		this.p_name = "unknown";
		this.id = 0;
		this.premium = "bot";
	}
	Players(String p_name, int id){
		this.p_name = p_name;
		this.id = id;
		this.premium = "regular";
	}
	Players(String p_name, int id, String premium){
		this.p_name = p_name;
		this.id = id;
		this.premium = premium;
	}
	public String toString() {
		return this.p_name+" "+this.id+" "+this.premium;
	}
}
public class ConstructorOverload {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Players p1 = new Players();
		Players p2 = new Players("Prashanth", 75);
		Players p3 = new Players("Prajwal", 78, "premium++");
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
	}

}

package encap;

 class Simp {
	 private int pwd;
	 public void setPwd(int pwd) {
		 this.pwd= pwd;
		 }
	 public int getPwd() {
		 return pwd;
	 }
}
 public class Capping{
	 public static void main(String[] args) {
		Simp s = new Simp();
		s.setPwd(1234);
		System.out.println(s.getPwd());
	}
 }

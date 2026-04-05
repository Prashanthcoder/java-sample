package problemsqspider;

public class Palindrome {
	static void test(String str) {
		String rev="";
		for(int i = str.length()-1;i>=0;i--) {
			rev = rev + str.charAt(i);
		}
		
		if(rev.equals(str)) {
			System.out.println("It is a palindrome");
		}else {
			System.out.println("It is not a palindrome");
		}
	}
	
}

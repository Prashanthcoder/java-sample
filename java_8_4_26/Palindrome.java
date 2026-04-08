package java_8_4_26;

public class Palindrome {
	static boolean PalindromeWithInBuilt(String str) {
		String rev = "";
		for(int i = str.length()-1;i>=0;i--) {
			rev = rev+str.charAt(i);
		}
		if(str.equals(rev)) {
			return true;
		}
		return false;
	}
	
	static boolean PalindromeWithoutBuiltIn(String str) {
		char[] s = str.toCharArray();
		int i =0, j = s.length-1;
		while(i<j) {
			if(s[i]!=s[j]) {
				return false;
			}
			i++;
			j--;
		}
		return true;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "malayalam";
		if(PalindromeWithInBuilt(str)) {
			System.out.println(str+" is a palindrome");
		}else {
			System.out.println(str + "is not a palindrome");
		}
		String str1 = "hello";
		System.out.println(PalindromeWithoutBuiltIn(str1)?str1+" is palindrome ":str1+" is not a palindrome");
	}

}

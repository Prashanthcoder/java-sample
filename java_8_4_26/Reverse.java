package java_8_4_26;

public class Reverse {
	static String revWithInBuilt(String str) {
		String rev = "";
		for(int i = str.length()-1;i>=0;i--) {
			rev = rev+str.charAt(i);
		}
		return rev;
	}
	
	static String revWithoutBuiltIn(String str) {
		char[] s = str.toCharArray();
		int i =0, j = s.length-1;
		while(i<j) {
			char temp = s[i];
			s[i] = s[j];
			s[j] = temp;
			i++;
			j--;
		}
		return new String(s);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("with inbuilt : "+revWithInBuilt("java"));
		System.out.println("without inbuilt : "+revWithoutBuiltIn("mava"));
	}

}

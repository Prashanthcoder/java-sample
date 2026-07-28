package Strings;

public class Reverse {
	
	private static String reverseOnlyLetters(String str) {
		int i = 0, j = str.length()-1;
		char[] ch = str.toCharArray();
		
		while(i<j) {
			if(ch[i]==' ') i++;
			if(ch[j]==' ') j--;
			if(ch[i]!=' ' && ch[j]!=' ') {
				char temp = ch[i];
				ch[i] = ch[j];
				ch[j] = temp;
				i++;
				j--;
			}
		}
		
		return new String(ch);
	}
	
	public static void main(String args[]) {
		String test = "I am Hi";
		System.out.println(reverseOnlyLetters(test));
	}

}

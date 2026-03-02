
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//let me try to just do the check palindrome using none
		String str = "java";
		char[] ch = str.toCharArray();
		int i=0, j= ch.length-1;
		while(i<j) {
			
			char temp = ch[i];
			ch[i] = ch[j];
			ch[j] = temp;
			i++;
			j--;
			
		}
		System.out.println(ch);
	}

}

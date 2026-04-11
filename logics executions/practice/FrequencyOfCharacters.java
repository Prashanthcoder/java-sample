package assignment7_4_26;

public class FrequencyOfCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "aabbbcdjkldcadjks";
		int[] ch = new int[127];
		for(int i =0;i<str.length();i++) {
//			System.out.println(str.charAt(i));
			int s = str.charAt(i);
			ch[s]++;
		}
		for(int i =0;i<ch.length;i++) {
			if(ch[i]>0)
			System.out.println("the character "+(char)i + " length is "+ch[i]);
		}
		
	}

}

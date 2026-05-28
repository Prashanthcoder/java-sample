package classtask_2805;

public class ThirdLastConsonant {
	static void last3Consonant(String str) {
		String c_str = str.replaceAll("[aeiouAeiou]", "");
		System.out.println(c_str.charAt(c_str.length()-3));
	}
	public static void main(String[] args) {
		String str = "asdfguihj";
		String str1 = "hijk";
		last3Consonant(str);
		last3Consonant(str1);
		
		}
}

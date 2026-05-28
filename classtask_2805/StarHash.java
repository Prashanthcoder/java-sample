package classtask_2805;

public class StarHash {
	public static int starHashBalance(String str) {
		if(str.isEmpty()) return 0;
		int starCount = 0;
		int hashCount = 0;
		for(int i = 0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(ch == '*') {
				starCount++;
			}else if(ch=='#') {
				hashCount++;
			}
		}
		return starCount - hashCount;
		
	}
	public static void main(String[] args) {
		String str = "***###";
		String str1 = "****###";
		String str2 = "**####";
		System.out.println(str+ " "+ starHashBalance(str));
		System.out.println(str1+ " "+ starHashBalance(str1));
		System.out.println(str2+ " "+ starHashBalance(str2));

	}
}

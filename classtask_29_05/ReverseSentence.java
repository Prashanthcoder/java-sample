package classtask_29_05;

public class ReverseSentence {
	public static void reverse(String str) {
		char[] ch = str.toCharArray();
		int i =0, j = ch.length-1;
		for(char c: ch) {
			System.out.print(c+ " "+(int)c+" ");
		}
		while(i<j) {
			if(ch[i]== ' ' || ch[j]== ' ') {
				continue;
			}else {
				char temp = ch[i];
				ch[i] = ch[j];
				ch[j] = temp;
				
			}
		
		}
		System.out.println(new String(ch));
	}
	public static void task(String str) {
		char[] ch = str.toCharArray();
		char[] res = new char[str.length()];
		int[] pos = new int[str.replaceAll("^ ", "").length()];
		int p = 0;
		for(int i = ch.length-1;i>=0;i--) {
			if(ch[i]==' ') {
				pos[p] = i;  
			}
		}
		int j = 0, k = 0;
		for(int i = ch.length-1;i>=0;i--) {
			if(ch[i]!=' ') {
			res[j] = ch[i]; 
			j++;
		}else {
			if(i == pos[k]) {
			res[j] = ' ';
			j++;
			k++;
		}}
		}
		System.out.println(new String(res));
	}
	public static void main(String[] args) {
		String str = "I LOVE INDIA";
		String str1 = "Hello Sir";
		String new_str = str1.replaceAll("[A-Z, ]", "");
		System.out.println(new_str.length());
//		reverse(str);
		task(str);
	}
}
// input: I LOVE INDIA
// output: A IDNI EVOLI


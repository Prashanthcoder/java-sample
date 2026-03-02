
public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String str = "malayalam";
			char ch[] = str.toCharArray();
			int i=0, j=ch.length-1;
			int flag=0;
			while(i<j) {
				if(ch[i]==ch[j]) {
					i++;
					j--;
					flag = 1;
				}else {
				System.out.println("It is not a palindrom. ");
				flag = 0;
				break;
				}
			}
			if(flag==1) {
				System.out.println("It is a palindrome");
			}
	}

}

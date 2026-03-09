import java.util.*;

class Frequency
{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("enter the string to check frequency");
	String str = sc.nextLine();
	int[] a = new int[127];
for(int i = 0;i<str.length();i++){
	char ch = str.charAt(i);
	a[ch]++;
}
for(int i = 0; i<a.length;i++){
	if(a[i]!=0){
		System.out.println((char)i+" "+a[i]);
	}
}
}
}

import java.util.*;

class ScanMethod
{
static void checkPalindrom(String str){
	String rev = "";
	for(int i = str.length()-1 ; i>=0; i--){
		rev = rev+ str.charAt(i);
	}
System.out.println(str.equals(rev)?"Palindrome":"Not a palindrome");
}


public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
System.out.println("enter the value to check palindrome");
String str = sc.nextLine();
checkPalindrom(str);
}
}
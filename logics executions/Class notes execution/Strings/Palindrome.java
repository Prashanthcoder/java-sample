import java.util.*;
class Palindrome
{
void checkPalindrom(String str){
	String rev = "";
	for(int i= str.length()-1; i>=0; i--){
		rev = rev + str.charAt(i);
	}
System.out.println(str.equals(rev)?" "+str+ " is Palindrome ":" "+str+" is not a palindrom");
}
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
	Palindrome pd = new Palindrome();
while(true){
System.out.println("Enter the string check its palindrom : ");
String str = sc.nextLine();
pd.checkPalindrom(str);
}
}
}
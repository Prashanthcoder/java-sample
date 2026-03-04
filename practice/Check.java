class Check
{
void palindrome(String str){
	String rev = "";
	for(int i = str.length()-1; i>=0; i--){
		rev = rev + str.charAt(i);
	}
System.out.println(str.equals(rev)?"Palindrome": "Not a palindrome");
}
public static void main(String[] args){
	Check c = new Check();
c.palindrome("madam");	
}
}
import java.util.*;

class Reverse
{
String straight(String str){
	String res="";
	for(int i = 0;i<str.length();i++){
		res = res + str.charAt(i);
	}
return res;
}

String reverse(String str){
	String res="";
for(int i=str.length()-1;i>=0;i--){
	res = res + str.charAt(i);
}

return res;
}
public static void main(String[] args){
	Reverse r1 = new Reverse();
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the string to reverse");
	String str = sc.nextLine();
	System.out.println("\" "+r1.straight(str)+"\" "+ " this is not reversed cause the iteration is just traversal into string");
	System.out.println("\" "+r1.reverse(str)+"\" "+" this is reversed cause it passed into the method reverse the reversal traversal and storage, concatenation");
}
}
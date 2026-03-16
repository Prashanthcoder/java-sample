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
	System.out.println("Enter the number of String you want to reverse ");
	int size = sc.nextInt();
	sc.nextLine();
	String[] str = new String[size];
	System.out.println("Enter the string to reverse");
	for(int i=0;i<size;i++){
	System.out.print("String "+(i+1)+" : ");
	str[i] = sc.nextLine();
    }
	for(int i = 0;i<size;i++){
	System.out.println((i+1)+"_____________________________________________________________________________________________________________________________________l"+(i+1));
	System.out.println("\""+r1.straight(str[i])+"\" "+ " this is not reversed cause the iteration is just traversal into string");
	System.out.println("\""+r1.reverse(str[i])+"\" "+" this is reversed cause it passed into the method reverse the reversal traversal and storage, concatenation");
}}
}
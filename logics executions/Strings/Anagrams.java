import java.util.Arrays;
import java.util.Scanner;
class Anagrams
{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the two strings to check anagram or not");
System.out.print("Str1: ");
	String str1 = sc.nextLine();
System.out.print("Str2: ");
String str2 = sc.nextLine();
char[] c1 = str1.toCharArray();
char[] c2 = str2.toCharArray();
if(c1.length == c2.length){
	Arrays.sort(c1);
Arrays.sort(c2);
/*if(Arrays.equals(c1,c2)){
	System.out.println("it is an anagram");
}else{
	System.out.println("it is not an anagram");
}
}*/
for(int i = 0;i<c1.length;i++){
	if(c1[i]!=c2[i]){
		System.out.println("it is not a anagram");
return;
	}

}
System.out.println("it is an anagram");
}
else{
	System.out.println("it is not an anangram");
}
}
}
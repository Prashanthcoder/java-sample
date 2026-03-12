import java.util.Arrays;

class Anagrams
{
public static void main(String[] args){
	String str1 = "cat";
String str2 = "act";
char[] c1 = str1.toCharArray();
char[] c2 = str2.toCharArray();
if(c1.length == c2.length){
	Arrays.sort(c1);
Arrays.sort(c2);
if(Arrays.equals(c1,c2)){
	System.out.println("it is an anagram");
}else{
	System.out.println("it is not an anagram");
}
}
else{
	System.out.println("it is not an anangram");
}
}
}
import java.util.*;

class Inbuilt
{
static void replaceallOvals(String str){
	System.out.println(str.replaceAll("[aeiou, AEIOU]", ""));
}
static void replaceallConsonants(String str){
	System.out.println(str.replaceAll("[^aeiou, AEIOU]", ""));
}
static void replaceNumbers(String str){
	System.out.println(str.replaceAll("[0-9]", ""));
}
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
String str = sc.nextLine();
replaceallOvals(str);
replaceallConsonants(str);
replaceNumbers(str);
}
}
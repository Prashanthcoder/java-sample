import java.util.*;

class Inbuilt
{
static void replaceallOvals(String str){
	System.out.println(str.replaceAll("[aeiou , AEIOU ]", ""));
}
static void replaceallConsonants(String str){
	System.out.println(str.replaceAll("[^aeiou, AEIOU]", ""));
}
static void replaceNumbers(String str){
	System.out.println(str.replaceAll("[0-9]", ""));
}
static void replacenCount(String str){
	System.out.println(str.replaceAll(" ", "").length());
}
static void replaceallConsonantsCount(String str){
	System.out.println(str.replaceAll("[^aeiou ,AEIOU ]", "").length());
}
static void replaceCharacter(String str){
	System.out.println(str.replaceAll("[a-z,A-Z]", ""));
}
static void replaceUppernNum(String str){
	System.out.println(str.replaceAll("[0-9,A-Z]", ""));
}
static void replaceAllExceptSpecials(String str){
	System.out.println(str.replaceAll("[0-9,a-z,A-Z]", ""));
}
static void methodsimp(String str){
	System.out.println(str.replace("Son", "sun"));
}
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
String str = sc.nextLine();
replaceallOvals(str);
replaceallConsonants(str);
replaceNumbers(str);
replacenCount(str);
replaceallConsonantsCount(str);
replaceCharacter(str);
replaceUppernNum(str);
methodsimp(str);
replaceAllExceptSpecials(str);
}
}
import java.util.*;

class Inbuilt
{
static void replaceallOvals(String str){
	System.out.println(str.replaceAll("[aeiou, AEIOU]", ""));
}
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
String str = sc.nextLine();
replaceallOvals(str);
}
}
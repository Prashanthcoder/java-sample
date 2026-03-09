import java.util.Scanner;

class Upper
{
 static String Convert2Upper(String str){
	char first = (char)(str.charAt(0)-32);
	return first+str.substring(1);
}
static String ConvertFirstnLast(String str){
if(str.length()<2){return str.toUpperCase();}
	char first = (char)(str.charAt(0)-32);
	char last = (char)(str.charAt(str.length()-1)-32);
	return first+str.substring(1, str.length()-1)+last;

}
static String convertandInter(String str){
if(str.length()<2){return str.toUpperCase();}
	char first = (char)(str.charAt(0)-32);
	char last = (char)(str.charAt(str.length()-1)-32);
	return last+str.substring(1, str.length()-1)+first;
}
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	String sentence = sc.nextLine();
	String[] str = sentence.split(" ");
	for(int i = 0;i<str.length;i++){
		System.out.print(Convert2Upper(str[i])+" ");
	}
System.out.println();
for(int i = 0;i<str.length;i++){
	System.out.print(ConvertFirstnLast(str[i])+" ");
}
System.out.println();
for(int i = 0;i<str.length;i++){
	System.out.print(convertandInter(str[i])+" ");
}
}
}
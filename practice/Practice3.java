class Practice3
{
public static void main(String[] args){
	String str = "good   123 HELLO   morning#$#%";
String strr = "123maam               hello345";
	System.out.println(str.replaceAll("[a-z, A-Z, 0-9]", ""));
System.out.println(strr.replaceAll("[0-9]", " "));
System.out.println(strr.replaceAll(" +", " "));

}
}
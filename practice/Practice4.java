class Practice4
{
static String rev(String str){
	String res = "";
for(int i = str.length()-1; i>=0; i--){
	res = res + str.charAt(i);
}
return res;
}

public static void main(String[] args){
	String str = "hi hello macha yen madtidia";
System.out.println(str);
String[] s = str.split(" ");
for(int i = s.length-1; i>=0;i--){
	System.out.print(s[i]+" ");
}
System.out.println("\n"+str.replace("hello", "dude"));
}
}
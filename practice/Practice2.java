class Practice2
{
static String reverse(String str){
String s = "";
for(int i = str.length()-1; i>=0; i--){
	s = s + str.charAt(i);
}
return s;
}

public static void main(String[] args){
String str = "hi hello what are you brother";
String[] s = str.split(" ");
System.out.println(str);
for(int i = s.length-1; i>=0; i--){
	String x = reverse(s[i]);
System.out.print(x+" ");
}
}
}
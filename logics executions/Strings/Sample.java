class Sample
{
public static void main(String[] args){
	String str = "hi hi hi how how how are are r uuu u u u ";
String[] s = str.split(" ");
for(int i = 0;i<s.length-1;i++){
	if(!s[i].equals(s[i+1]))
{
		System.out.print(s[i]+" ");
	}
}
System.out.print(s[s.length-1]);
}
}
class Remove
{
public static void main(String[] args){
	String str = "aabccdddefprashhhh";
	char[] ch = str.toCharArray();
	for(int i = 0;i<ch.length-1;i++){
		if(ch[i]==ch[i+1]){
			continue;
		}else{
			System.out.print(ch[i]);
		}
	}
System.out.print(ch[ch.length-1]);
}
}
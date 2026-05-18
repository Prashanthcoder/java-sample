class Upper
{
void Convert2Upper(String str){
	String res = "";
	char first = (char)(str.charAt(0)-32);
	return first+str.substring(1);
}

public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	String sentence = sc.nextLine();
	String[] str = sentence.split(" ");
	for(int i = 0;i<str.length;i++){
		System.out.println(Convert2Upper(str[i]+" "));
	}
}
}
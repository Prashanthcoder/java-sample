class VowelOrConsonent 
{
static void CheckChar(char ch){
	if(ch == 'a' || ch == 'e' || ch=='i' || ch=='o' || ch=='u'){
		System.out.println(ch + " is a vowel");
	}
else{
	System.out.println(ch + " is a consonent");
}

}
	public static void main(String[] args) 
	{
		CheckChar('j');
		CheckChar('e');
		CheckChar('d');
		CheckChar('o');
		CheckChar('z');
	}
}

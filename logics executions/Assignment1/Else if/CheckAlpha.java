class CheckAlpha 
{
static void checkinOut(char ch){
	if(Character.isLetter(ch)){
		System.out.println(ch+" is a alphabet");
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
				System.out.println(ch+" is a vowel");
			}else{
				System.out.println(ch+ " is a consonant");
			}
	}
}
	public static void main(String[] args) 
	{
			char[] ch = {'m','n', 'o', 'q', 'i', 'j', 'u'};
			for(int i=0;i<ch.length; i++){
				checkinOut(ch[i]);
			}
			
	}
}

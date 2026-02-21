class  Font_test
{
static void test(char character){
	if(Character.isUpperCase(character)){
		System.out.println(character+" The character is upper");
	}
}
	public static void main(String[] args) 
	{
		test('A');
test('i');
test('Z');		
	}
}

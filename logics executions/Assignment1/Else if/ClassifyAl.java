class ClassifyAl
{
  void classify(char alpha){
	if(Character.isUpperCase(alpha))
  {
System.out.println("it is a uppercase: '" + alpha+"'");
}else if(Character.isLowerCase(alpha)){
	System.out.println("it is a lowercase: '"+alpha+"'");
}
else if(Character.isDigit(alpha)){
	System.out.println("it is a digit "+alpha);
}
  }
	public static void main(String[] args) 
	{
     ClassifyAl cl =  new ClassifyAl();
		cl.classify('a');
cl.classify('Z');
cl.classify('9');
	}
}

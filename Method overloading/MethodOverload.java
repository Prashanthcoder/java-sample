class MethodOverload
{
static void send(int number){
	System.out.println("Sending only numbers");
}
static void send(String msg){
	System.out.println("Sending only msg");
}
static void send(int number, String msg){
	System.out.println("Sending numbers with message");
}
static void send(String msg, int number){
	System.out.println("Sending message with numbers");
}

public static void main(String[] args){
	send(101);
send("hello");
send(101, "hello");
send("hello", 100);
}
}

import java.util.Scanner;

class Conditions1{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
int amount;
int balance = 500;
String response = "yes";
while(!response.equals("exit")){
System.out.println(" \n\n\n\n\n\n----------------------------Welcome to the Prash ATM!------------------------------------ \n\n\n\nDo you want to continue? type (yes/exit)	\n");
response = sc.nextLine();
System.out.println("Enter the amount to withdraw");
amount = sc.nextInt();
if(amount<=500){
System.out.println("Amount withdrawed !");
balance = balance - amount;
System.out.println("Available balance after withdraw: "+balance);
}
else{
System.out.println("Insuffiecient balance!");
System.out.println("Available balance: "+balance);
}
}
}
}

import java.util.Scanner;

class ATMServices{
static int count = 0;
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
ATMServices s = new ATMServices();
int balance = 500;
System.out.println("-----------------------WELCOME----TO--------SHOBHA---------BANK----------------");
String str = " ";
boolean security = false;
do{
System.out.println("Please enter your user name and pin for authentication ");
String user = sc.nextLine();
System.out.print("pins(4 digit): ");
int pin = sc.nextInt();
sc.nextLine();
security = s.authentication(user, pin);
if(security == true){
	break;
}
else
{
	count++;
	if(count==2){
		System.out.println("------------------------------Caution! Only 1 attempts left---------------------------------------------");
	}
	if(count==3)
	{
		System.out.println("Your pin has been locked! Due to maximum try has been reached!");
		break;
	}
}
}while(count<3);


if(security == true){
while(!str.equals("exit")){
System.out.println("Enter the choice of service: \n1.Withdraw \n2.Deposit \n3.Exit ");
int choice = sc.nextInt();
if(choice == 1){
	System.out.println("Enter the amount you want to withdraw ");
	int amount = sc.nextInt();
	balance = s.withdraw(amount, balance);
	
}else if(choice == 2){
	System.out.println("Enter the amount you want to deposit ");
	int amount = sc.nextInt();
	balance = s.deposit(amount, balance);
}
else if(choice == 3){
	str = "exit";
	System.out.println("-------------THANK-------YOU------FOR--------BANKING------WITH-------US!---------");
}
else{
	System.out.println("Invalid choice");
	str = "exit";
}
}
}


}
boolean authentication(String user, int pin){
	if(user.equals("prashanth") && pin == 3881){
		return true;
	}
	else{
		return false;
	}
}

int withdraw(int amount, int balance){ 
    if(amount<=0){	
	System.out.println("Invalid amount");
}

 else if(balance<amount)
	{
	System.out.println("Insufficient balance! Check your balance: "+balance);
	}
	else{
		balance = balance- amount;
		System.out.println("Amount withdrawed! \n Current balance: "+balance);
	}
  
	return balance;
}


int deposit(int amount, int balance){
	if(amount<=0){
	System.out.println("enter valid amount");
}else{
	balance = balance + amount;
	System.out.println("Amount deposited! \n current balance: "+balance);
	
}
return balance;
}
}
			
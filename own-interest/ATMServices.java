import java.util.Scanner;

class ATMServices{
static int count = 0;
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
int balance = 500;
System.out.println("-----------------------WELCOME----TO--------SHOBHA---------BANK----------------");
boolean security = false;
do{
System.out.println("Please enter your user name and pin for authentication ");
String user = sc.nextLine();
System.out.print("pins(4 digit): ");
int pin = sc.nextInt();
sc.nextLine();
security = authentication(user, pin);
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
while(true){
System.out.println("\nEnter the choice of service: \n1.Withdraw \n2.Deposit \n3.Exit \n");
int choice = sc.nextInt();
if(choice == 1){
	System.out.println("Enter the amount you want to withdraw ");
	int amount = sc.nextInt();
	balance = withdraw(amount, balance);
	
}else if(choice == 2){
	System.out.println("Enter the amount you want to deposit ");
	int amount = sc.nextInt();
	balance = deposit(amount, balance);
}
else if(choice == 3){
	System.out.println("\n-------------THANK-------YOU------FOR--------BANKING------WITH-------US!---------");
	break;
}
else{
	System.out.println("Invalid choice");
	break;
}
}
}


}
static boolean authentication(String user, int pin){
	if(user.equals("prashanth") && pin == 3881){
		return true;
	}
	else{
		return false;
	}
}

static int withdraw(int amount, int balance){ 
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


static int deposit(int amount, int balance){
	if(amount<=0){
	System.out.println("enter valid amount");
}else{
	balance = balance + amount;
	System.out.println("Amount deposited! \n current balance: "+balance);
	
}
return balance;
}
}
			
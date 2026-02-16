import java.util.Scanner;

class Conditions1{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
Conditions1 s = new Conditions1();
int balance = 500;
System.out.println("-----------------------WELCOME----TO--------SHOBHA---------BANK----------------");
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
else{
	System.out.println("Please enter between 3 choices only ");
}

}

int withdraw(int amount, int balance){
	if(balance<amount)
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
	balance = balance + amount;
	System.out.println("Amount deposited! \n current balance: "+balance);
	return balance;
}
}
			
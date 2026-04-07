
package equalsOverride;

class BankAccount {
    int accNo;
    double balance;

    BankAccount(int accNo, double balance) {
        this.accNo = accNo;
        this.balance = balance;
    }

    public boolean equals(Object obj) {
        BankAccount b = (BankAccount) obj;
        return this.accNo == b.accNo && this.balance == b.balance;
    }

    public static void main(String[] args) {
        BankAccount b1 = new BankAccount(123, 5000);
        BankAccount b2 = new BankAccount(123, 5000);
        System.out.println(b1.equals(b2));
    }
}

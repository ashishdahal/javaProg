package abs.cls.exersise;

public class BANK_B extends Bank {

    int totalBalance = 0;
    int deposit = 150;

    @Override
    public int depositAmt() {
        return totalBalance + deposit;
    }

    @Override
    public void getBalance() {
        System.out.println("The deposited amt in Bank B = " + this.deposit);
        System.out.println("The total balance in Bank B = " + this.depositAmt());
    }
}


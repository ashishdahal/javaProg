package abs.cls.exersise;

public class BANK_A extends Bank {

    int totalBalance=0;
    int deposit = 100;

    @Override
    public int depositAmt() {
       return totalBalance+deposit;
    }

    @Override
    public void getBalance() {
        System.out.println("The deposited amt in Bank A = "+this.deposit);
        System.out.println("The total balance in Bank A = "+this.depositAmt());
    }
}


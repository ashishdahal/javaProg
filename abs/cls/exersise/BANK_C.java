package abs.cls.exersise;

public class BANK_C extends Bank {

    int totalBalance = 0;
    int deposit = 200;

    @Override
    public int depositAmt() {
        return totalBalance + deposit;
    }

    @Override
    public void getBalance() {
        System.out.println("The deposited amt in Bank C = " + this.deposit);
        System.out.println("The total balance in Bank C = " + this.depositAmt());
    }
}

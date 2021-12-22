package abs.cls.exersise;

public class BankMain {
    public static void main(String[] args) {

        System.out.println("-------------BANK A-------------------");

        BANK_A Bank_A = new BANK_A();
        Bank_A.depositAmt();
        Bank_A.getBalance();

        System.out.println("_____________BANK B_____________");

        BANK_B Bank_B = new BANK_B();
        Bank_B.depositAmt();
        Bank_B.getBalance();

        System.out.println("---------------BANK C---------------");
        BANK_C Bank_C = new BANK_C();
        Bank_C.depositAmt();
        Bank_C.getBalance();

    }
}

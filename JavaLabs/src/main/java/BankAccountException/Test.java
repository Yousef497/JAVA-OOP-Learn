package BankAccountException;

public class Test {
    public static void main(String[] args) {
        BankAccount ac1 = new BankAccount("14058","Person1",0);
        BankAccount ac2 = new BankAccount("500","Person2",35000);
        ac1.close();
        ac2.close();
        ac2.reopen();
        ac1.close();
        ac1.deposit(-1000);
        ac1.withdraw(-50);
        ac1.withdraw(3000);
        ac1.transferTo(ac2, -1600);
        ac1.transferTo(ac2, 500);
    }
}

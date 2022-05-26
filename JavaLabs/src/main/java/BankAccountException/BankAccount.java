package BankAccountException;

public class BankAccount {

    public String AccNum;
    private String AccHolder;
    public float balance;
    public boolean isClosed = false;

    public BankAccount(String accNum, String accHolder, float balance) {
        AccNum = accNum;
        AccHolder = accHolder;
        this.balance = balance;
    }

    public void print() {
        System.out.println("Account Number: " + AccNum);
        System.out.println("Account Holder: " + AccHolder);
        System.out.println("Balance: " + balance);
        System.out.println("Account is " + (isClosed ? "closed" : "open"));
    }

    public float getBalance() {
        return this.balance;
    }

    public void close() throws InvalidBankAccountStateException {
        if (this.isClosed)
            throw new InvalidBankAccountStateException("Account is Already Closed");
        else if (this.balance > 0)
            throw new InvalidBankAccountStateException("Cannot close an account that has money");
        else
            this.isClosed = true;
    }

    public void reopen() throws InvalidBankAccountStateException {
        if (!this.isClosed)
            throw new InvalidBankAccountStateException("The account is already open!");
        else
            this.isClosed = false;
    }

    public void deposit(float amount) throws InvalidBankAccountStateException, NegativeMoneyAmountException {
        if (this.isClosed)
            throw new InvalidBankAccountStateException("Cannot deposit to a closed account!");
        else if (amount <= 0)
            throw new NegativeMoneyAmountException("Can only deposit positive amounts");
        else
            this.balance += amount;
    }

    public void withdraw(float amount) throws InvalidBankAccountStateException, NegativeMoneyAmountException, NotEnoughMoneyException {
        if (this.isClosed)
            throw new InvalidBankAccountStateException("Cannot withdraw from a closed account!");
        else if (amount <= 0)
            throw new NegativeMoneyAmountException("Can only withdraw positive amounts");
        else if (this.balance < amount)
            throw new NotEnoughMoneyException("Balance is not enough");
        else
            this.balance -= amount;
    }

    public void transferTo(BankAccount a, float amount) throws InvalidBankAccountStateException, NegativeMoneyAmountException, NotEnoughMoneyException{
        if (this.isClosed || a.isClosed)
            throw new InvalidBankAccountStateException("Both accounts must be open to make a transfer");
        else if(amount<=0)
            throw new NegativeMoneyAmountException("Can only transfer positive amounts");
        else if(this.balance<amount)
            throw new NotEnoughMoneyException("Balance is not enough");
        else {
            this.balance-=amount;
            a.balance+=amount;
        }
    }

    public static void printAll(BankAccount[] as) {
        for(int i=0;i<as.length;i++)
        as[i].print();
    }

    public static int find(BankAccount[] as, String accountNum) {
        for(int i=0;i<as.length;i++)
            if(as[i].AccNum.equals(accountNum))
                return i;
        return -1;
    }
}

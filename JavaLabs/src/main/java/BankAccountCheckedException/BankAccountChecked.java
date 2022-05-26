package BankAccountCheckedException;

class InvalidBankAccountStateException extends Exception {
    public InvalidBankAccountStateException(String message){

        super(message);
    }
}

class NegativeMoneyAmountException extends Exception {
    public NegativeMoneyAmountException(String message){

        super(message);
    }
}

class NotEnoughMoneyException extends Exception {
    public NotEnoughMoneyException(String message) {

        super(message);
    }
}

public class BankAccountChecked {

    private String AccNum;
    private String AccHolder;
    private float balance;
    private boolean isClosed = false;

    public BankAccountChecked(String accNum, String accHolder, float balance) {
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

    public void close() throws BankAccountException.InvalidBankAccountStateException {
        if (this.isClosed)
            throw new BankAccountException.InvalidBankAccountStateException("Account is Already Closed");
        else if (this.balance > 0)
            throw new BankAccountException.InvalidBankAccountStateException("Cannot close an account that has money");
        else
            this.isClosed = true;
    }

    public void reopen() throws BankAccountException.InvalidBankAccountStateException {
        if (!this.isClosed)
            throw new BankAccountException.InvalidBankAccountStateException("The account is already open!");
        else
            this.isClosed = false;
    }

    public void deposit(float amount) throws BankAccountException.InvalidBankAccountStateException, BankAccountException.NegativeMoneyAmountException {
        if (this.isClosed)
            throw new BankAccountException.InvalidBankAccountStateException("Cannot deposit to a closed account!");
        else if (amount <= 0)
            throw new BankAccountException.NegativeMoneyAmountException("Can only deposit positive amounts");
        else
            this.balance += amount;
    }

    public void withdraw(float amount) throws BankAccountException.InvalidBankAccountStateException, BankAccountException.NegativeMoneyAmountException, BankAccountException.NotEnoughMoneyException {
        if (this.isClosed)
            throw new BankAccountException.InvalidBankAccountStateException("Cannot withdraw from a closed account!");
        else if (amount <= 0)
            throw new BankAccountException.NegativeMoneyAmountException("Can only withdraw positive amounts");
        else if (this.balance < amount)
            throw new BankAccountException.NotEnoughMoneyException("Balance is not enough");
        else
            this.balance -= amount;
    }

    public void transferTo(BankAccountChecked a, float amount) throws BankAccountException.InvalidBankAccountStateException, BankAccountException.NegativeMoneyAmountException, BankAccountException.NotEnoughMoneyException {
        if (this.isClosed || a.isClosed)
            throw new BankAccountException.InvalidBankAccountStateException("Both accounts must be open to make a transfer");
        else if(amount<=0)
            throw new BankAccountException.NegativeMoneyAmountException("Can only transfer positive amounts");
        else if(this.balance<amount)
            throw new BankAccountException.NotEnoughMoneyException("Balance is not enough");
        else {
            this.balance-=amount;
            a.balance+=amount;
        }
    }

    public static void printAll(BankAccountException.BankAccount[] as) {
        for(int i=0;i<as.length;i++)
            as[i].print();
    }

    public static int find(BankAccountException.BankAccount[] as, String accountNum) {
        for(int i=0;i<as.length;i++)
            if(as[i].AccNum.equals(accountNum))
                return i;
        return -1;
    }
}


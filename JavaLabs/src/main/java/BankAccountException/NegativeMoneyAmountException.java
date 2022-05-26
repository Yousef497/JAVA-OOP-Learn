package BankAccountException;

public class NegativeMoneyAmountException extends RuntimeException {
    public NegativeMoneyAmountException(String message) {
        super(message);
    }
}

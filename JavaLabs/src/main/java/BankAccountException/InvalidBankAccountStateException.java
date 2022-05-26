package BankAccountException;

public class InvalidBankAccountStateException extends RuntimeException {
    public InvalidBankAccountStateException(String message) {
        super(message);
    }
}

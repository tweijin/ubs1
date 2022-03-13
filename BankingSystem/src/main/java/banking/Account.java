package banking;

/**
 * Abstract bank account class.<br>
 * <br>
 *
 * Private Variables:<br>
 * {@link #accountHolder}: AccountHolder<br>
 * {@link #accountNumber}: Long<br>
 * {@link #pin}: int<br>
 * {@link #balance}: double
 */
public abstract class Account {
	private AccountHolder accountHolder;
	private Long accountNumber;
	private int pin;
	private double balance;

	protected Account(AccountHolder accountHolder, Long accountNumber, int pin, double startingDeposit) {
		// complete the constructor
		this.accountHolder=accountHolder;
		this.accountNumber=accountNumber;
		this.pin=pin;
		this.balance=startingDeposit;
	}

	public AccountHolder getAccountHolder() {
		// complete the function
        return accountHolder;
	}

	public boolean validatePin(int attemptedPin) {
		// complete the function
		if(pin==attemptedPin) {
			return true;
		}else {
			return false;
		}
        
	}

	public double getBalance() {
		// complete the function
        return balance;
	}

	public Long getAccountNumber() {
		// complete the function
        return accountNumber;
	}

	public void creditAccount(double amount) {
		balance+=amount;
		// complete the function
	}

	public boolean debitAccount(double amount) {
		// complete the function
		if(balance-amount>=0) {
			return true;
		}else {
			return false;
		}
        
	}
}

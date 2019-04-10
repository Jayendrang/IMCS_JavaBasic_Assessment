package Problem3;

public class LowBalanceException extends Exception {

	String accNumber = null;

	public LowBalanceException() {
		super();
	}

	public LowBalanceException(String accNum) {
		super();
		this.accNumber = accNum;
	}

	@Override
	public String getMessage() {
		return "Low balance, transaction failed! \t " + accNumber;
	}
}

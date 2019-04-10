package Problem3;

public class InvalidTransaction extends Exception {

	String erroName = null;

	public InvalidTransaction() {
		super();
	}

	public InvalidTransaction(String name) {
		super();
		this.erroName = name;
	}

	@Override
	public String getMessage() {

		return erroName + "\t Invalid transaction";
	}
}

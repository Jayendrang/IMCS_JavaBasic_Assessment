package Problem3;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.InvalidTransactionException;

public class Driver {

	// transtype is set TRUE for withdraw
	// transtype is set FALSE for deposit
	public Account transaction(Account account, double transamt, boolean transtype) {
		try {
			if (!(transamt <= 0)) {
				if (transtype == true) {
					if (account.getBalance() > transamt) {
						account.withdraw(transamt);

					} else {
						throw new LowBalanceException("" + account.getAccountNumber());
					}
				} else {
					account.deposit(transamt);
				}
			} else {
				throw new InvalidTransactionException("Transaction amount should be non-negative");
			}
		} catch (LowBalanceException lowBalanceException) {
			System.out.println(lowBalanceException.getMessage());
		} catch (InvalidTransactionException invalidTransactionException) {
			System.out.println(invalidTransactionException.getMessage());
		} catch (Exception exception) {
			System.out.println(exception.getMessage());
		}
		return account;

	}

	public static void main(String[] args) {
		Driver driver = new Driver();
		Account acc1 = new Account(111, 100);
		Account acc2 = new Account(222, 200);
		Account acc3 = new Account(333, -100);

		driver.transaction(acc1, 200, false);
		driver.transaction(acc2, 300, true);
		driver.transaction(acc3, -100, true);

		System.out.println("\n\nTotal Number of accounts \t" + Account.getTotalAccounts());
	}

}

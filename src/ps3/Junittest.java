package ps3;

import java.util.Date;

import org.junit.Test;

public class Junittest {

	@Test
	public void test() {
		Date dateCreated;
		double withdrawamount= 2500;
		double depositamount= 3000;
		double interestRate= 4.5;
		
		Account acnt= new Account(1122,20000);
		acnt.deposit(depositamount);
		acnt.withdraw(withdrawamount);
		
		fail("you have insufficient funds");
	}

}

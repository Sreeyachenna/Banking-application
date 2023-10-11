package com.sreeyaprojectapplication.BankingProjectApplication;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.sreeyaprojectapplication.ProjectApplication.BankDetails;

public class BankingTest {
	@Test
   public void searchTest() {
		BankDetails t1=new BankDetails();
		t1.search("123");
		String accountNo="123";
		boolean result=t1.search(accountNo);
		assertTrue(result);
		

		//t1.search(accountNo);
	  
   }
	@Test
	public void searchTest2() {
		BankDetails t1=new BankDetails();
		t1.search("123");
		String accountNo="124";
		boolean result=t1.search(accountNo);
		assertFalse(result);
		

		//t1.search(accountNo);
	  
   }
	

}

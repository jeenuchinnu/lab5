package chinnu.poc;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestBankAccount {

  @Test
  public void testDebitWithSuffBal(){
  
    BankAccount acc = new BankAccount(10.0);
    double amt = acc.debit(5.0);
    Assert.assertEquals(5.0,amt);
  
  }
  
}

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class CurrencyTest {

    @Test
    public void testDollarMultiplication() {
        Money five = Money.dollar(5);

        Assertions.assertEquals(Money.dollar(10), five.times(2));
/*
      this compares an int type with an int (putting .amount makes the product object type in
      Assertions.assertEquals(15, product.amount);
*/
//        here we are comparing two Dollar types together
        Assertions.assertEquals(Money.dollar(15), five.times(3));
    }

    @Test
    public void testFrancMultiplication() {
        Money five = Money.franc(5);
        Assertions.assertEquals(Money.franc(10), five.times(2));
        Assertions.assertEquals(Money.franc(15), five.times(3));
    }

    @Test
    public void testEquality() {
        Assertions.assertEquals(Money.dollar(5), Money.dollar(5));
        Assertions.assertNotEquals(Money.dollar(5), Money.dollar(6));

        Assertions.assertNotEquals(Money.franc(5), Money.dollar(6));
    }

    @Test
    void testCurrency() {
        Assertions.assertEquals("USD", Money.dollar(1).currency);
        Assertions.assertEquals("CHF", Money.franc(1).currency);
    }

    @Test
    void testSimpleAddition() {
        Money five = Money.dollar(5);
        Expression sum = five.plus(five);
        Bank bank = new Bank();
        Money reduced = bank.reduce(sum, "USD");
        Assertions.assertEquals(Money.dollar(10), reduced);
    }

    @Test
    void testPlusReturnSum() {
        Money five = Money.dollar(5);
        Expression result = five.plus(five);
        Sum sum = (Sum) result;

//        Assertions.assertEquals(result, Money.dollar(10));

        Assertions.assertEquals(five, sum.augend);
        Assertions.assertEquals(five, sum.addend);
    }

    @Test
    void testReduceSum() {
        Expression sum = new Sum(Money.dollar(3), Money.dollar(4));
        Bank bank = new Bank();
        Money result = bank.reduce(sum, "USD");
        Assertions.assertEquals(Money.dollar(7), result);
    }

    @Test
    public void testReduceMoneyDifferentCurrency() {
        Bank bank = new Bank();
        bank.addRate("CHF", "USD", 2);
        Money result = bank.reduce(Money.franc(2), "USD");
        Assertions.assertEquals(Money.dollar(1), result);
    }

    @Test
    public void testArrayEquals() {
//        int objectCheck;
        Object[] objectCheck = new Object[]{"abc"};

        //checks if the arrays are in the same memory space
        Assertions.assertEquals(objectCheck, objectCheck);

        //checks if the arrays are similar regardless of the memory space
        Assertions.assertArrayEquals(objectCheck, new Object[]{"abc"});
    }

    @Test
    public void testIdentityRate() {
        Assertions.assertEquals(1, new Bank().rate("USD", "USD"));
    }

    @Test
    public void checkDifferentCurrencyRate() {
        Bank currencyRate = new Bank();
        currencyRate.addRate("CHF", "USD", 2);
        Assertions.assertEquals(2, currencyRate.rate("CHF", "USD"));
    }

    @Test
    public void testingTheReturnOfEqualsMethod() {
        Bank.Pair convertingCurrency = new Bank.Pair("CHF", "USD");
        Assertions.assertNotEquals(null, convertingCurrency);
    }

    @Test
    public void testMixedAddition() {
        Expression fiveBucks = Money.dollar(5);
        Expression tenFrancs = Money.franc(10);
        Bank bank = new Bank();
        bank.addRate("CHF", "USD", 2);
        Money result = bank.reduce(fiveBucks.plus(tenFrancs), "USD");

//        Money result = (Money) fiveBucks.plus(bank.reduce((tenFrancs), "USD"));
        Assertions.assertEquals(Money.dollar(10), result);
    }

    @Test
    void testSumPlusMoney() {
        Expression fiveBucks = Money.dollar(5);
        Expression tenFrancs = Money.franc(10);
        Bank bank = new Bank();
        bank.addRate("CHF", "USD", 2);
        Expression sum = new Sum(fiveBucks, tenFrancs).plus(fiveBucks);
        Money result = bank.reduce(sum, "USD");
        Assertions.assertEquals(Money.dollar(15), result);
    }

    @Test
    void testSumTimes() {
        Expression fiveBucks = Money.dollar(5);
        Expression tenFrancs = Money.franc(10);
        Bank bank = new Bank();
        bank.addRate("CHF", "USD", 2);
        Expression sum = new Sum(fiveBucks, tenFrancs).times(2);
        Money result = bank.reduce(sum, "USD");
        Assertions.assertEquals(Money.dollar(20), result);

    }

    @Test
    void finallyKeywordTest() throws Exception {
        try {
            System.out.println("entering");
            throw new Exception("Checked exception occurred");
        } finally {
            System.out.println("Whatever you want");
        }
    }

//    @Test
//    void testPlusSameCurrency() {
//        Expression sum = Money.dollar(1).plus(Money.dollar(1));
//        Assertions.assertTrue(sum instanceof Money);
//    }
}












/*
     @Test
     public void testEquality() {
         Dollar foo = null;
 //        Assertions.assertEquals(foo, new Dollar(5));
         Assertions.assertTrue(foo.equals(new Dollar(5)));
     }

     @Test
     void testNotEquals() {
         Assertions.assertNotEquals(new Dollar(8), new Dollar(5));
     }

     @Test
     public void testRefEquality() {
         Dollar five = new Dollar(5);
         Assertions.assertEquals(five,five);
     }


     @Test
     void testClassNotEquals() {
         Assertions.assertNotEquals(new Dollar(8), new String());
     }
*/

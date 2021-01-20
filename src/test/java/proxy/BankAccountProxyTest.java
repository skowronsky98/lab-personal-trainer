package proxy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountProxyTest {

    @Test
    void sameInstane(){
        BankAccount bankAccount = new BankAccount();
        BankAccountProxy bankAccountProxy = new BankAccountProxy(bankAccount);
        bankAccountProxy.sendMoney(100d);
        assertEquals(bankAccount.viewBalance(),bankAccountProxy.viewBalance());
    }

    @Test
    void sendMoneyDirectly(){
        BankAccount bankAccount = new BankAccount();
        Double price = 100d;
        bankAccount.sendMoney(price);
        assertEquals(price.toString(),bankAccount.viewBalance());
    }

    @Test
    void billingHistory(){
        BankAccount bankAccount = new BankAccount();
        BankAccountProxy bankAccountProxy = new BankAccountProxy(bankAccount);
        Double price = 100d;
        bankAccountProxy.sendMoney(price);
        assertTrue(bankAccountProxy.getBillingReports().contains(price));
    }


}
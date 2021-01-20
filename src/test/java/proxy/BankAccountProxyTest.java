package proxy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountProxyTest {

    @Test
    void sameInstane(){
        BankAccount bankAccount = new BankAccount();
        BillingReports billingReports = new BillingReports();
        BankAccountProxy bankAccountProxy = new BankAccountProxy(bankAccount,billingReports);
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
        BillingReports billingReports = new BillingReports();
        BankAccountProxy bankAccountProxy = new BankAccountProxy(bankAccount,billingReports);
        Double price = 100d;
        bankAccountProxy.sendMoney(price);
        assertTrue(billingReports.getBillingHistory().contains(price));
    }

    @Test
    void billingHistoryFalse(){
        BankAccount bankAccount = new BankAccount();
        BillingReports billingReports = new BillingReports();
        Double price = 100d;
        bankAccount.sendMoney(price);
        assertFalse(billingReports.getBillingHistory().contains(price));
    }
}
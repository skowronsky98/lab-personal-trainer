package proxy;

import java.util.List;

public class BankAccountProxy implements Payment {

    private BankAccount bankAccount;
    private BillingReports billingReports;

    public BankAccountProxy(BankAccount bankAccount, BillingReports billingReports) {
        this.bankAccount = bankAccount;
        this.billingReports = billingReports;
    }

    @Override
    public void sendMoney(Double amount) {
        bankAccount.sendMoney(amount);
        billingReports.addReport(amount);
    }

    @Override
    public String viewBalance() {
        return bankAccount.viewBalance();
    }

}

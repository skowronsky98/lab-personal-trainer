package proxy;

public class BankAccountProxy implements Payment {

    private BankAccount bankAccount;
    private BillingReports billingReports;
    private String balance;

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
        if(balance.isEmpty())
            balance =  bankAccount.viewBalance();
        return balance;
    }

}

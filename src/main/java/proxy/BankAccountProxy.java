package proxy;

import java.util.ArrayList;
import java.util.List;

public class BankAccountProxy implements Payment {

    private BankAccount bankAccount;

    private List<Double> billingReports = new ArrayList<>();
    private String balance;

    public BankAccountProxy(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public void sendMoney(Double amount) {
        bankAccount.sendMoney(amount);
        billingReports.add(amount);
    }

    @Override
    public String viewBalance() {
        if(balance == null)
            balance = bankAccount.viewBalance();
        return balance;
    }

    public List<Double> getBillingReports() {
        return billingReports;
    }

    public void reset(){
        balance = null;
    }
}

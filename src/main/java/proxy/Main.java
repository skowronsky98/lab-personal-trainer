package proxy;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        BillingReports billingReports = new BillingReports();
        BankAccountProxy bankAccountProxy = new BankAccountProxy(bankAccount,billingReports);

        System.out.println("Balance Directly: "+bankAccount.viewBalance());
        bankAccount.sendMoney(100d);
        System.out.println(bankAccount.viewBalance());

        System.out.println("Ballace via Proxy: "+bankAccountProxy.viewBalance());
        bankAccountProxy.sendMoney(100d);
        System.out.println("Ballace via Proxy after sending: "+bankAccountProxy.viewBalance());
        System.out.println("Billing history:");
        billingReports.getBillingHistory().forEach(System.out::println);
    }
}

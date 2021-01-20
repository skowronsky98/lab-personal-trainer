package proxy;

import java.util.ArrayList;
import java.util.List;

public class BillingReports {
    private List<Double> billingHistory = new ArrayList<>();

    public void addReport(Double amount){
        billingHistory.add(amount);
    }

    public List<Double> getBillingHistory() {
        return billingHistory;
    }
}

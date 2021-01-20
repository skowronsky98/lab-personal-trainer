package proxy;

public interface Payment {
    void sendMoney(Double amount);
    String viewBalance();
}

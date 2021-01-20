package proxy;

public final class BankAccount implements Payment{
    private Double balance = 0d;

    @Override
    public void sendMoney(Double amount){
        if(amount > 0)
            balance += amount;
    }

    @Override
    public String viewBalance(){
        return balance.toString();
    }


}

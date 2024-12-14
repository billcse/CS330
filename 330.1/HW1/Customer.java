package HW1;

public abstract class Customer {
    public Payment AccessMoney;

    public void pay(){
        AccessMoney.pay();
    }

    public void setAccessMoney(Payment payment){
        AccessMoney = payment;
    }

}
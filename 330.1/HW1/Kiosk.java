package HW1;

public class Kiosk extends Customer {
    public Kiosk(){
        int Order_Number = 1;
        System.out.println("Ticket Order from Kiosk");
        System.out.println("Order Number: " + Order_Number);
        AccessMoney = new CashPayment();
    
    }
}

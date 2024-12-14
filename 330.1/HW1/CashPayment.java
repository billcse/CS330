package HW1;
import java.util.Scanner;

public class CashPayment implements Payment {
    public void pay(){
        // Preset Price
        float price =  2.50f;
        System.out.println("Amount of Sale: $" + String.format("%.2f", price));
        System.out.println("Enter amount of cash in format x.xx");
        Scanner reader = new Scanner(System.in);
        float cash = reader.nextFloat();
        float change = cash - price;
        System.out.println("Amount Paid: $" + String.format("%.2f", cash));
        System.out.println("Change: $" + String.format("%.2f", change));
        System.out.println("Successfully paid with cash.");
        System.out.println("------------------------------------");
        reader.close();
    }
    
}

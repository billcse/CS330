package HW1;
import java.util.Scanner;

public class CardPayment implements Payment {
    public void pay(){
        // Preset Price
        float price = 2.50f;
        System.out.println("Amount of Sale: $" + String.format("%.2f", price));
        // Note: Strings are immutable in Java
        // new string is created to hide credit card information when displayed for user
        System.out.println("Enter Credit Card in format xxxx-xxxx-xxxx-xxxx");
        Scanner reader = new Scanner(System.in);
        String card_number = reader.next();
        String last_four = card_number.substring(15);
        System.out.println("Credit Card #: xxxx-xxxx-xxxx-" + last_four);
        System.out.println("Successfully paid with Credit Card.");
        System.out.println("------------------------------------");
        reader.close();
    }
}

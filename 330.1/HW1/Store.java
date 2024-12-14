package HW1;
import java.util.Random;

public class Store extends Customer {
    public Store(){
        // Generates a random order number for use by computer
        Random rand = new Random();
        int upperbound = 100;
        int random_int = rand.nextInt(upperbound);
        
        // Prompt does not ask for user input, so default for store is Credit Card Payment
        // The integer "method" can be changed to 1 for cash payment in store
        int method = 2;

        System.out.println("Computer Order at Store");
        System.out.println("Order Number: " + random_int);
        if (method == 1){
            AccessMoney = new CashPayment();
        }
        else if (method == 2) {
            AccessMoney = new CardPayment();
        }
        else{
            System.out.println("Invalid method.");
        }
    }
}

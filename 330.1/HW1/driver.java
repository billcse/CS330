package HW1;
import java.util.Scanner;

public class driver {
    public static void main(String[] args){

        // Ask user for Kiosk Scenario or Store Scenario
        System.out.println("Welcome to Shave Ice Shops!");
        System.out.println("1.  Shave Ice Kiosk");
        System.out.println("2.  Shave Ice Store");
        System.out.println("Input number to enter location: ");
        Scanner reader = new Scanner(System.in);
        int userInput = reader.nextInt();

        if (userInput == 1){
            Customer kiosk = new Kiosk();
            kiosk.pay();
        }
        else if (userInput == 2){
            Customer Store = new Store();
            Store.pay();
        }
        else{
            System.out.println("Invalid Input.");
        }
        reader.close();
    }
}

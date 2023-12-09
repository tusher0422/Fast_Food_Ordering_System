import java.util.ArrayList;
import java.util.Date; 
import java.util.Scanner;

public class FastFoodApp {
    public static void main(String[] args) {
        Menu menu = new Menu();
        MenuItem kacchi = new MenuItem("Kacchi", "Shahi kacchi with juicy mutton", 520, true);
        MenuItem pizza = new MenuItem("Pizza", "9 inch Pepperoni pizza", 330 , true);
        MenuItem salad = new MenuItem("Salad", "Fresh organic salad", 420, true);

        menu.addItem(kacchi);
        menu.addItem(pizza);
        menu.addItem(salad);

        Scanner sc = new Scanner(System.in);

       
   
        

        System.out.println("Menu:");
        menu.displayMenu();

 System.out.println("Enter Your Name:");
        String name = sc.nextLine();
        System.out.println("Enter Your Number:");
        String phoneNumber = sc.nextLine();


Customer customer = new Customer(name, phoneNumber);
    

        customer.viewOrderHistory();

        System.out.println("Total Cost for Order 1: tk " );

    }
}

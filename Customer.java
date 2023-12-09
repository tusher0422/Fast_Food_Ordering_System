import java.util.ArrayList;

public class Customer {
    private String name;
    private String phoneNumber;
    private ArrayList<Order> orders;

    public Customer(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.orders = new ArrayList<>();
    }
    public void placeOrder(Order order) {
        orders.add(order);
    }
    public void viewOrderHistory() {
        if (orders.isEmpty()) {
            System.out.println("Order history is empty.");
        } else {
            System.out.println("Order history for " + name + ":");
            for (int i = 0; i < orders.size(); i++) {
                Order order = orders.get(i);
                System.out.println("Order " + (i + 1) + ":");
                System.out.println("Date: " + order.getOrderDate());
                System.out.println("Items:");
                ArrayList<MenuItem> items = order.getItems();
                for (MenuItem item : items) {
                    System.out.println("  " + item.getName());
                }
                System.out.println("Total Cost: tk " + order.calculateTotalCost());
                System.out.println();
            }
        }
    }
    public String getName() {
        return name;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
}

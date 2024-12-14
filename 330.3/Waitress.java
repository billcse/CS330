import java.util.Stack;

public class Waitress{
  private Stack<Order> tickets;

  public Waitress(){
    tickets = new Stack<Order>();
  }

  public void createOrder(Order order){
    tickets.add(order);
  }

  public void takeOrder(){
    while(!tickets.isEmpty()){
      Order order = tickets.pop();
      System.out.println("<Waitress> orders up " + new String(order.getClass().getName()));
      order.orderUp();
    }
  }
}


public class Customer{
  public Customer(){
    Cook cook = new Cook();
    Waitress waitress = new Waitress();

    // Order veganBurger = new VeganBurger(cook);
    Order cheeseBurger = new CheeseBurgerOrder(cook);
    Order fries = new FriesOrder(cook);
    Order Shake = new ShakeOrder(cook);
    Order water = new WaterOrder(cook);

    // waitress.createOrder(VeganBurger);
    waitress.createOrder(cheeseBurger);
    waitress.createOrder(fries);
    waitress.createOrder(Shake);
    waitress.createOrder(water);
    waitress.takeOrder();   
  }
}
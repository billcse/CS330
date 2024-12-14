public class ShakeOrder implements Order {
  private Cook cook;

  public ShakeOrder(Cook cook){
    this.cook = cook;
  }
  
  public void orderUp(){
    cook.makeShake();
  }
}

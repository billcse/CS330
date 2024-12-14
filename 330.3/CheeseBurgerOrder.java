public class CheeseBurgerOrder implements Order{
  private Cook cook;

  public CheeseBurgerOrder(Cook cook){
    this.cook = cook;
  }
  
  public void orderUp(){
    cook.cookCheeseBurger();
  }
}

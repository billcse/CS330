public class VeganBurgerOrder implements Order{
  private Cook cook;

  public VeganBurgerOrder(Cook cook){
    this.cook = cook;
  }
  
  public void orderUp(){
    cook.cookVeganburger();
  }
}

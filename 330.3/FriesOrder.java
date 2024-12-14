public class FriesOrder implements Order{
  private Cook cook;

  public FriesOrder(Cook cook){
    this.cook = cook;
  }

  public void orderUp(){
    cook.cookFries();
  }
}
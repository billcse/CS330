public class WaterOrder implements Order{
  private Cook cook;

  public WaterOrder(Cook cook){
    this.cook = cook;
  }

  public void orderUp(){
    cook.makeWater();
  }
}
package chapter11;

public class Computer extends TangibleAsset{
  String makerName;
  public Computer(String name, int price,String coler,String makerName){
    super(name, price, coler);
    this.makerName = makerName;
  }
  public String getMakerName(){return this.makerName;}
}

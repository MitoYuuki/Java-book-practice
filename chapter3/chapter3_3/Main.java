package chapter3_3;

public class Main {
  public static void main(String[] args){
    int isHungry = 1;
    String food = "みかん";
    System.out.println("こんにちは");
    if(isHungry == 0){
      System.out.println("お腹いっぱいです");
    }
    else{
      System.out.println(food +"をいただきます");
      System.out.println("ごちそうさまでした");
    }
  }
}

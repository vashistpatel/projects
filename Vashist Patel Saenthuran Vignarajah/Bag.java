// Vashist Patel
// Saenthuran Vignarajah
public class Bag{
  //Initiating Variables
  private  String name;
  private  int amount;
  //Constructor for the Bag class
  Bag(String name,int amount){
    this.name = name;
    this.amount = amount;
  }
  //Function for retreiving name of item
 String getName(){
    return name;
  }
  //Function for setting amount of items

  void setAmount(int p){
  this.amount = p;
  }
//Function for retreiving amount of items

  int getAmount(){
  return amount;
  }
}

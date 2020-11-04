// Vashist Patel 
// Saenthuran Vignarajah
public class Move{
  //intializing variables
  private  String name;
  private  String type;
  private  int power;
  private  float accuracy;
  //constructor for move
  Move(String name, String type, int power, float accuracy){
    this.name = name;
    this.type = type;
    this.power = power;
    this.accuracy = accuracy;
  }
  //get function for Name
 String getName(){
    return name;
  }
  //get function for Type

 String getType(){
    return type;
  }
  //get function for Power

  int getPower(){
    return power;
  }
  //get function for Accuracy

  float getAccuracy(){
    return accuracy;
  }
}

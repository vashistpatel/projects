// Vashist Patel
// Saenthuran Vignarajah
class Monster{
  private String name;
  private String type;
  private int hp;
  private int speed;
  private int attack;
  private int defence;
  private Move move1;
  private Move move2;
  private Move move3;
  private Move move4;
  private Bag item1;
  private Bag item2;
  private Bag item3;


  Monster(String name, String type, int hp, int speed, int attack,
    int defence , Move move1,Move move2, Move move3, Move move4, Bag item1,
    Bag item2, Bag item3){
     this.name = name;
     this.type = type;
     this.hp = hp;
     this.speed = speed;
     this.attack = attack;
     this.defence = defence;
     this.move1 = move1;
     this.move2 = move2;
     this.move3 = move3;
     this.move4 = move4;
     this.item1 = item1;
     this.item2 = item2;
     this.item3 = item3;
       }
       //get function for Name
 String getName(){
   return name;
 }
 //get function for Type
 String getType(){
   return type;
 }

 //get function for HP
 int getHP(){
   return hp;
 }
 //set function for HP

 void setHP(int hp){
   this.hp = hp;
 }
 //get function for Speed
 int getSpeed(){
   return speed;
 }
 //get function for Attack
 int getAttack(){
   return attack;
 }
 //get function for Defence
 int getDefence(){
   return defence;
 }
 //get function for getmove1
 Move getMove1(){
   return move1;
 }
 //get function for getmove2
 Move getMove2(){
   return move2;
 }
 //get function for getmove3
 Move getMove3(){
   return move3;
 }
 //get function for getmove4
 Move getMove4(){
   return move4;
 }
 //get function for getitem1
  Bag getitem1(){
    return item1;
  }
  //get function for getitem2
  Bag getitem2(){
    return item2;
  }
  //get function for getitem3
  Bag getitem3(){
    return item3;
  }
}

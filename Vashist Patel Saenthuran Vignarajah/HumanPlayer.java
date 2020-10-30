// Vashist Patel
// Saenthuran Vignarajah
import java.util.Scanner;  // Import the Scanner class
import java.util.Random;
public class HumanPlayer extends Player{
  //Constructor for human player
 HumanPlayer(Monster monster){
   this.monster = monster;
 }
/*
Function Choosemove
Tried to mimic real pokemon as possible
So the trainor is given moves, bag, run. Moves gives access to the 4 set of
moves, while bag gives a set of options for items "weak potion, pokeballs,
escape rope", if u choose Run the pokemon battle will end as u fled from
the fight.
*/
public int chooseMove(){
  //initializing variables
  int a =0;
  Scanner input = new Scanner(System.in);//creating scanner for input
  //outputting the possible moves
  System.out.println("[A]  Moves");
  System.out.println("[B]  Bag");
  System.out.println("[C]  Run");

  char b = input.next().charAt(0);//this scanner is meant for characters
  int b2 = b;//converts char values to int values

  while(b<65 || b >67){// if the char value exceeds 65 TO 67 then itll keep
                       //prompting you to put in a proper Char
    System.out.println("Please Enter a Letter A-C!");
    b = input.next().charAt(0);
  }
  if (b == 'A'){//if you choose A you get the moveset

  System.out.println("[1] Vine Whip  - Grass  - 45 Damage");
  System.out.println("[2] Tackle     - Tackle - 50 Damage");
  System.out.println("[3] Take Down  - Normal - 90 Damage");
  System.out.println("[4] Razor Leaf - Grass  - 55 Damage");

 a = input.nextInt();//the scanner that takes what moveset u choose
 while(a<0 || a >4)//checks to make sure the input is between 1 and 4
 {
     System.out.print("Please Enter a Value Between [1-4]");
     a = input.nextInt();

 }

}
if (b =='B'){//If it's B it'll display the bag contents
  /*Created a whole function called bag so we can have access to bag items,
  once a item is consumed it disapears so you have a limited amount */
  System.out.println("[1] Weak Potion x"+this.monster.getitem1().getAmount());
  System.out.println("[2] Poke Ball x"+this.monster.getitem2().getAmount());
  System.out.println("[3] Escape Rope x"+this.monster.getitem3().getAmount());
  int c = input.nextInt();//input for what item they wanna use
  while(c  <1 || c>3){ //makes sure its between 1 and 3
    System.out.print("Please Enter a Value Between [1-3]");
    c = input.nextInt();
  }
  if(c == 1){/*so if its 1 which is weak potion it will heal the pokemon by 50
    but if the pokemon exceeds 240 health it'll just set the health back to 240,
    this is also where it's set so the item gets consumed and it changes the
    amount in the bag */
    if (this.monster.getitem1().getAmount()>0){
      this.monster.getitem1().setAmount(this.monster.getitem1().getAmount()-1);
      this.monster.setHP(this.monster.getHP()+50);
      if(this.monster.getHP()>240){
        System.out.println("Bulbasaur has been healed to full Health!");
        this.monster.setHP(240);
      }else{
      System.out.println(this.monster.getName() +
      " has been healed by 50 hp. It's healh is now " + this.monster.getHP());
    }
  }else {
      System.out.println("You've run out of potions!");
    }

  }
 else if(c== 2){/*cause it's a trainor battle you can't capture another
 pokemon so it'll display this message */
  if(this.monster.getitem2().getAmount()>0){
   System.out.println("You threw a pokeball, the rival trainor blocked it!");
   System.out.println("Rival: You can't catch someone elses pokemon!");
   this.monster.getitem2().setAmount(this.monster.getitem2().getAmount()-1);
 }else{
   System.out.println("You don't have anymore pokeballs!");
 }
 }
 else if(c== 3){//cause it's a trainor battle you can't use escape rope to run
               //from a fight only in caves
  if(this.monster.getitem3().getAmount()>0){
   System.out.println("You tried using an escape rope!");
   System.out.println("Rival: You can only use escape ropes"
                                + "to escape caves, not battles!");
   this.monster.getitem3().setAmount(this.monster.getitem3().getAmount()-1);
 }else{
   System.out.println("You've run out of escape ropes!");
 }
 }


}
if (b =='C'){//vasically if u click c you flee the battle and it sets ur hp to
             //zero, causing u to lose
  System.out.println("You have fled the battle!");
  this.monster.setHP(0);
}

return a;

 }
}

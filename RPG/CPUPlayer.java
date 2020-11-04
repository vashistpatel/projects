// Vashist Patel
// Saenthuran Vignarajah
import java.util.Scanner;  // Import the Scanner class
import java.util.Random;

public class CPUPlayer extends Player{
  //Constructor
 CPUPlayer(Monster monster){
   this.monster = monster;
 }
 /*Function chooseMove

 The rundown is that this function will randomly choose what move the pokemon
 will use, basically when the pokemon's health is equal to or less than 180 the
 trainer will be given more options, such as accessing it's bag to heal his
 pokemon, once the trainor uses a heal it can't attack so the next turns will
 begin. Also made it so the health can never exceed 240. */
public int chooseMove(){
  //intializing integers and random
  int hh = 180;
  int h = this.monster.getHP();
  Random random = new Random();
  if(h < hh){ //so if current health is less than hh(180)
    int a = random.nextInt(2)+1;//will choose a number between 1 and 2
    if (a ==1){//if its 1 it will generate a number and that number will
               //correspond to an attack 1-4
      return (random.nextInt(4)+1);
    }else if (a ==2){/*If its two it'll go into it's bag and use a potion.
    Gave it unlimited potions as it's super easy to defeat cause we have a move
    that does 90 damage which outweighs the weak potions effects, so if the
    health somehow exceeds 240 itll reset health to 240 but other than that
    it will take the current health and add 50 hp points to it. */
      this.monster.setHP(this.monster.getHP()+50);
      if(this.monster.getHP()>240){
        System.out.println("Weak potion was used on Torchic!");
        System.out.println("Torchic has been healed to full Health!");
        this.monster.setHP(240);
      }else{
        System.out.println("Weak potion was used on Torchic!");
      System.out.println(this.monster.getName() +
        " has been healed by 50 hp. It's healh is now " + this.monster.getHP());
    }
  }
}else if(h>hh){//if current health is greater than the hh(180) itll choose a
               //move to use to attack
  return (random.nextInt(4)+1);

}
return 0;

  }
}

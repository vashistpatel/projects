// Vashist Patel
// Saenthuran Vignarajah
import java.util.Scanner;  // Import the Scanner class
import java.util.Random;

public class Player{
  protected Monster monster;
  //The get monster function
  public Monster getM(){
    return monster;
  }
  //the intialization of has lost function
  public boolean hasLost(){
    if (monster.getHP() <= 0){ //so monster.haslost() checks to see if
      //that monster hp is greater than 0  if its less than or equal to zero it
     //will return true
      return true;
    }else{//else it will return false
      return false;
    }
  } //intialization of choosemove function
    public int chooseMove(){
      return 0;

    }//intialization of isfasterthan function
  public boolean isFasterThan(Player enemy){//monster.isfasterthan(enemy)
    //sees which pokemon has faster speed and will make the faster
    //pokemon attack
    if( this.monster.getSpeed() > enemy.monster.getSpeed()){
      return true;
    }else {
      return false;
    }

  }
  public void Attack(Player enemy, int playerMove){
    //intialization of the variabels
     double genAccuracy = Math.random();
; //generates an accuracy between 0-1
     float moveAccuracy = 2;
     int movePower = 0;
     int pAttack = this.getM().getAttack();
     int eAttack = enemy.getM().getAttack();
     int pDefense = this.getM().getDefence();
     int eDefense = enemy.getM().getDefence();
     int eHP = enemy.getM().getHP();
     int pHP = this.getM().getHP();
     String name = "Sudo";

      if(playerMove ==1){
         name = this.getM().getMove1().getName();
         movePower =  this.getM().getMove1().getPower();
         moveAccuracy = this.getM().getMove1().getAccuracy();
      }
      else if(playerMove ==2){
         name = this.monster.getMove2().getName();
         movePower =  this.getM().getMove2().getPower();
         moveAccuracy = this.getM().getMove2().getAccuracy();
      }
      else if(playerMove ==3){
         name = this.getM().getMove3().getName();
         movePower =  this.getM().getMove3().getPower();
         moveAccuracy = this.getM().getMove3().getAccuracy();
      }
      else if(playerMove ==4){
         name = this.getM().getMove4().getName();
         movePower =  this.getM().getMove4().getPower();
         moveAccuracy = this.getM().getMove4().getAccuracy();
      }

      int damageDealth = pAttack + movePower - eDefense;
      int sHP = eHP - damageDealth;
      //if generated accuracy is less than move accuracy then the move will
      //succeed if its less than
      if(genAccuracy < moveAccuracy&& moveAccuracy <= 1){

        System.out.print(this.monster.getName() + " Has used "+name
        + " dealing ");
        System.out.print(movePower+ " damage to "+ enemy.monster.getName());
        System.out.println(" ");
        enemy.getM().setHP(sHP);

      }
      else if(moveAccuracy < genAccuracy){
        System.out.println(this.getM().getName()+"'s Attack Missed!");
      }

    }

}

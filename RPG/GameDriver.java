// Vashist Patel
// Saenthuran Vignarajah
public class GameDriver {
 public static void main(String[] args) {
 Bag item1 = new Bag("Weak Potion", 2);
 Bag item2 = new Bag("Poke Ball", 20);
 Bag item3 = new Bag("Escape Rope", 3);

 Move move1 = new Move("Vine Whip", "Grass", 45, 1.0f);
 Move move2 = new Move("Tackle", "Normal", 50, 1.0f);
 Move move3 = new Move("Take Down", "Normal", 90, 0.85f);
 Move move4 = new Move("Razor Leaf", "Grass", 55, 0.95f);
 Monster monster = new Monster("Bulbasaur", "Grass",
 240, 45, 49, 49,
 move1, move2, move3, move4, item1, item2, item3);
 Player player = new HumanPlayer(monster);
 move1 = new Move("Scratch", "Normal", 40, 1.0f);
 move2 = new Move("Ember", "Fire", 40, 1.0f);
 move3 = new Move("Peck", "Flying", 35, 1.0f);
 move4 = new Move("Fire Spin", "Fire", 35, 0.85f);
 monster = new Monster("Torchic", "Fire", 240, 45, 60, 40,
 move1, move2, move3, move4, item1, item2, item3);
 Player enemy = new CPUPlayer(monster);
 while ((!player.hasLost()) && (!enemy.hasLost())) {
 // print both monsters' HP
 System.out.println("");
 System.out.printf("%s has %d HP\n",
 player.getM().getName(),
 player.getM().getHP());
 System.out.printf("%s has %d HP\n",
 enemy.getM().getName(),
 enemy.getM().getHP());

 // decide the next move
 int playerMove = player.chooseMove();
 int enemyMove = enemy.chooseMove();


 // execute the next move
 if (player.isFasterThan(enemy)) {
 player.Attack(enemy, playerMove);
 if (!enemy.hasLost()) {
 enemy.Attack(player, enemyMove);
 }
 } else {
 enemy.Attack(player, enemyMove);
 if (!player.hasLost()) {
 player.Attack(enemy, playerMove);
 }
 }
 }

 if (player.hasLost()) {
 System.out.printf("You and %s have lost the battle.\n",
 player.getM().getName());
 } else {
 System.out.printf("You and %s are victorious!\n",
 player.getM().getName());
 }
 }
}

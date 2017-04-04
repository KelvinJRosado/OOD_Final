//Tests the Battle System using the Battle Class
public class TestBattleClass {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		
		//Make a character
		CharacterFactory cf = CharacterFactory.getFactory();
		
		cf.setCharacter();
		
		CharacterType player = cf.getCharacter();
		
		System.out.println(player.test());
		System.out.println();
		//End character creation
		
		//Beings Round 1 against an Easy Boss
		System.out.println("Round 1: Easy Boss\n");
		Battle b = new Battle(new EasyBoss(), player);//Creates the Object
		
		b.battle();//Actual battle
		
		//If player still has hp, continue
		if(!b.alive){
			return;//otherwise terminate the program
		}
		
		//Repeat for Round 2
		System.out.println("\nRound 2: Medium Boss\n");
		b.reset(new MediumBoss());//Changes Boss contained in the Battle class
		
		b.battle();
		
		if(!b.alive){
			return;
		}
		
		//Repeat for Boss 3
		System.out.println("\nRound 3: Hard Boss\n");
		b.reset(new HardBoss());
		
		b.battle();
		
		if(!b.alive){
			return;
		}
		
		//If still alive at the end, finish
		System.out.println("\nYou Beat the Game!!! Good Job!!!!");
		System.out.println("The End (?)");

	}

}

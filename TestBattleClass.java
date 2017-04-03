//Tests the Battle System using the Battle Class
public class TestBattleClass {

	public static void main(String[] args) {
		
		//Beings Round 1 against an Easy Boss
		System.out.println("Round 1: Easy Boss A");
		Battle b = new Battle(new EasyBoss(), new Wizard());//Creates the Object
		
		b.battle();//Actual battle
		
		//If player still has hp, continue
		if(!b.alive){
			return;//otherwise terminate the program
		}
		
		//Repeat for Round 2
		System.out.println("\nRound 2: Easy Boss B\n");
		b.reset(new EasyBoss());
		
		b.battle();
		
		if(!b.alive){
			return;
		}
		
		//If still alive at the end, finish
		System.out.println("\nYou Beat the Game!!! Good Job!!!!");
		System.out.println("The End (?)");

	}

}

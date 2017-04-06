
public class Game {
	
	CharacterType player;
	Battle battle;

	public Game() throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		
		CharacterFactory cf = CharacterFactory.getFactory();
		
		cf.setCharacter();
	
		player = cf.getCharacter();
		
		System.out.println(player.test());
		
	}
	
	public void play(){
		System.out.println("Round 1: Easy Boss");
		battle = new Battle(new EasyBoss(), player);
		
		battle.battle();
		
		if(!battle.alive){
			return;//terminate the program if not alive
		}
		
		System.out.println("\nRound 2: Medium Boss\n");
		battle.reset(new MediumBoss());
		
		battle.battle();
		
		if(!battle.alive){
			return;
		}
		
		System.out.println("\nRound 3: Hard Boss\n");
		battle.reset(new HardBoss());
		
		battle.battle();
		
		if(!battle.alive){
			return;
		}
		
		//If still alive at the end, finish
		System.out.println("\nYou Beat the Game!!! Good Job!!!!");
		System.out.println("The End (?)");
		
	}

}

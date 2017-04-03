//Abstracts the battle system
public class Battle {
	Boss boss;//Boss currently battling
	CharacterType player;//Player character
	boolean alive = true;//Tracks if player can still fight

	//Constructor to initialize vars
	public Battle(Boss b, CharacterType p){
		
		boss = b;
		player = p;
		
		boss.setPlayer(player);
			
	}
	
	//Sets a new boss
	public void reset(Boss b){
		
		boss = b;
		
		boss.setPlayer(player);
	}
	
	//Does the battle
	public void battle(){
		
		while(boss.getHp() > 0 && player.getHp() > 0)
			boss.attack();
		
		//Give appropriate exit message
		if(boss.getHp() <= 0)
			System.out.println("Congrats! You Beat the Boss!!");
		else if (player.getHp() <= 0){
			System.out.println("Oh No! You Lose!!");
			alive = false;
		}
		else
			System.out.println("There was an error! Bad!");
		
	}
	
	
}

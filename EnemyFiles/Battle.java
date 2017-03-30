//Uses composition to battle
public class Battle {
	Boss boss;//Boss currently battling
	CharacterType player;//Player character

	//Constructor to initialize vars
	public Battle(Boss b, CharacterType p){
		
		boss = b;
		player = p;
			
	}
	
	//Sets a new boss
	public void reset(Boss b){
		
		boss = b;
		
	}
	
	
}

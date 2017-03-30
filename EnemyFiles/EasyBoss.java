
public class EasyBoss extends Boss{

	//Initialize characters
	public EasyBoss(){
		setHp(30);//Set hp
		
		//Add questions here
		questions.add(new Question("2 + 2?", "4", "2", "22", "10"));
		questions.add(new Question("First letter of the alphabet?", "A", "Z", "D", "F"));
	}
	
	//Attack the player
	public void attack(){
		
		getQuestion().ask();
		
	}
	
	
}

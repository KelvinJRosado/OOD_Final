//A rough idea for a Boss 
public class SampleBoss extends Boss{

	//Constructor, sets hp, initializes ArrayList, and adds a question
	public SampleBoss(){
		setHp(15);
		
		addQuestion(new Question("What is 2 + 2?", "4","8","1","10"));
		
	}
	
	

}

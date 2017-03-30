
public class EasyBoss extends Boss{

	//Initialize characters
	public EasyBoss(){
		setHp(30);//Set hp
		
		//Add questions here
		questions.add(new Question("A language which is close to that used within the computer is ", "Low-level language", "High-level language", "Assembly language", "None of the above"));
		questions.add(new Question("The first generation of computers available was based on the bit micro processors. ", "8", "4", "16", "64"));
		questions.add(new Question("The step-by- step instructions that solve a problem are called _____. ", "An algorithm", "A list", "A plan", "A sequential structure"));
		questions.add(new Question("The operator used to get value at address stored in a pointer variable is ", "*", "&", "&&", "||"));
		
		
		
	}
	
	//Attack the player
	public void attack(){
		
		getQuestion().ask();
		
	}
	
	
}

import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

//All-in-One Class that would allow GUI elements to access everything
public class NonAbstract {
	
	//Global elements go here
	static String[] type = new String[]{"Knight", "Viking", "Wizard"};//Character Choices
	static CharacterType player = null;//Concrete player
	static Boss boss = null;//Concrete Boss
	static Iterator<Question> iterator;
	
	//Will be GUI elements in Android
	//Using Strings to represent TextBoxes
	static String question;//Question to ask
	static String choiceA, choiceB, choiceC, choiceD;//Choices
	static String key;//Correct choice
	static String choice;//Player choice
	static final String prompt = "Choose your answer: ";
	

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		
		//Create Singleton Factory
		CharacterFactory factory = CharacterFactory.getFactory();
		
		//Set Character Type through Factory
		factory.setType(type[2]);//Make a wizard
		
		player = factory.getCharacter();//Set character
		
		System.out.println(player.test());
		
		boss = new EasyBoss();//Set Boss
		iterator = boss.questions.iterator();//Set up iterator
		
		//While boss and player are alive, fight
		while(boss.getHp() > 0 && player.getHp() > 0){
			
			display();//Fill GUI and display question
		
			ask();//Ask question
		
		}
		
		if(player.getHp() <= 0){
			System.out.println("You lose!");
			return;
		}
		else{
			System.out.println("You win!");
			System.out.println("Continue to next boss\n");
		}
		
		//Set new boss
		boss = new MediumBoss();
		iterator = boss.questions.iterator();
		
		//While boss and player are alive, fight
		while(boss.getHp() > 0 && player.getHp() > 0){
			
			display();//Fill GUI and display question
		
			ask();//Ask question
		
		}
		
		if(player.getHp() <= 0){
			System.out.println("You lose!");
			return;
		}
		else{
			System.out.println("You win!");
			System.out.println("Continue to final boss\n");
		}
		
		boss = new HardBoss();
		iterator = boss.questions.iterator();
		
		while(boss.getHp() > 0 && player.getHp() > 0){
			
			display();//Fill GUI and display question
		
			ask();//Ask question
		
		}
		
		if(player.getHp() <= 0){
			System.out.println("You lose!");
			return;
		}
		else{
			System.out.println("You win!");
			System.out.println("You Beat the game!!!!");
		}

	}
	
	static void display(){
		
		if(!iterator.hasNext()){
			Collections.shuffle(boss.questions);
			iterator = boss.questions.iterator();
		}
		
		iterator.next().set();//Fill "BUttons" with choices
	
		
		//Display
		System.out.println(question);
		System.out.println(choiceA);
		System.out.println(choiceB);
		System.out.println(choiceC);
		System.out.println(choiceD);
	}
	
	//Can be rewritten with Buttons
	//Scanner is only for text Based Version
	static void ask(){
		Scanner input = new Scanner(System.in);
		System.out.println(prompt);
		choice = input.next();
		
		if(choice.equals(key)){//Correct
			System.out.println("Correct");
			boss.takeDamage(player.getDamage());
			System.out.println("\nBoss remaining hp: " + boss.getHp() + "\n");
		}
		else{
			System.out.println("Wrong");
			player.getHit();
			System.out.println("\nYour remaining hp: " + player.getHp() + "\n");
		}
		
	}

}

import java.util.ArrayList;
import java.util.Random;
//Boss character; Synonymous with enemy 
public abstract class Boss {

	protected int hp;//Health of enemy
	protected ArrayList<Question> questions;//Questions asked by boss
	protected CharacterType player;//Player fighting the boss

	//Sets hp to specified amount and initializes ArrayList
	public void setHp(int h){
		hp = h;
		questions = new ArrayList<Question>();
	}
	
	//Take damage equal to specified amount
	public void takeDamage(int damage){
		hp -= damage;
		System.out.println(hp);//Just here to suppress warning message
	}
	
	//Generates a random number in range [0,questions.size() - 1]
	//Used to pick which question is asked
	protected int randNum(){
		Random r = new Random();
		return r.nextInt(questions.size());
	}
	
	//Uses a random number to pick a random question in the ArrayList
	public Question getQuestion(){
		
		int i = randNum();
		
		return questions.get(i);
		
	}
	
	//Adds a Question to the ArrayList
	public void addQuestion(Question q){
		questions.add(q);
	}
	
	//Sets the player var
	public void setPlayer(CharacterType c){
		player = c;
	}

	//Returns current hp
	public int getHp() {
		return hp;
	}

	//Attack the player
	public void attack(){
		Question q = getQuestion();
		
		if(q.ask()){
			takeDamage(player.getDamage());
			System.out.println("\nCorrect! You have hit the boss for " + player.getDamage() + " damage!");
			System.out.println("Boss remaining hp: " + hp);
			questions.remove(q);
			System.out.println();
		}
		else {
			player.getHit();
			System.out.println("\nWrong! The boss hits you for 10 damage");
			System.out.println("Your remaining hp: " + player.getHp());
			System.out.println();
		}
		
	}
	
}

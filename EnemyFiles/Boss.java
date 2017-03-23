import java.util.ArrayList;
import java.util.Random;
//Boss character; Synonymous with enemy 
public abstract class Boss {

	private int hp;//Health of enemy
	ArrayList<Question> questions;//Questions asked by boss

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
	private int randNum(){
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
	
}

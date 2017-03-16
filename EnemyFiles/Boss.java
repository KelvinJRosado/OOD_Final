import java.util.ArrayList;
import java.util.Random;
//Boss character; Synonomous with enemy 
public abstract class Boss {

	private int hp;//Health of enemy
	ArrayList<Question> questions;//Questions asked by boss
	
	public void setHp(int h){
		hp = h;
	}
	
	//Take damage equal to specified ammount
	public void takeDamage(int damage){
		hp -= damage;
	}
	
	//Generates a random number in range [0,questions.size() - 1]
	//Used to pick which question is asked
	private int randNum(){
		Random r = new Random();
		return r.nextInt(questions.size());
	}
	
}

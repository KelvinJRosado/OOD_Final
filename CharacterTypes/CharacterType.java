//Parent Class for our players
public abstract class CharacterType {
	
	private int hp;//Ammount of health of player
	private int damage;//Damage dealt by player
	private String type;//Specific type of character
	
	//Used in constructor to set initial hp
	public void setHp(int h){
		hp = h;
	}
	
	//Used in constructor to set damage dealt
	public void setDamage(int d){
		damage = d;
	}

	//Used in constructor to set type of character
	public void setType(String t){
		type = t;
	}
	
	//Used when player takes damage
	public void getHit(){
		hp -= 10;//Every enemy does 10 damage
	}
	
	//Used when player hits an enemy
	public void doDamage(Boss b){
		//Enemy == Boss
		b.takeDamage(damage);//Enemy takes damage equal to damage attribute of player
	}
	
}

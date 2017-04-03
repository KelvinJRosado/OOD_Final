//Tests the EasyBoss methods
//Outdated now
public class TestEasyBattle {

	public static void main(String[] args) {
		//Create Player Character and EasyBoss
		CharacterType me = new Knight();
		EasyBoss b = new EasyBoss();
		
		//Fight. AS long as either character has some hp, continue fighting
		while(b.getHp() > 0 && me.getHp() > 0)
			b.attack();
		
		//Give appropriate exit message
		if(b.getHp() <= 0)
			System.out.println("Congrats! You Win!!");
		else if (me.getHp() <= 0)
			System.out.println("Oh No! You Lose!!");
		else
			System.out.println("There was an error! Bad!");

	}

}

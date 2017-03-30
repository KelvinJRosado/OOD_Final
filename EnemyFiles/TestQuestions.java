//Tests the EasyBoss methods
public class TestEasyBattle {

	public static void main(String[] args) {
		//Create Player Character and EasyBoss
		CharacterType me = new Wizard();
		EasyBoss b = new EasyBoss(me);
		
		//Attack the player character
		b.attack();

	}

}

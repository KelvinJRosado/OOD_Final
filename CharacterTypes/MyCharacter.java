
public class MyCharacter {

	public static void main(String[] args) throws InstantiationException, 
	IllegalAccessException, ClassNotFoundException{
		
		CharacterFactory cf = CharacterFactory.getFactory();
		
		cf.setCharacter();
	
		CharacterType c = cf.getCharacter();
		
		System.out.println(c.test());
				
		
	}

}

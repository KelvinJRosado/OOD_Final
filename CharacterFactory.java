import java.util.Scanner;
//Factory that makes CharacterType objects
public class CharacterFactory {
	static CharacterFactory cf = null;
	CharacterType character = null;
	
	//Private constructor
	private CharacterFactory(){
		System.setProperty("charType", "Knight");
	}
	
	//Sets type of character
	public void setType(String t){
		System.setProperty("charType", t);
	}
	
	//Sets the character variable to the specified class
	public void setCharacter(){
		Scanner in = new Scanner(System.in);
		
		String type = "Knight";
		
		System.out.println("Which character do you want? " + 
				"Knight, Viking, or Wizard");
		
		type = in.next();
		
		cf.setType(type);
		
	}
	
	//Runs the test() method for specified CharacterType
	public String getType() throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		
		String s = System.getProperty("charType");
		
		character = (CharacterType) Class.forName(s).newInstance();
		
		return character.test();
		
	}
	
	//Returns the factory
	public static synchronized CharacterFactory getFactory() {
		if(cf == null)
			cf = new CharacterFactory();
		
		return cf;
	}
	
	//Returns the object for the created Character
	public CharacterType getCharacter() throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		
		String s = System.getProperty("charType");
		
		character = (CharacterType) Class.forName(s).newInstance();
		
		return character;
		
	}
	
}

import java.util.Scanner;
public class CharacterFactory {
	static CharacterFactory cf = null;
	CharacterType character = null;
	
	private CharacterFactory(){
		System.setProperty("charType", "Knight");
	}
	
	public void setType(String t){
		System.setProperty("charType", t);
	}
	
	public void setCharacter(){
		Scanner in = new Scanner(System.in);
		
		String type = "Knight";
		
		System.out.println("Which character do you want? " + 
				"Knight, Viking, or Wizard");
		
		type = in.next();
		
		in.close();
		
		cf.setType(type);
		
	}
	
	public String getType() throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		
		String s = System.getProperty("charType");
		
		character = (CharacterType) Class.forName(s).newInstance();
		
		return character.test();
		
	}
	
	public static synchronized CharacterFactory getFactory() {
		if(cf == null)
			cf = new CharacterFactory();
		
		return cf;
	}
	
	public CharacterType getCharacter() throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		
		String s = System.getProperty("charType");
		
		character = (CharacterType) Class.forName(s).newInstance();
		
		return character;
		
	}
	
}

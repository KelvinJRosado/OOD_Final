
public class CharacterFactory {
	static CharacterFactory cf = null;
	CharacterType character = null;
	
	private CharacterFactory(){
		System.setProperty("charType", "Knight");
	}
	
	public void setType(String t){
		System.setProperty("charType", t);
	}
	
	public String getType() throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		
		String s = System.getProperty("charType");
		
		character = (CharacterType) Class.forName(s).newInstance();
		
		return character.test();
		
	}
	
	public static synchronized CharacterFactory getFactory(){
		if(cf == null)
			cf = new CharacterFactory();
		
		return cf;
	}
	
}

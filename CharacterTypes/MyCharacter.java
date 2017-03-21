import java.util.Scanner;

public class MyCharacter {

	public static void main(String[] args) throws InstantiationException, 
	IllegalAccessException, ClassNotFoundException{
		
		CharacterFactory cf = CharacterFactory.getFactory();
		
		String type = "Knight";
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Which character do you want? " + 
		"Knight, Viking, or Wizard");
		
		type = in.next();
		
		in.close();
		
		cf.setType(type);
		
		System.out.println(cf.getType());
				
		
	}

}

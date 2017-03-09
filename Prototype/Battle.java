import java.util.Scanner;
public class Battle {

	public static void main(String[] args) {
		Question q = new Question();
		Scanner in = new Scanner(System.in);
		int option;
		
		System.out.println("The Math Monster approaches you in battle!");
		System.out.println("\nHe says: " + q.qs[0]);
		System.out.println("What is your attack!?");
		System.out.println("Choice 1: " + q.as[0]);
		System.out.println("Choice 2: " + q.as[1]);
		System.out.println("Choice 3: " + q.as[2]);
		System.out.println("Choice 4: " + q.as[3]);
		System.out.println("\nType the number of your choice to attack!");
		
		option = in.nextInt();
		
		if(option == 4)
			System.out.println("Correct! You have slain the Math Monster.");
		else
			System.out.println("Incorrect! The Math Monster ate you ... you dead");
		
		in.close();
		
	}

}

//Sample Boss class to test
public class MyBoss {

	public static void main(String[] args) {
		
		Boss b = new SampleBoss();//Polymorphism :D
		
		b.getQuestion().ask();//Run the ask() method; ie Pick a random question and ask it

	}

}

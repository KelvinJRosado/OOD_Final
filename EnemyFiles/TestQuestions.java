//Test the Question Class
public class TestQuestions {

	public static void main(String[] args) {
		//Asks what the first letter is and provides choices
		Question q = new Question("First letter of the alphabet?", "A", "Z", "D", "F");
		//Asks for 2 + 2 and provides choices
		Question q2 = new Question("2 + 2?", "4", "2", "22", "10");
		
		q.ask();
		q2.ask();

	}

}

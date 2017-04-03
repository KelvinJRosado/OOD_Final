import java.util.Random;
import java.util.Scanner;

//Class that contains questions, answer, and 3 wrong choices
public class Question {

	private String quest;//Question
	private String ans;//Correct answer to the question
	private String wrong1, wrong2, wrong3;//Wrong answers to the question
	static 	Scanner input = new Scanner(System.in);
	private int seed;//Holds which order is used for display
	private String key;//Used to check answer
	
	//Constructor with specified values
	public Question(String q, String a, String w1, String w2, String w3){
		quest = q;//Given question
		ans = a;//Given answer
		wrong1 = w1;//Given wrong choice 1
		wrong2 = w2;//Given wrong choice 2
		wrong3 = w3;//GIven wrong choice 3
	}
	
	//Accessor and Mutator methods
	public void setQuestion(String q){
		quest = q;
	}
	
	public String getQuestion(){
		return quest;
	}
	
	public void setAnswer(String a){
		ans = a;
	}
	
	public String getAnswer(){
		return ans;
	}
	
	public void setWrong1(String w){
		wrong1 = w;
	}
	
	public String getWrong1(){
		return wrong1;
	}
	
	public void setWrong2(String w){
		wrong2 = w;
	}
	
	public String getWrong2(){
		return wrong2;
	}
	
	public void setWrong3(String w){
		wrong3 = w;
	}
	
	public String getWrong3(){
		return wrong3;
	}
	
	//Displays the choices in random order
	private void display(){
		System.out.println(quest);//Print the question
		Random r = new Random();
		seed = r.nextInt(24);//Generates random number between 0 and 23
		
		switch(seed){//Generate random number from 0 to 23 
		//and display choices in that order
		case 0: 
			System.out.println("A) " + ans);
			System.out.println("B) " + wrong1);
			System.out.println("C) " + wrong2);
			System.out.println("D) " + wrong3);
			key = "A";
			break;
		case 1: 
			System.out.println("A) " + ans);
			System.out.println("B) " + wrong2);
			System.out.println("C) " + wrong1);
			System.out.println("D) " + wrong3);
			key = "A";
			break;
		case 2: 
			System.out.println("A) " + ans);
			System.out.println("B) " + wrong2);
			System.out.println("C) " + wrong3);
			System.out.println("D) " + wrong1);
			key = "A";
			break;
		case 3: 
			System.out.println("A) " + ans);
			System.out.println("B) " + wrong1);
			System.out.println("C) " + wrong3);
			System.out.println("D) " + wrong2);
			key = "A";
			break;
		case 4: 
			System.out.println("A) " + ans);
			System.out.println("B) " + wrong3);
			System.out.println("C) " + wrong1);
			System.out.println("D) " + wrong2);
			key = "A";
			break;
		case 5: 
			System.out.println("A) " + ans);
			System.out.println("B) " + wrong3);
			System.out.println("C) " + wrong2);
			System.out.println("D) " + wrong1);
			key = "A";
			break;
		case 6: 
			System.out.println("A) " + wrong1);
			System.out.println("B) " + ans);
			System.out.println("C) " + wrong2);
			System.out.println("D) " + wrong3);
			key = "B";
			break;
		case 7: 
			System.out.println("A) " + wrong1);
			System.out.println("B) " + ans);
			System.out.println("C) " + wrong3);
			System.out.println("D) " + wrong2);
			key = "B";
			break;
		case 8: 
			System.out.println("A) " + wrong2);
			System.out.println("B) " + ans);
			System.out.println("C) " + wrong1);
			System.out.println("D) " + wrong3);
			key = "B";
			break;
		case 9: 
			System.out.println("A) " + wrong2);
			System.out.println("B) " + ans);
			System.out.println("C) " + wrong3);
			System.out.println("D) " + wrong1);
			key = "B";
			break;
		case 10: 
			System.out.println("A) " + wrong3);
			System.out.println("B) " + ans);
			System.out.println("C) " + wrong2);
			System.out.println("D) " + wrong1);
			key = "B";
			break;
		case 11: 
			System.out.println("A) " + wrong3);
			System.out.println("B) " + ans);
			System.out.println("C) " + wrong1);
			System.out.println("D) " + wrong2);
			key = "B";
			break;
		case 12: 
			System.out.println("A) " + wrong1);
			System.out.println("B) " + wrong2);
			System.out.println("C) " + ans);
			System.out.println("D) " + wrong3);
			key = "C";
			break;
		case 13: 
			System.out.println("A) " + wrong1);
			System.out.println("B) " + wrong3);
			System.out.println("C) " + ans);
			System.out.println("D) " + wrong2);
			key = "C";
			break;
		case 14: 
			System.out.println("A) " + wrong2);
			System.out.println("B) " + wrong1);
			System.out.println("C) " + ans);
			System.out.println("D) " + wrong3);
			key = "C";
			break;
		case 15: 
			System.out.println("A) " + wrong2);
			System.out.println("B) " + wrong3);
			System.out.println("C) " + ans);
			System.out.println("D) " + wrong1);
			key = "C";
			break;
		case 16: 
			System.out.println("A) " + wrong3);
			System.out.println("B) " + wrong2);
			System.out.println("C) " + ans);
			System.out.println("D) " + wrong1);
			key = "C";
			break;
		case 17: 
			System.out.println("A) " + wrong3);
			System.out.println("B) " + wrong1);
			System.out.println("C) " + ans);
			System.out.println("D) " + wrong2);
			key = "C";
			break;
		case 18: 
			System.out.println("A) " + wrong1);
			System.out.println("B) " + wrong2);
			System.out.println("C) " + wrong3);
			System.out.println("D) " + ans);
			key = "D";
			break;
		case 19: 
			System.out.println("A) " + wrong1);
			System.out.println("B) " + wrong3);
			System.out.println("C) " + wrong2);
			System.out.println("D) " + ans);
			key = "D";
			break;
		case 20: 
			System.out.println("A) " + wrong2);
			System.out.println("B) " + wrong1);
			System.out.println("C) " + wrong3);
			System.out.println("D) " + ans);
			key = "D";
			break;
		case 21: 
			System.out.println("A) " + wrong2);
			System.out.println("B) " + wrong3);
			System.out.println("C) " + wrong1);
			System.out.println("D) " + ans);
			key = "D";
			break;
		case 22: 
			System.out.println("A) " + wrong3);
			System.out.println("B) " + wrong2);
			System.out.println("C) " + wrong1);
			System.out.println("D) " + ans);
			key = "D";
			break;
		case 23: 
			System.out.println("A) " + wrong3);
			System.out.println("B) " + wrong1);
			System.out.println("C) " + wrong2);
			System.out.println("D) " + ans);
			key = "D";
			break;
		}
		
	}
	
	//Checks answer and sets "attack" if answer is wrong
	private boolean checkAns(){
		//User types actual answer, not letter choice
		//Method checks if answer is correct
		System.out.println("Type your answer below: ");
		String test = input.next();
		if(test.equals(key) || test.equals(key.toLowerCase()))
			return true;
		else
			return false;
		
	}
	
	//Method called to ask a question and verify answer
	public boolean ask(){
		display();
		return checkAns();
	}
	
	
}

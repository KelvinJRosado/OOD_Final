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
	public void set(){
		//System.out.println(quest);//Print the question
		NonAbstract.question = quest;
		Random r = new Random();
		seed = r.nextInt(24);//Generates random number between 0 and 23
		
		switch(seed){//Generate random number from 0 to 23 
		//and display choices in that order
		case 0: 
			NonAbstract.choiceA = "A) " +  ans;
			NonAbstract.choiceB = "B) " + wrong1;
			NonAbstract.choiceC = "C) " + wrong2;
			NonAbstract.choiceD = "D) " + wrong3;
			NonAbstract.key = "A";
			break;
		case 1: 
			NonAbstract.choiceA = "A) " +  ans;
			NonAbstract.choiceB = "B) " + wrong2;
			NonAbstract.choiceC = "C) " + wrong1;
			NonAbstract.choiceD = "D) " + wrong3;
			NonAbstract.key = "A";
			break;
		case 2: 
			NonAbstract.choiceA = "A) " +  ans;
			NonAbstract.choiceB = "B) " + wrong2;
			NonAbstract.choiceC = "C) " + wrong3;
			NonAbstract.choiceD = "D) " + wrong1;
			NonAbstract.key = "A";
			break;
		case 3: 
			NonAbstract.choiceA = "A) " +  ans;
			NonAbstract.choiceB = "B) " + wrong1;
			NonAbstract.choiceC = "C) " + wrong3;
			NonAbstract.choiceD = "D) " + wrong2;
			NonAbstract.key = "A";
			break;
		case 4: 
			NonAbstract.choiceA = "A) " +  ans;
			NonAbstract.choiceB = "B) " + wrong3;
			NonAbstract.choiceC = "C) " + wrong1;
			NonAbstract.choiceD = "D) " + wrong2;
			NonAbstract.key = "A";
			break;
		case 5: 
			NonAbstract.choiceA = "A) " +  ans;
			NonAbstract.choiceB = "B) " + wrong3;
			NonAbstract.choiceC = "C) " + wrong2;
			NonAbstract.choiceD = "D) " + wrong1;
			NonAbstract.key = "A";
			break;
		case 6: 
			NonAbstract.choiceA = "A) " + wrong1;
			NonAbstract.choiceB = "B) " + ans;
			NonAbstract.choiceC = "C) " + wrong2;
			NonAbstract.choiceD = "D) " + wrong3;
			NonAbstract.key = "B";
			break;
		case 7: 
			NonAbstract.choiceA = "A) " + wrong1;
			NonAbstract.choiceB = "B) " + ans;
			NonAbstract.choiceC = "C) " + wrong3;
			NonAbstract.choiceD = "D) " + wrong2;
			NonAbstract.key = "B";
			break;
		case 8: 
			NonAbstract.choiceA = "A) " + wrong2;
			NonAbstract.choiceB = "B) " + ans;
			NonAbstract.choiceC = "C) " + wrong1;
			NonAbstract.choiceD = "D) " + wrong3;
			NonAbstract.key = "B";
			break;
		case 9: 
			NonAbstract.choiceA = "A) " + wrong2;
			NonAbstract.choiceB = "B) " + ans;
			NonAbstract.choiceC = "C) " + wrong3;
			NonAbstract.choiceD = "D) " + wrong1;
			NonAbstract.key = "B";
			break;
		case 10: 
			NonAbstract.choiceA = "A) " + wrong3;
			NonAbstract.choiceB = "B) " + ans;
			NonAbstract.choiceC = "C) " + wrong2;
			NonAbstract.choiceD = "D) " + wrong1;
			NonAbstract.key = "B";
			break;
		case 11: 
			NonAbstract.choiceA = "A) " + wrong3;
			NonAbstract.choiceB = "B) " + ans;
			NonAbstract.choiceC = "C) " + wrong1;
			NonAbstract.choiceD = "D) " + wrong2;
			NonAbstract.key = "B";
			break;
		case 12: 
			NonAbstract.choiceA = "A) " + wrong1;
			NonAbstract.choiceB = "B) " + wrong2;
			NonAbstract.choiceC = "C) " + ans;
			NonAbstract.choiceD = "D) " + wrong3;
			NonAbstract.key = "C";
			break;
		case 13: 
			NonAbstract.choiceA = "A) " + wrong1;
			NonAbstract.choiceB = "B) " + wrong3;
			NonAbstract.choiceC = "C) " + ans;
			NonAbstract.choiceD = "D) " + wrong2;
			NonAbstract.key = "C";
			break;
		case 14: 
			NonAbstract.choiceA = "A) " + wrong2;
			NonAbstract.choiceB = "B) " + wrong1;
			NonAbstract.choiceC = "C) " + ans;
			NonAbstract.choiceD = "D) " + wrong3;
			NonAbstract.key = "C";
			break;
		case 15: 
			NonAbstract.choiceA = "A) " + wrong2;
			NonAbstract.choiceB = "B) " + wrong3;
			NonAbstract.choiceC = "C) " + ans;
			NonAbstract.choiceD = "D) " + wrong1;
			NonAbstract.key = "C";
			break;
		case 16: 
			NonAbstract.choiceA = "A) " + wrong3;
			NonAbstract.choiceB = "B) " + wrong2;
			NonAbstract.choiceC = "C) " + ans;
			NonAbstract.choiceD = "D) " + wrong1;
			NonAbstract.key = "C";
			break;
		case 17: 
			NonAbstract.choiceA = "A) " + wrong3;
			NonAbstract.choiceB = "B) " + wrong1;
			NonAbstract.choiceC = "C) " + ans;
			NonAbstract.choiceD = "D) " + wrong2;
			NonAbstract.key = "C";
			break;
		case 18: 
			NonAbstract.choiceA = "A) " + wrong1;
			NonAbstract.choiceB = "B) " + wrong2;
			NonAbstract.choiceC = "C) " + wrong3;
			NonAbstract.choiceD = "D) " + ans;
			NonAbstract.key = "D";
			break;
		case 19: 
			NonAbstract.choiceA = "A) " + wrong1;
			NonAbstract.choiceB = "B) " + wrong3;
			NonAbstract.choiceC = "C) " + wrong2;
			NonAbstract.choiceD = "D) " + ans;
			NonAbstract.key = "D";
			break;
		case 20: 
			NonAbstract.choiceA = "A) " + wrong2;
			NonAbstract.choiceB = "B) " + wrong1;
			NonAbstract.choiceC = "C) " + wrong3;
			NonAbstract.choiceD = "D) " + ans;
			NonAbstract.key = "D";
			break;
		case 21: 
			NonAbstract.choiceA = "A) " + wrong2;
			NonAbstract.choiceB = "B) " + wrong3;
			NonAbstract.choiceC = "C) " + wrong1;
			NonAbstract.choiceD = "D) " + ans;
			NonAbstract.key = "D";
			break;
		case 22: 
			NonAbstract.choiceA = "A) " + wrong3;
			NonAbstract.choiceB = "B) " + wrong2;
			NonAbstract.choiceC = "C) " + wrong1;
			NonAbstract.choiceD = "D) " + ans;
			NonAbstract.key = "D";
			break;
		case 23: 
			NonAbstract.choiceA = "A) " + wrong3;
			NonAbstract.choiceB = "B) " + wrong1;
			NonAbstract.choiceC = "C) " + wrong2;
			NonAbstract.choiceD = "D) " + ans;
			NonAbstract.key = "D";
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
		//display();
		return checkAns();
	}
	
	
}

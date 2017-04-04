//Concrete Medium Boss
public class MediumBoss extends Boss{

	public MediumBoss(){
		
		setHp(60);
		
		questions.add(new Question("A single packet on a data link is known as ", "Frame", "Path", "Block", "Group"));
		questions.add(new Question("ASCII stands for ", "American standard code for information interchange", "All purpose scientific code for information interchange", "American security code for information interchange", "American Scientific code for information interchange"));
		questions.add(new Question("Which language was devised by Dr. Seymour Aubrey Papert? ", "LOGO", "APL", "COBOL", "FORTRAN"));
		questions.add(new Question("A memory that does not change its contents without external causes is known as ", "Static memory", "Dynamic memory", "RAM", "EEPROM"));
		questions.add(new Question("The organization and interconnection of the various components of a computer system is ", "Architecture", "Networks", "Graphics", "Designing"));
		questions.add(new Question("A default catch block catches ", "any thrown object that has not been caught by an earlier catch block", "all thrown objects", "no thrown objects", "all thrown objects that have been caught by an earlier catch block"));
		questions.add(new Question("In SQL, which command is used to make permanent changes made by statements issue since the beginning of a transaction? ", "COMMIT", "PACK", "ZIP", "SAVE"));
		questions.add(new Question("In SQL, which command(s) is(are) used to enable/disable a database trigger? ", "ALTER TRIGGER", "MODIFY USER", "CHANGE USER", "None of the above"));
		questions.add(new Question("In which statements, does a 'continue' statements cause the control to go directly to the test condition and then continue the looping process? ", "'while' and 'do-while'", "'while' and 'if-else'", "'do-while' and 'if-else'", "None of the above"));
		questions.add(new Question("Who is considered to be the 'father' of artificial intelligence? ", "John McCarthy", "Allen Newell", "Alan Turning", "None of the above"));
		questions.add(new Question("A CASE SQL statement is which of the following? ", "A way to establish an IF-THEN- ELSE in SQL.", "A way to establish a loop in SQL.", "A way to establish a data definition in SQL.", "All of the above."));
		questions.add(new Question("Which of the following mechanisms is/are provided by an Object Oriented Language to implement Object Oriented Model? ", "All of the Above", "Encapsulation", "Inheritance", "Polymorphism"));
		
		
	}
	
}

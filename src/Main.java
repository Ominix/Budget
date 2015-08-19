import java.io.IOException;
import java.util.Scanner;

public class Main {
	
	
	public static void main(String[] args) {
		//instantiating objects
		Prompt intro = new Prompt(); //creating new Prompt
		Scanner scanner = new Scanner(System.in); //creating new scanner
		Validation check = new Validation();
		Calcs calcs = new Calcs();
		
		intro.info();
		
		intro.say("What is your first name: "); //prompting for first name		
		String firstName = scanner.nextLine(); //accepting first name
		firstName = check.properCase(firstName); //making sure first name is capitalized 
		
		
		intro.say("What is your last name: "); //prompting for last name
		String lastName = scanner.nextLine(); //accepthing last name
		check.properCase(lastName); //making sure last name is capitalized
		lastName = check.properCase(lastName);
		
		System.out.println("Hello, " + firstName + " " + lastName + ".");
		
		System.out.println(firstName + ", are you ready to start budgeting?"); //Prompt to see if user is ready to start budgeting
		intro.say("Y/N: ");
		String yOrN = scanner.nextLine();		
		yOrN = check.properCase(yOrN); //changing y or n to uppercase
		
		boolean running = false;
		if (yOrN.equals("Y")){
			running = true;
		}
		
								
		while(running){  //MAIN PROGRAM LOOP
			calcs.getIncome();
			
			running = false;
			System.out.println("Program Stopped");
		}

	}

}

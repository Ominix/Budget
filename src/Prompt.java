/*
 * This is the Prompt class. 
 * This class will hold everything that will prompt the user for input, talk to the user or just whatever 
 */

import java.util.Scanner;

public class Prompt { 
	
	public void info(){ 		//This is just a greeting to start the program
		System.out.println("Hello! This is a budget program.");
		System.out.println("This program's purpose is to keep you from financial fuck-ed-ness");
	}
	
	public void say(String question){	//This method asks a simple question
		System.out.print(question);
	}
	
}

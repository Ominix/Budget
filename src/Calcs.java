import java.util.Scanner;

public class Calcs {
	//defining variables for the class
	String incomeName = "", yOrN = "";
	int income = 0;

		
	Scanner scanner = new Scanner(System.in); //instantiating the scanner for use by the class
	private Validation check = new Validation();
	
	public void getIncome(){		
		System.out.print("Please enter the name of your your income: "); //asking for the name of the first income
		incomeName = scanner.nextLine(); //accepting name of income
		
		
		System.out.print("How much income is generated from " + incomeName + ": $"); //asking for the amount of
		income = Integer.parseInt(scanner.nextLine().trim()); //accepting amt of income
		
		System.out.print("Would you like to add another income? Y or N: "); //checking if user would like to add another income
		yOrN = scanner.nextLine();	//accepting answer
		yOrN = check.properCase(yOrN); //changing y or n to uppercase
		
	}

}

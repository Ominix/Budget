import java.util.ArrayList;
import java.util.Scanner;

public class Calcs {
	//defining variables for the class
	String incomeName = "", yOrN = "";
	int income = 0;
	
	ArrayList<String> incomeNameArray = new ArrayList<String>();
	ArrayList<Integer> incomeArray = new ArrayList<Integer>();
	Scanner scanner = new Scanner(System.in); //instantiating the scanner for use by the class
	private Validation check = new Validation();
	
	public void getIncome(){		
		
		int x = 0;
		while(x != 1){
			
			System.out.print("Please enter the name of your your income: "); //asking for the name of the first income
			incomeName = scanner.nextLine(); //accepting name of income
			incomeNameArray.add(incomeName);
			
			System.out.print("How much income is generated from " + incomeName + ": $"); //asking for the amount of
			income = Integer.parseInt(scanner.nextLine().trim()); //accepting amt of income
			incomeArray.add(income);
			
			System.out.print("Would you like to add another income? Y or N: "); //checking if user would like to add another income
			yOrN = scanner.nextLine();	//accepting answer
			yOrN = check.properCase(yOrN); //changing y or n to uppercase
			
			if (yOrN.equals("N")){
				x = 1;
				System.out.println(incomeNameArray);
				System.out.println(incomeArray);
			}
		}
		
		
		
	}
}

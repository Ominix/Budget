import java.util.ArrayList;
import java.util.Scanner;

public class Calcs {
	//defining variables for the class
	String incomeName = "";
	double income = 0;
	Calcs[] incomeList = new Calcs[2]; //instantiating an array to hold my income name and amount
	
	Scanner scanner = new Scanner(System.in); //instantiating the scanner for use by the class
	ArrayList<Calcs> incomeIndex = new ArrayList<Calcs>();
	
	public void getIncome(){		
		
		int x = 1;
		while(x == 1){
			
			System.out.print("Please enter the name of your your income: "); //asking for the name of the first income
			incomeName = scanner.nextLine();//accepting name of income
			
			
			System.out.print("How much income is generated from " + incomeName + ": $"); //asking for the amount of
			income = scanner.nextDouble();
			
			incomeIndex.add(incomeName, income);
		
		}
	}

}

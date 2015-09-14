package Main;
// Chris Knupp and Justin Weaver
import java.util.Scanner;

import org.apache.poi.ss.formula.functions.FinanceLib;

public class Lab {
	public static void main (String args[]){
		System.out.println("Welcome to Retirement Plan. Please follow the instrctions to find what you need to save");
		// setting up introduction message
		Scanner scnr = new Scanner(System.in);
		// setting up scanner
		System.out.println("Please input how many years you plan to work: ");
		double yearsworked = scnr.nextInt();
		// creating new variable
		System.out.println("Please input expected average return on investment: ");
		double expectedReturn = scnr.nextInt();
		// creating new variable
		System.out.println("Please input how long you would like to be retired: ");
		double yearsRetired = scnr.nextInt();
		// creating new variable
		System.out.println("Please input your required income: ");
		double RequiredIncome = scnr.nextInt();
		// creating new variable
		System.out.println("Please input expected SSI: ");
		double SSI = scnr.nextInt();
		// creating new variable
		double r;
		double n;
		double y;
		double p;
		double f;
		boolean t;
		//defining variables for PV and PMT formulas
		// Creating PV formulas and variable
		double PV;
		r = (expectedReturn / 12);
		n = (yearsRetired * 12);
		y = (RequiredIncome - SSI);
		f = 0;
		t = false;
		//inputting variable to PV formula
		PV = FinanceLib.pv(r, n, y, f, t);
		// Printing out PV
		System.out.println(PV);
		// Defining PMT
		double PMT;
		// Setting up variables for PMT
		r = (.1 / 12);
		n = (yearsworked * 12);
		p = 0;
		f = PV;
		t = false;
		// Inputing variables to PMT formula then printing PMT out
		PMT = FinanceLib.pmt(r, n, p, f, t);
		System.out.println(PMT);
	// End block code
	}

}

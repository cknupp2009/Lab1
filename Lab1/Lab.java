package Main;

import java.util.Scanner;
import org.apache.poi.ss.formula.functions.FinanceLib;

public class Lab {
	public static void main (String args[]){
		System.out.println("Welcome to Retirement Plan. Please follow the instrctions to find what you need to save");
		
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Please input how many years you plan to work: ");
		double yearsworked = scnr.nextInt();
		
		System.out.println("Please input expected average return on investment: ");
		double expectedReturn = scnr.nextInt();
		
		System.out.println("Please input how long you would like to be retired: ");
		double yearsRetired = scnr.nextInt();
		
		System.out.println("Please input your required income: ");
		double RequiredIncome = scnr.nextInt();
		
		System.out.println("Please input expected SSI: ");
		double SSI = scnr.nextInt();
		
		double r;
		double n;
		double y;
		double p;
		double f;
		boolean t;
		
		double PV;
		r = (expectedReturn / 12);
		n = (yearsRetired * 12);
		y = (RequiredIncome - SSI);
		f = 0;
		t = false;
		
		PV = FinanceLib.pv(r, n, y, f, t);
		
		System.out.println(PV);
		
		double PMT;
		
		r = (.1 / 12);
		n = (yearsworked * 12);
		p = 0;
		f = PV;
		t = false;
		
		PMT = FinanceLib.pmt(r, n, p, f, t);
		System.out.println(PMT);
	
	}

}

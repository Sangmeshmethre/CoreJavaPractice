package com.nt.CustomeException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Clerk {

	public static void main(String[] args) {
		
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			Bank acc1 = new HDFCBank();
			String option = "";
			do {
				System.out.println("1.Deposite");
				System.out.println("2.Withdraw");
				System.out.println("3.BalanceEnquiry");
				
				System.out.print("Enter option::");
				option = br.readLine();
				
				switch(option) {
				case "1":
				{
					System.out.println("Enter Deposite Amount::");
					String s = br.readLine();
					double d = Double.parseDouble(s);
					acc1.deposite(d);
					acc1.blanceEnquiry();
					break;
				}
					
				case"2":
				{
					System.out.println("Enter Withodraw Amount::");
					String s = br.readLine();
					double d = Double.parseDouble(s);
					
					acc1.withdrow(d);
					System.out.println("Withdraw Amount::"+d);
					acc1.blanceEnquiry();
					break;
				}
				case "3":{
					
					acc1.blanceEnquiry();
					break;
				}
				default:
				System.out.println("Invalid Option");
				
				}
				System.out.println("Do you want to contiune(Yes/No):");
				option = br.readLine();
			}
			while(option.equalsIgnoreCase("Yes"));
		}catch(InvalidAmountException iae) {
			System.out.println(iae.getMessage());
		}catch(InSufficientFundsException e) {
			System.out.println(e.getMessage());
		}catch(NumberFormatException ne) {
			System.out.println("please entr only numbers::");
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}

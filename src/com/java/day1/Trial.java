package com.java.day1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Trial {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String joinDateStr = sc.next();
		try {
			Date joinDate = sdf.parse(joinDateStr);

			if(joinDate.after(new Date())) {
				System.out.println("Ahead of current Date.");
			}
			else {
				System.out.println("Before current Date.");
			}
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		int x;
		
		
		boolean isInvalidInput = true;
		System.out.print("Enter Id : ");
		do {
			try {
				x = sc.nextInt();
				System.out.println(x);
				isInvalidInput = false;
			}
			catch(InputMismatchException e)
			{
				isInvalidInput = true;
				try {
					throw new InvalidInputException("Invalid Input Format. Please enter an"
							+ " Integer value (For e.g. 01)");
				}
				catch(InvalidInputException iie){
					
					System.err.println(iie.getMessage());
				}
				sc.nextLine();
			}
		}while(isInvalidInput);
		
		System.out.println("Thank You.");
	}
}

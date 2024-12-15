package gali;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);
		boolean endLoop = false;
		ArrayList<String> days = new ArrayList<String>();
		days.add("Sunday");
		days.add("Monday");
		days.add("Tuesday");
		days.add("Wednesday");
		days.add("Thursday");
		days.add("Friday");
		days.add("Saturday");

		ArrayList<Integer> temps = new ArrayList<Integer>();
		temps.add(33);
		temps.add(34);
		temps.add(24);
		temps.add(15);
		temps.add(21);
		temps.add(14);
		temps.add(8);

		while(endLoop == false) {
			System.out.println("Please Enter Which Days Temperature You Would Like To See.");
			System.out.print("To See The Whole Week's Temperature Type Week. Type close to end the program: ");
			String userInput = scnr.next().toLowerCase();
			int x;
			int tempAvg = 0;
			
			switch (userInput) {
			case "sunday":
				x = 0;
				System.out.println(days.get(x) + "'s temperature is " + temps.get(x) + " degrees.");
				break;
			case "monday":
				x = 1;
				System.out.println(days.get(x) + "'s temperature is " + temps.get(x) + " degrees.");
				break;
			case "tuesday":
				x = 2;
				System.out.println(days.get(x) + "'s temperature is " + temps.get(x) + " degrees.");
				break;
			case "wednesday":
				x = 3;
				System.out.println(days.get(x) + "'s temperature is " + temps.get(x) + " degrees.");
				break;
			case "thursday":
				x = 4;
				System.out.println(days.get(x) + "'s temperature is " + temps.get(x) + " degrees.");
				break;
			case "friday":
				x = 5;
				System.out.println(days.get(x) + "'s temperature is " + temps.get(x) + " degrees.");
				break;
			case "saturday":
				x = 6;
				System.out.println(days.get(x) + "'s temperature is " + temps.get(x) + " degrees.");
				break;
			case "week":
				for (int i = 0; i < 7; i++) {
					x = i;
					System.out.println(days.get(x) + "'s temperature is " + temps.get(x) + " degrees.");
					tempAvg = tempAvg + temps.get(x);
				}
	
				tempAvg = tempAvg / 7;
				System.out.println("The Weeks Average Temperature Was: " + tempAvg);
				break;
			case "close":
				scnr.close();
				endLoop = true;
				break;
			default:
				System.out.println("Not A Recognized Command Try Again!");
			}
		}
	
	System.out.println("Fin.");
	}
}

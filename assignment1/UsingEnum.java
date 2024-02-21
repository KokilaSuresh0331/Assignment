package assignment1;

import java.util.Scanner;

public class UsingEnum {
	
	public enum WeekDays {
        SUNDAY,
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY;

        
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer (0-6): ");
        int n = scanner.nextInt();
        if (n >= 0 && n<= 6) {
        	WeekDays day=WeekDays.values()[n-1];
            System.out.println("Corresponding day: " + day);
        } else {
            System.out.println("Invalid input. Please enter an integer between 0 and 6.");
        }
    }

}

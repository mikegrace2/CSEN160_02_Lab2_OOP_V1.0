package scu.edu.csen160.lab2.test.exercise5;

public class Exercise5 {
	public static boolean isItALeapYear(int year){
		// This method should check if the parameter year is a leap year and return a true.
		// Otherwise a false.
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)){
            return true;
        }
		// A leap year is a year that is divisible by 4 and not by hundred  OR
		// it is divisible by 400.

		// Complete the code segment. Fix any errors in the method signature.
        return false;
	}
}
//Check whether a year is leap year or not
package Numbers;

import java.util.Scanner;

public class Leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter year:");
        int year = obj.nextInt();
        if (year%4==0 || year%400==0 && year%100!=0) {
        	System.out.print(year+" is leap year");
        } else {
        	System.out.print(year+" is not a leap year");
        }
	}

}

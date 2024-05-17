package Exercise7;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main{
    public static void main(String[] args){

        // Declaration of variables.

        Scanner entrance = new Scanner(System.in);
        int total_hours, hours, days, weeks;

        //Process to get the correct amount of hours.

        System.out.print("Insert amount of hours: ");
        total_hours = entrance.nextInt();

        weeks = total_hours / 168;
        days = total_hours%168 / 24;
        hours = total_hours%24;

        //Print the amount of hours, days and weeks

        System.out.println("Total of weeks: " +weeks);
        System.out.println("Total of days: " +days);
        System.out.println("Total of hours: " +hours);
    }
}
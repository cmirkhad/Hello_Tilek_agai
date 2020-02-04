package sample;

import java.util.Scanner;
import java.text.DecimalFormat;
public class TripPlanner {
    public static void main(String [] args) {
        // Part 1: Greeting
        travelTimeBudget();
    }
    private static void travelTimeBudget(){
        // write your code here/* How many days are you going to spend traveling? 31
        //How much money, in USD, are you planning to spend on your trip: 7000
        //What is the three letter currency symbol for your travel destination? EUR
        //How many EUR are there in 1 USD? 0.85
        //
        //If you are traveling for 31 days that is same as 744 hours or 44640 minus or 2678400 seconds.
        //If you are going to spend $7000 USD that means per day you can spend up to $225.8 USD
        //Your total budget in EUR is 5950.0 EUR, which per day is 191.93 EUR
        //*********** */
        Scanner mir =new Scanner(System.in);
        Scanner mira =new Scanner(System.in);
        System.out.print("How many days are you going to spend traveling? ");
        int days = mir.nextInt();
        System.out.print("How much money, in USD, are you planning to spend on your trip: ");
        double money =mir.nextDouble();
        System.out.print("What is the three letter currency symbol for your travel destination? ");
        String c = mira.nextLine();
        System.out.print("How many "+c+" are there in 1 USD? ");
        double d = mir.nextDouble();
        System.out.println();

        double r = money/31;
        DecimalFormat round1 = new DecimalFormat("####.#");
        DecimalFormat round2 = new DecimalFormat("####.##");
        System.out.println("If you are traveling for "+days+" days that is same as "+days*24+" hours or "+days*24*60+" minus or "+days*24*3600+" seconds.");
        System.out.println("If you are going to spend $"+money+" USD that means per day you can spend up to $"+round1.format(money/31)+" USD");
        System.out.println("Your total budget in EUR is "+round1.format(money*d*1.0)+" EUR, which per day is "+round2.format(money*d/31)+" EUR");
    }

}
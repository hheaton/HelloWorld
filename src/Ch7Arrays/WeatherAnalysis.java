package Ch7Arrays;

import java.util.Scanner;
//This program take user input and calculates the average temperature for n days
//The program also identifies how many days are above the average temperature

public class WeatherAnalysis {
    public static void main(String[] args) {
        //Step 1: Ask for number of days
        Scanner console = new Scanner(System.in);
        System.out.println("How many days?");
            int days = console.nextInt();
    }
}
//Solution:
//Step 1: Ask for number of days
//Step 2: Ask for n days high temperature, store input in cumulative variable
//Step 3: Calculate and print the average temperature (Cumulative temp/ #of days)
//Step 4: Calculate and print the number of days that the temperature was above average
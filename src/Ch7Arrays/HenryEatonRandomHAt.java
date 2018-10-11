// This program generates a bracket for n number of teams entered by the user.

import java.util.Arrays;
import java.util.Scanner;

public class HenryEatonRandomHat {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.print("How many teams? PLease enter an even number: ");
        int teams = console.nextInt();
        while(teams%2 == 1) {
            System.out.print("How many teams? PLease enter an even number: ");
            teams = console.nextInt();
        }
        int[] array = new int[teams];
        calculate(array, teams);

    }
    // This method fills the array with a random number from 1 to the number of teams entered by the user
    public static void calculate(int[] array, int teams) {
        int j =0;
        int x = 1;
        for (int i = 0; i<=array.length-1; i++) {
            j = (int) (Math.random() * teams);
            if (array[j] == 0) {  // Checks if the value assigned to the randomly chosen index equals zero
                array[j] = x; //Populates random index with value 1 - 10;
                x++;
            } else {
                i--;

            }
        }
        printBracket(array, teams);
    }

    // this method prints the bracket for the teams using a for loop
    public static void printBracket(int[] array, int teams) {
        for (int i=0; i<teams; i+=2) {
            System.out.println(array[i] + " vs. " + array[i+1]);
        }
    }
}

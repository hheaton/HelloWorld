package Ch7Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class HenryEatonRandomHAt {
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
    public static void calculate(int[] array, int teams) {
        int j =0;

        for (int i = 1; i<=teams; i++) {
            int rand = (int)(Math.random()*teams +1);
            for (int x = 0; x < i; x++) {
                if (array[x] == rand) {
                    rand = (int)(Math.random()*teams +1);
                }
            }
            array[j] = rand;
            j++;
        }
        System.out.println(Arrays.toString(array));
    }
    }



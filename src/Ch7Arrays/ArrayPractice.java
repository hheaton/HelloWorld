package Ch7Arrays;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        //Step 1: Declare variable
        int x;
        int[] numbers1 = new int[5]; // an integer array of size 5
        //Step 2: initialize variable
        System.out.println(Arrays.toString(numbers1)); //before populating the array

        for (int i = 0; i < 5; i++) {
            numbers1[i] = i+1;
        }
        System.out.println(Arrays.toString(numbers1)); //after populating the array

        //OR
        //Step 1&2 Declare and initialize variable
        int[] numbers2= {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers2));





    }
}

package Ch7Arrays;

import java.util.Arrays;
import java.util.Random;

public class ArrayPractice {
    public static void main(String[] args) {
       randomArray();
    }
    public static void randomArray(){
        int random1 =  (int) (Math.random()*10 +1);
        int [] randomArray = new int[random1];
        for (int i=0; i<randomArray.length; i++) {
            randomArray[i] = (int) (Math.random()*10 +1);
        }
        System.out.println(Arrays.toString(randomArray));
    }
}

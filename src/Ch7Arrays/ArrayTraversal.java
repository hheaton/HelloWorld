package Ch7Arrays;

import java.util.Arrays;

public class ArrayTraversal {
    public static void main(String[] args) {
        int[] array = {5, 8, 7, 12};
        //abbyAlgo(array);
        jonnyAlgo(array);
        System.out.println(Arrays.toString(array));
    }
        public static void jonnyAlgo(int[] ja) {
        int j =0;
            for (int i= ja.length-1; i>=0; i--) {
                ja[j] = ja[i];
                j++;
            }
            System.out.println(Arrays.toString(ja));

        }
        public static int[] abbyAlgo (int[] aa) {
            int[] temp = new int[aa.length];
            for (int i = 0; i<aa.length; i++) {
                temp[i] = aa[aa.length-1-i];
            }
            aa=temp;
            return aa;
        }

}

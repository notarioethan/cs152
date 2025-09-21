import java.util.*;

public class SpOdd {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
        int[] testArr = {3, 8, 5, 7, 1, 9, 2};
        //
        System.out.println("Original array: " + Arrays.toString(testArr));
        System.out.println("Odd elements in the array: " + Arrays.toString(spOdd(testArr)));
    }

    public static int[] spOdd(int[] arr){
        int odds = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] % 2 == 1) odds++;
        }
        int[] oddArr = new int[odds];
        int j = 0;
        for (int i = 0; i< arr.length; i++){
            if (arr[i] % 2 == 1) oddArr[j++] = arr[i];
        }
        return oddArr;
    }
}

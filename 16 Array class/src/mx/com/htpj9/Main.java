package mx.com.htpj9;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        /*Sort array*/
        double[] doubleArray = {8.4, 9.3, 0.2, 7.9, 3.4};
        Arrays.sort(doubleArray);
        System.out.printf("\ndoubleArray: ");

        for(double value: doubleArray)
            System.out.printf("\n%.1f", value);

        /*Fill array*/
        int[] filledIntArray = new int[10];
        Arrays.fill(filledIntArray, 7);
        displayArray(filledIntArray, "filledIntArray");

        /*Copy array into new array*/
        int[] intArray = {1, 2, 3, 4, 5, 6};
        int[] intArrayCopy = new int[intArray.length];
        System.arraycopy(intArray, 0, intArrayCopy, 0, intArray.length);
        displayArray(filledIntArray, "intArray");
        displayArray(filledIntArray, "intArrayCopy");

        /*Compare array for equality*/
        boolean b = Arrays.equals(intArray, intArrayCopy);
        System.out.printf("\n\nintArray %s intArrayCopy\n", (b ? "==" : "!="));

        b = Arrays.equals(intArray, filledIntArray);
        System.out.printf("\n\nintArray %s filledIntArray\n", (b ? "==" : "!="));

        /*Search for value in array*/
        int location = Arrays.binarySearch(intArray, 5);
        if(location >= 0)
            System.out.printf("Found 5 at element %d in intArray\n", location);
        else
            System.out.printf("5 not found 5 in intArray");

        location = Arrays.binarySearch(intArray, 3830);
        if(location >= 0)
            System.out.printf("Found 3830 at element %d in intArray\n", location);
        else
            System.out.printf("3830 not found 5 in intArray");

    }

    private static void displayArray(int[] filledIntArray, String description) {

        System.out.printf("\n");
        System.out.printf("\n%s: ", description);

        for (int value : filledIntArray)
            System.out.printf("\n%d", value);

    }
}

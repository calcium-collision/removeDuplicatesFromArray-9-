package com.company.calcium_collision;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] testArray = createArray(10, 3);
        System.out.println(Arrays.toString(testArray));
        int[] a = removeDuplicates(testArray);

    }

    public static int[] createArray(int sizeArray, int range){

        // For include number 'range' in range
        range++;

        int[] array = new int[sizeArray];

        for (int a = 0; a < sizeArray; a++){
            array[a] = (int) (Math.random() * range);
        }

        return array;
    }

    public static int[] removeDuplicates(int[] arrayToFormat){

        // This method will not work without sorting
        Arrays.sort(arrayToFormat);

        // First value in transferred array
        int uniqueNum = arrayToFormat[0];

        // Create array with size of transferred array
        int[] newArray = new int[arrayToFormat.length];

        // Set first value in the new array
        newArray[0] = arrayToFormat[0];

        // Index for fill new array
        int indexOfReturnArray = 1;

        // Start loop without first value of array
        for (int n = 1; n < arrayToFormat.length; n++){

            // If next value equal previous
            if (arrayToFormat[n] == uniqueNum){
                // Skip
                continue;
            } else {

                // Else add this value to new array
                newArray[indexOfReturnArray] = arrayToFormat[n];

                // Update index
                indexOfReturnArray++;

                // Update unique number
                uniqueNum = arrayToFormat[n];

            }
        }

        // Create array with right size
        int[] returnArray = Arrays.copyOf(newArray, indexOfReturnArray);

        System.out.print(Arrays.toString(returnArray));

        return returnArray;
    }
}

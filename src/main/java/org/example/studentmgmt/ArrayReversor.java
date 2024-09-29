package org.example.studentmgmt;

public class ArrayReversor {

    private final ArrayFlattenerService arrayFlattenerService;

    public ArrayReversor(ArrayFlattenerService arrayFlattenerService) {
        this.arrayFlattenerService = arrayFlattenerService;
    }

    public int[] reverseArray(int[][] nestedArray) {
        if (nestedArray == null) {
            return null; // Handle null input
        }

        // Flatten the array using the ArrayFlattenerService
        int[] flattenedArray = arrayFlattenerService.flattenArray(nestedArray);

        // Reverse the flattened array
        int[] reversedArray = new int[flattenedArray.length];
        for (int i = 0; i < flattenedArray.length; i++) {
            reversedArray[i] = flattenedArray[flattenedArray.length - 1 - i];
        }
        return reversedArray;
    }

}

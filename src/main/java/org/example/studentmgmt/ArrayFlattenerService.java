package org.example.studentmgmt;

import java.util.Arrays;

public class ArrayFlattenerService {
    public static int [] flattenArray(int[][] nestedArray){
        if(nestedArray== null){
            return null;
        }
        return Arrays.stream(nestedArray)
                .flatMapToInt(Arrays::stream)
                .toArray();
    }
}

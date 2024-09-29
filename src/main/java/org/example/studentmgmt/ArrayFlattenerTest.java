package org.example.studentmgmt;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayFlattenerTest {

    @Test
    public  void testFlattenArrayWithLegitInput(){
        int [][] nestedArray = {{1, 3}, {0}, {4, 5, 9}};
        int [] expectedOutput= {1, 3, 0, 4, 5, 9};
        int [] actualOutput = ArrayFlattener.flattenArray(nestedArray);
        assertArrayEquals(expectedOutput,actualOutput);
    }

    @Test
    public void testFlattenArrayWithNullInput(){
        int [][] nestedArray = null;
        int [] actualOutput = ArrayFlattener.flattenArray(nestedArray);
        assertNull(actualOutput);
    }
}
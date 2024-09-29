package org.example.studentmgmt;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;

public class ArrayReversorTest {

    @Test
    public void testReverseArrayWithLegitInput() {
        ArrayFlattenerService mockService = Mockito.mock(ArrayFlattenerService.class);
        ArrayReversor arrayReversor = new ArrayReversor(mockService);

        int[][] nestedArray = {{1, 3}, {0}, {4, 5, 9}};
        int[] flattenedArray = {1, 3, 0, 4, 5, 9};
        int[] expectedOutput = {9, 5, 4, 0, 3, 1};

        Mockito.when(mockService.flattenArray(nestedArray)).thenReturn(flattenedArray);
        int[] actualOutput = arrayReversor.reverseArray(nestedArray);
        assertArrayEquals(expectedOutput, actualOutput);
        verify(mockService).flattenArray(nestedArray);
    }

  @Test
  public void testReverseArrayWithNullInput() {
    ArrayFlattenerService mockService = Mockito.mock(ArrayFlattenerService.class);
    ArrayReversor arrayReversor = new ArrayReversor(mockService);
    int[] actualOutput = arrayReversor.reverseArray(null);
    assertNull(actualOutput);
  }


}
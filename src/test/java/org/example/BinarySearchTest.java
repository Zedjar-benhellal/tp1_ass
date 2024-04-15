package org.example;

import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.assertThrows;
import java.lang.reflect.Array;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class BinarySearchTest {

    private BinarySearch binarySearch;
    @BeforeEach
    void SetUp() {
        binarySearch = new BinarySearch();
    }



    @Test
    void testArrayIsNULL() {
        Array a = null;
        assertThrows(NullPointerException.class, () -> BinarySearch.binarySearch(null, 5));
    }

    @Test
    void testBinarySearch() {
        int[] array = {1, 2, 3, 4, 5};
        int element = 3;
        int index = BinarySearch.binarySearch(array, element);
        Assertions.assertEquals(2, index);
    }

    @Test
    void testElementNotInTheArray() {
        int[] array = {1, 2, 3, 4, 5};
        int element = 6;
        int index = BinarySearch.binarySearch(array, element);
        Assertions.assertEquals(-1, index);
    }

    @Test
    void testMidofArrayGreaterThanElement() {
        // To Rename later
        int[] array = {1, 2, 3, 4, 5};
        int element = 2;
        int index = BinarySearch.binarySearch(array, element);
        Assertions.assertEquals(1, index);
    }
}
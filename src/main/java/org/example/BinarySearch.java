package org.example;


public class BinarySearch {
    /*
    public static int binarySearch(int[] array, int element) {
        if (array == null) {
            throw new NullPointerException("Array must not be null");
        }
        int low = 0;
        int high = array.length - 1;
        while (low < high) {
            int mid = (low + high) / 2;
            if (array[mid] == element) {
                return mid;
            }
            else if (array[mid] <= element) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return -1;
    }
    // N.B. This method is wrong
    // The condition "while (low < high)" will be changed into while (low <= high)
    // In order to consider the case low equals high
    */


    public static int binarySearch(int[] array, int element) {
        if (array == null) {
            throw new NullPointerException("Array must not be null");
        }
        int low = 0;
        int high = array.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            // But it is int!! If the result becomes float?!
            if (array[mid] == element) {
                return mid;
            }
            else if (array[mid] <= element) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return -1;
    }

}
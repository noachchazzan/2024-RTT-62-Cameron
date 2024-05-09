package org.example.Slides_303_6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayInsert {
    public static int[] delete(int deletedPosition, int[] array){
        // int deletedPosition = 4;
        if (deletedPosition < 0 || deletedPosition > array.length) {
            System.out.println("Position to delete is invalid");
        }
        // 1) create a new array with size - 1
        int[] deleted = new int[array.length - 1];
        // 2) copy the first elements upto but not including the deleted position
        for (int pos = 0; pos < deletedPosition; pos++) {
            deleted[pos] = array[pos];
        }
        // 3) copy the last elements into a pos-1 in the new array
        for (int pos = deletedPosition + 1; pos < array.length; pos++) {
            deleted[pos - 1] = array[pos];
        }
        return deleted;
    }
    public static int[] insert(int[] source, int insertPosition, int valueToInsert) {
        // lets write some code to insert a 9 into the array at position 2
        // 1) create a new array of size + 1
        int[] result = new int[source.length + 1];

        // 2) copy the first part of the array (before position 2) from the old to the new
        for (int pos = 0; pos < insertPosition; pos++) {
            result[pos] = source[pos];
        }

        // 3) actually insert the value we want in position 2
        result[insertPosition] = valueToInsert;

        // 4) copy over the rest of the array
        for (int pos = 2; pos < source.length; pos++) {
            result[pos + 1] = source[pos];
        }
        return result;
    }
    // original implmentation inserted a 9 at pos 2
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(delete(3, array)));
        // original array
        // pos   01234
        // value 12345
        System.out.println();
        // array after inserting
        // pos   012345
        // value 129345
        for (int value : array) {
            System.out.println(value);
        }
        // this is an example of abstraction because we dont care how the array list manages the array and memory
        // we only care that we can insert an item at position 0 after the list has been filled.
        List<String> stringList = new ArrayList<>();
        stringList.add("String 1");
        stringList.add("String 2");
        stringList.add(0, "String 0");
    }
}

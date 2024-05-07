package org.example.ArraysAnnoying;

public class Arrays {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        // original array
        // pos 01234
        // value 12345

        // array after inserting
        // pos 012345
        // value 129345
        // lets write some code to insert an element at position 2
        int x = 1;

        // 1) create a new array of size + 1
        int[] insert = new int[array.length + 1];
        // 2) copy the first part of the array (before position 2) from the old to the new
        for (int pos = 0; pos < 2; pos++){
            insert[pos] = array[pos];
        }
        // 3) actually insert the value we want at pos 2
        insert[2] = x;

        // 4) copy over the rest of the array
        for(int pos=2; pos < array.length; pos++){
            insert[pos+1] = array[pos];
        }
        for (int value : insert) {
            System.out.println(value);
        }
    }
}

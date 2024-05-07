package org.example.ArraysAnnoying;

public class ArrayDelete {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};

        // now lets delete item at position 4
        int deletedPosition = 1;
        if (deletedPosition < 0 || deletedPosition > array.length) {
            System.out.println("Position to delete is invalid");
        }
        // 1) create a new array with size - 1
        int[] deleted = new int[array.length-1];

        // 2) cpy the first elements upto but not including the delted position
        for (int pos = 0; pos<deletedPosition; pos++) {
            deleted[pos] = array[pos];
        }

        // 3. copy the last elements into a pos-1 in the new array
        for (int pos = deletedPosition + 1; pos < array.length; pos++) {
            deleted[pos-1] = array[pos];
        }
        for (int value: deleted){
            System.out.println(value);
        }
    }
}

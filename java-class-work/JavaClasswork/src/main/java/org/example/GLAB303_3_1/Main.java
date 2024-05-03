package org.example.GLAB303_3_1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String vowels = "a::b::c::d:e";

        // split of string at ":" and conversion of array to string and printing it
        String[] result = vowels.split("::");
        System.out.println("result = " + Arrays.toString(result));
    }
}

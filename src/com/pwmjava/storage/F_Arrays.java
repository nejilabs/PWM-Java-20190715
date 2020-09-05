package com.pwmjava.storage;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class F_Arrays {
    public static void main(String[] args){
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;
        System.out.println(Arrays.toString(numbers));

        int[] listOfNumbers = {2,5,6,8,1};
        System.out.println(listOfNumbers.length);
        System.out.println(Arrays.toString(listOfNumbers));

        Arrays.sort(listOfNumbers);
        System.out.println(Arrays.toString(listOfNumbers));


    }
}

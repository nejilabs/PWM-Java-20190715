package com.pwmjava.storage;

import java.util.Date;

public class B_Variables {
    public static void main(String[] args){
        //Example of Primitive type
        byte myAge = 30;
        long viewsCount = 3_123_456_789L;
        float price = 10.99F;
        char letter = 'A';
        boolean isEligible = false;

        System.out.println(viewsCount);

        //Example of Reference type
        Date now = new Date();
        System.out.println(now);
    }
}

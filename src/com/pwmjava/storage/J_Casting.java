package com.pwmjava.storage;

public class J_Casting {
    public static void main(String[] args){
        //Implicit Casting (Automatic)
        //byte > short > int > long > float > double
        short x = 1;
        int y = x + 1;
        System.out.println(y); //2

        //Explicit Casting
        double a = 1.1;
        int b = (int)a + 2; //3
        System.out.println(b);

        //for strings to be casted to numbers. we use wrapper classes' parsing methods
        String c = "1";
        float d = Float.parseFloat(c) + 2;
        System.out.println(d);
    }
}

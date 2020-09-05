package com.pwmjava.storage;

import java.awt.*;

public class C_PrimitiveXReference {
    public static void main(String[] args){
        //PRIMITIVE
        //primitives stores the actual value, hence even if another primitive references to another primitive, once the referred primitive value has been changed, the value of the second primitive still won't change.
        byte x = 1;
        byte y = x;
        System.out.println("primitive before change:");
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        x = 2;

        System.out.println("primitive after change:");
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        //REFERENCE
        //for reference on the other hand, they refer to a memory address, hence if the value of one reference variable has been changed, the other reference variable also referring to the same memory address also changes. Reference types don't store the actual value, they refer to a memory location to which the value is being stored.
        Point point1 = new Point(x=1,y=1);
        Point point2 = point1;
        System.out.println("reference before change:");
        System.out.println("Point1 = " + point1);
        System.out.println("Point2 =  " + point2);

        point1.x = 2;

        System.out.println("primitive after change:");
        System.out.println("Point1 = " + point1);
        System.out.println("Point2 =  " + point2);
    }
}

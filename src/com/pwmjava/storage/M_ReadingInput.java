package com.pwmjava.storage;

import java.util.Scanner;

public class M_ReadingInput {
    public static void main(String[] args){

        System.out.print("Name: ");
        Scanner getName = new Scanner(System.in);
        String name = getName.nextLine().trim();

        System.out.print("Age : ");
        Scanner getAge = new Scanner(System.in);
        byte age = getAge.nextByte();

        System.out.println("Your name is: " + name);
        System.out.println("You are " + age + " years old");
    }
}

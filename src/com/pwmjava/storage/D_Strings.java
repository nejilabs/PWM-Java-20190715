package com.pwmjava.storage;

public class D_Strings {
    public static void main(String[] args){
        String message = "Hello World" + "!!";
        System.out.println(message);

        System.out.println(message.endsWith("!!")); //displays boolean
        System.out.println(message.startsWith("!!"));

        System.out.println(message.length());

        System.out.println(message.indexOf("H"));
        System.out.println(message.indexOf("sky"));

        System.out.println(message.replace("!","*"));

        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());

        String messageWithSpaces = "       Hello World     ";
        System.out.println(messageWithSpaces);
        System.out.println(messageWithSpaces.trim());

    }
}
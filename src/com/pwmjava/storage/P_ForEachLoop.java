package com.pwmjava.storage;

public class P_ForEachLoop {
    public static void main(String[] args) {
        String[] listOfFruits = {"Apple", "Mango", "Orange"};

        for (int i = 0; i<listOfFruits.length; i++){
            System.out.println(listOfFruits[i]);
        }

        for (String eachFruit : listOfFruits){
            System.out.println(eachFruit);
        }
    }
}

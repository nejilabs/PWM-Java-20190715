package com.pwmjava.storage;

import java.util.Scanner;

public class N_WhileLoop {
    public static void main(String[] args) {
        Scanner getInput = new Scanner(System.in);
        String input = "";
        while (!input.equals("quit")) {
            System.out.print("Input: ");
            input = getInput.nextLine().toLowerCase();
            System.out.println(input);
        }
    }
}

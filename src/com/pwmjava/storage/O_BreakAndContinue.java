package com.pwmjava.storage;

import java.util.Scanner;

public class O_BreakAndContinue {
    public static void main(String[] args) {
        Scanner getInput = new Scanner(System.in);
        String input = "";
        while (true) {
            System.out.print("Input: ");
            input = getInput.nextLine().toLowerCase();
            if(input.equals("pass")){
                continue;
            } else if(input.equals("quit")){
                break;
            }
            System.out.println(input);
        }
    }
}

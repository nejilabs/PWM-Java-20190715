package com.pwmjava.storage;

public class  E_EscapeSequences {
    public static void main(String[] args){
        String message = "Hello \"World\"";
        System.out.println(message);

        String path = "c:\\Windows\\...";
        System.out.println(path);

        String pathln = "c:\nWindows\n...";
        System.out.println(pathln);
        //c:
        //Windows
        //...

    }
}

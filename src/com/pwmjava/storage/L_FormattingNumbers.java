package com.pwmjava.storage;

import java.text.NumberFormat;

public class L_FormattingNumbers {
    public static void main(String[] args){
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String resultOfCurrency = currency.format(12345.678);
        System.out.println(resultOfCurrency);

        String resultOfPercent = NumberFormat.getPercentInstance().format(0.1);
        System.out.println(resultOfPercent);


    }
}

package com.codewithjoshua;


import java.text.NumberFormat;
import java.time.Period;
import java.util.Scanner;
import java.lang.Math;

public class Main{
    public static void main(String[] args){

        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Principal : ");
        Integer principal = scanner.nextInt();
        System.out.print("Annual Rate : ");
        Double annualInterestRate = scanner.nextDouble();
        System.out.print("Period (Years): ");
        Byte period = scanner.nextByte();

        Double monthlyInterestRate = annualInterestRate / PERCENT / MONTHS_IN_YEAR;
        int numberOfPayments = period * MONTHS_IN_YEAR;

        Double Mortgage = principal *
                ( monthlyInterestRate  * Math.pow(1 + monthlyInterestRate, numberOfPayments))
                / (Math.pow(1+ monthlyInterestRate, numberOfPayments) -1);

        System.out.println("Monthly interest Rate :" + monthlyInterestRate);
        System.out.println("Mortgage: " + NumberFormat.getCurrencyInstance().format(Mortgage));

    }
}
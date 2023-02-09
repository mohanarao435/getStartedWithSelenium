package com.hello;

import java.util.Scanner;

public class Sum2NosWithoutAddOperator {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter two no.s:");
        int a=s.nextInt();
        int b=s.nextInt();
        int sum=a - ~b - 1;

        System.out.println("Sum of two no.s is :"+sum);
    }
}

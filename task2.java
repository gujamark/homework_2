package com.company;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        int num1,num2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        num1 = sc.nextInt();
        System.out.print("Enter Second Number: ");
        num2 = sc.nextInt();
        System.out.println(num1 + " / " + num2 + " = " + num1 / num2);
        System.out.println(num2 % num1);
    }
}

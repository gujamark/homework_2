package com.company;

import java.util.Scanner;

public class task5_task6 {
    public static void main(String[] args) {
        int num,sumOfDigits = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        num = sc.nextInt();

        while (num > 0) {
            sumOfDigits += num % 10;
            num = num / 10;
        }

        System.out.println(sumOfDigits);
    }
}

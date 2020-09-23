package com.company;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        num = sc.nextInt();

        while(num > 0) {
            System.out.println(num % 10);
            num = num / 10;
        }
    }
}

package com.company;

import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
        int temp = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number One: ");
        int a = sc.nextInt();
        System.out.print("Enter Number Two: ");
        int b = sc.nextInt();

        while (b != 0) {
            temp = b;
            b = a % b;
            a = temp;
        }
        System.out.println(a);

    }
}

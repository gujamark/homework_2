package com.company;

import java.util.Arrays;

public class task11 {
    public static void main(String[] args) {
        double[] nums = new double[8];

        for(int i = 0 ; i < nums.length;i++){
            nums[i] = Math.random();
        }

        System.out.println(Arrays.toString(nums));

    }
}

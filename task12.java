package com.company;

import java.util.Arrays;

public class task12 {
    public static void main(String[] args) {
        int[] nums = new int[8];
        int[] numsSorted = new int[nums.length];

        for(int i = 0 ; i < nums.length;i++){
            nums[i] = (int)(Math.random() * 100);
        }

        Arrays.sort(nums);

        for(int i = nums.length; i > 0;i--){
            numsSorted[nums.length - i] = nums[i - 1];
        }


        System.out.println(Arrays.toString(nums));
    }
}

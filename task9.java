package com.company;


public class task9 {
    public static void main(String[] args) {
        double[] nums = {1.2, 1.3, 5.6, 3.22, 6.6, 9.112, 5.2, 33.2};
        double max = 0, min = nums[0];

        for (int i = 0; i < nums.length; i++) {

            System.out.println(nums[i]);

            if (nums[i] > max)
                max = nums[i];
            if (nums[i] < min)
                min = nums[i];
        }

        System.out.println("Min: " + min);
        System.out.println("Max: " + max);

    }
}

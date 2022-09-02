package com.coding.apiserver.controller;


public class TestController {


    public static void main(String[] args) {

        System.out.println(1/2);

    }

    public int search(int[] nums, int target) {

        int min = 0;
        int max = nums.length - 1;
        int mid = (nums.length - 1) / 2;

        int result = 0;


        if(nums.length == 1) {
            return nums[0] == target ? 1 : 0;
        }


        while (mid != 0 && mid != nums.length - 1) {

            if(nums[mid] == target) {
                result = result + 1;
                int tempMid = mid + 1;
                while (tempMid < max && nums[tempMid] == target) {
                    result ++;
                    tempMid = tempMid + 1;
                }
                int dempMid = mid - 1;
                while (dempMid >= min  && nums[dempMid] == target) {
                    result = result + 1;
                    dempMid--;
                }
                break;
            }else if (target > nums[mid]) {
                min = mid;
                mid = (mid + max) / 2;
            }else {
                max = mid;
                mid = (mid + min) / 2;
            }

        }

        return result;




    }



}

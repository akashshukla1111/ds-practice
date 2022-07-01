package com.geeksforgeeks.practice;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    //rotate an array with d elements

    public Integer[] rotate(Integer arr[], int d) {
        int length = arr.length;
        int gcd = getGCD(length, d);
        int temp = 0;
        for (int i = 0; i < d; i++) {
            if (temp - gcd >= 0) {
                temp = 0;
            }
            int t = arr[temp];
            int prevj = 0;
            for (int j = temp; j < length; j = j + gcd) {
                if (j + gcd < length)
                    arr[j] = arr[j + gcd];
                prevj = j;
            }
            arr[prevj] = t;
            temp++;
        }
        return arr;
    }

    public int getGCD(int f, int s) {
        if (f < s) {
            int temp = f;
            f = s;
            s = temp;
        }
        if (f % s == 0) {
            return s;
        }
        return getGCD(s, f % s);
    }

    public Integer[] rotateReverseAlgo(Integer[] arr, int d) {

        reverseArray(arr, 0, d);

        reverseArray(arr, d, arr.length);
        System.out.println(Arrays.toString(arr));
        reverseArray(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));

        return arr;

    }

    public Integer[] reverseArray(Integer[] arr, int start, int end) {
        int len = end + start;
        for (int i = start; i < len / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[len - i - 1];
            arr[len - i - 1] = temp;
        }
        return arr;
    }
    //   0 1 2 3 4 5 6 7 8 9 10 11 12 13

    public int[] blackSwapRotate(int[] arr, int si, int li, int d) {

        int sizeA = d - si;
        int sizeB = li - d + 1;
        if (sizeA == sizeB) {
            for (int i = 0; i < sizeA; i++) {
                swap(arr, si + i, si + sizeA + i);
            }
        }
        if (sizeA > sizeB) {
            // swap sizeB to size A
            for (int i = 0; i < sizeB; i++) {
                swap(arr, si + i, si + sizeA + i);
            }
            // increase the first index, as we are getting swap that many element
            blackSwapRotate(arr, si + sizeB, li, d);
        }
        if (sizeA < sizeB) {
            for (int i = 0; i < sizeA; i++) {
                swap(arr, si + i, li - sizeA + 1 + i);
            }
            // reduce last index how many element you swap : sizeA
            blackSwapRotate(arr, si, li - sizeA, d);
        }
        return arr;
    }

    private void swap(int[] arr, int fi, int swapi) {
        int temp = arr[fi];
        arr[fi] = arr[swapi];
        arr[swapi] = temp;
    }

    public boolean rotatedArraySearch(Integer[] arr, int si, int li, int key) {
        // 1 2 3 4 5 7 8
//		 3 4 5 7 8 1 2
        int mid = (si + li) / 2;
        if (si > li) {
            return false;
        }
        if (arr[mid] == key) {
            return true;
        }
        // key we can only search in sorted array with first and last element check.
        if (arr[si] < arr[mid]) {
            if (arr[si] <= key && key < arr[mid]) {
                return rotatedArraySearch(arr, si, mid - 1, key);
            } else {
                return rotatedArraySearch(arr, mid + 1, li, key);

            }
        } else {
            if (arr[mid] < key && key <= arr[li]) {
                return rotatedArraySearch(arr, mid + 1, li, key);
            } else {
                return rotatedArraySearch(arr, si, mid - 1, key);
            }
        }
    }

    //rearrange positive number
    public int[] arrangeNumber(int[] arr) {
        int si = 0;
        int li = arr.length - 1;

        //4,6,2,-2,-7,-13,16,19,3
        // even = positive odd negative
        while (si < li) {

            if (si % 2 == 0) {
                //positive
                if (arr[si] > 0) {
                    si++;
                } else {
                    if (arr[li] < 0) {
                        li--;
                    } else {
                        swap(arr, si, li);
                        si++;
                    }
                }
            }
            if (si % 2 != 0) {
                if (arr[si] < 0) {
                    si++;
                } else {
                    if (arr[li] > 0) {
                        li--;
                    } else {
                        swap(arr, si, li);
                        si++;
                    }

                }
            }
        }
        return arr;
    }

    public int[] rearrangeMaxandMin(int[] arr) {
        int si = 0;
        int li = arr.length - 1;
        while (si < li) {
            //sorted array
            swap(arr, si, li);
            si++;
            swap(arr, si, li);
            si++;
            li--;
        }
        return arr;
    }

    public Integer[] segregateZeroOne(Integer[] arr) {
        int l = arr.length;
        int pivot = -1;
        for (int i = 0; i < l; i++) {
            if (arr[i] == 0) {
                pivot++;
                arr[pivot] = 0;
                arr[i] = 1;
            }
        }
        return arr;
    }

    public int[] segregateEvenOdd(int[] arr) {
        int l = arr.length;
        int pivot = -1;
        for (int i = 0; i < l; i++) {
            if (arr[i] % 2 == 0) {
                pivot++;
                swap(arr, pivot, i);
            }
        }
        return arr;
    }

    public void findOneDuplicate(int[] nums) {
        //1,2,3,4,5,6,3
        int xor = nums[0] ^ nums[1];
        for (int i = 2; i < nums.length; i++) {
            xor = xor ^ nums[i] ^ (i - 1);
        }
        System.out.println(xor);
    }

    public void setBitCounts(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) != 0) {
                count++;
            }
            n = n >> 1;
        }
        System.out.println(count);
    }

    // Brian Kernighan’s Algorithm
    public void setBitCountsBetter(int n) {
        int count = 0;
        while (n > 0) {
            n = n & (n - 1);
            count++;
        }
        System.out.println(count);
    }

    public void findDuplicates(int[] inputs) {
        //1,2,3,4,5,6,3 , 2

        int length = inputs.length;
        for (int i = 0; i < length; i++) {
            int index = (inputs[i]) % length;
            inputs[index] = inputs[index] + length;
        }

        for (int i = 0; i < length; i++) {
            if ((inputs[i] / length) > 1) {
                System.out.print(i + " ");
            }
        }

    }

    //find smallest positive missing number
    // https://www.geeksforgeeks.org/find-the-smallest-positive-number-missing-from-an-unsorted-array/
    public int findSmallestPositiveMissingNum(int[] numbers) {

        int e_index = segregateNegativePositive(numbers);
        for (int i = 0; i <= e_index; i++) {
            int ii = Math.abs(numbers[i]);
            if (numbers[i] > e_index) {
                numbers[i] = -numbers[i];
            }
            if (ii - 1 <= e_index && numbers[ii - 1] > 0) {
                numbers[ii - 1] = -numbers[ii - 1];
            }
        }
        for (int i = 0; i <= e_index; i++) {
            if (numbers[i] > 0) {
                return i + 1;
            }
        }
        return -1;
    }

    private int segregateNegativePositive(int[] nums) {
        int l = nums.length;
        int pivot = -1;
        for (int i = 0; i < l; i++) {
            if (nums[i] > 0) {
                pivot++;
                swap(nums, pivot, i);
            }
        }
        return pivot;
    }

    public int findMaximumRepeatingElement(int[] nums) {
        //{1,2, 2, 2, 0, 2, 0, 2, 3, 8, 0, 9, 2, 3},
        int ll = nums.length;
        for (int i = 0; i < ll; i++) {
            int index = (nums[i] % ll);
            nums[index]=nums[index]+ll;
        }
        int conts=0;
        int repeatingValue=0;
        for (int i=0;i<ll;i++){
            if (conts < nums[i] / ll){
                conts=nums[i]/ll;
                repeatingValue=i;
            }
        }
        return repeatingValue;
    }

    public void countFrequencies(int[] nums){
        // 2 3 3 2 5
        int ll=nums.length;
        for (int i=0;i<ll;i++){
            if (nums[i]<=0){
                continue;
            }
            int e_i=nums[i]-1;
            if (nums[e_i]>0){
                nums[i]=nums[e_i];
                nums[e_i]=-1;
            }else {
                nums[e_i]=nums[e_i]-1;
            }
        }

        for (int i=0;i<ll;i++){
            System.out.print(i+1 + " count  = " + -nums[i]);
            System.out.println("");
        }
    }


    public  static void findDuplicatesXor(int[] arr){
        int l = arr.length;
        int xor=arr[0];
        for (int i=1;i<l;i++){
            xor^=arr[i];
        }
        for (int i=1;i<=l-2;i++){
            xor^=i;
        }

        int x=0;int y=0;
        int set_right_bit;

        set_right_bit= (xor &  ~(xor-1));

        for (int i=0;i<l;i++){
            if ((set_right_bit & arr[i]) != 0){
                x^=arr[i];
            }else{
                y^=arr[i];
            }
        }

        for (int i=1;i<=l-2;i++){
            if ((set_right_bit & i) != 0){
                x^=i;
            }else{
                y^=i;
            }
        }

        System.out.println("x : " + x);
        System.out.println("y : " + y);

    }

    public static void main(String[] args) {
       int[] arr= {4, 2, 4, 5, 2, 3, 1};
        findDuplicatesXor(arr);
    }

}

package Arrays;

//leetcode question : https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/

// Given an array nums of integers, return how many of
// them contain an even number of digits.

public class EvenDigits {
    public static void main(String[] args) {
       int [] nums = {12,3415,11,23,6,7896};

        System.out.println(eveDigits(nums));

    }

    static int eveDigits(int [] arr) {
       int count=0;
        for (int i = 0; i < arr.length; i++) {
            if(even(arr[i])){
                count ++;
            }
        }
        return count;
    }

    // check number is even or not if yes return true
    static boolean even(int num){

        int numDigit=digit(num);
        return numDigit%2 ==0;
    }

    // count no of digit in a number
    static int digit(int num){
        int count =0;
        while(num>0){
            count++;
            num /= 10;
        }
        return count;
    }

}

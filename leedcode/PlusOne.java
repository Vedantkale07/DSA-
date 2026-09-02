package leedcode;

import java.util.Arrays;

public class PlusOne {

    public static void main(String[] args) {

        int [] digits={9,9,9};
        System.out.println(Arrays.toString(PlusOne(digits)));
    }

    static  int [] PlusOne(int [] digits){

        // array start from left side
        for (int i = digits.length-1; i >=0; i--) {
            //if element is less than 9 do this
            if(digits[i]< 9){
                digits[i]++;
                return digits;
            }else{
                //digit is greater equal 9 then replace with 0
                digits[i]=0;
            }
        }
        // if all element is [9,9] output = [1,0,0] so i have to increase length by one
        // and array become first [0,0,0] then we put 0th position one [1,0,0]
        int[] result= new int[digits.length +1];
        result[0]=1;
        return result;
    }
}

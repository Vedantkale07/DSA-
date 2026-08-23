package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RunningSum1DArray {

    public static void main(String[] args) {
        int [] nums = {1,2,3,4};
        System.out.println(Arrays.toString(runningSum(nums)));
    }

    public static int [] runningSum(int [] arr){

        int[] runSum= new int[arr.length];
        runSum[0]=arr[0];
        for (int i = 1; i < arr.length; i++) {
            runSum[i]= runSum[i-1]+ arr[i];
        }
        return runSum;
    }
}

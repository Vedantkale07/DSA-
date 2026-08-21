package Arrays;

import java.util.Arrays;

public class SwapArray {

    public static void main(String[] args) {

        int [] arr= {2,5,1,4,7};
        System.out.println("Before swap:");
        System.out.println(Arrays.toString(arr));
        swap(arr,0,3);

        System.out.println(Arrays.toString(arr));

    }
    static void swap(int [] arr, int index1, int index2){

        int temp=arr[index1];
        arr[index1]= arr[index2];
        arr[index2]= temp;

    }
}

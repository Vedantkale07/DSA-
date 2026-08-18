package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDiamention {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);


        int [][] arr= new int[3][3];

        for (int row = 0; row <arr.length; row++) {
            for (int col = 0; col < arr.length ; col++) {
                arr[row][col]= sc.nextInt();
            }
        }

        //output
//        for (int row = 0; row <arr.length; row++) {
//            for (int col = 0; col < arr.length ; col++) {
//                System.out.println(arr[row][col]+" ");
//            }
//            System.out.println();
//        }

        //output 2 way
//        for (int row = 0; row <arr.length; row++) {
//            System.out.println(Arrays.toString(arr[row]));
//        }

        // output 3rd way
        for(int []a : arr){
            System.out.println(Arrays.toString(a));
        }
    }
}

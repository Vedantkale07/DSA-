package Arrays;

import java.util.Scanner;

public class ArrayFirst {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        int [] arr= new int [5];
        arr[0] = 22;
        arr[1] = 25;
        arr[2] = 23;
        arr[3] = 11;
        arr[4]= 33;
        //arr[5]= 55;

        //System.out.println(arr[4]);

        //
        int [] arr1=  new int [5];

        System.out.println("Enter no:");
        for (int i = 0; i < arr1.length ; i++) {
            arr1[i]=sc.nextInt();
        }

        System.out.println("print array:");
        for (int i = 0; i <arr1.length ; i++) {
            System.out.println(arr1[i]);
        }

//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }

    }
}

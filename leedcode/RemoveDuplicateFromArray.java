package leedcode;

//Given an integer array nums sorted in non-decreasing order,
//remove the duplicates in-place such that each unique element appears only once.
//The relative order of the elements should be kept the same.

//Consider the number of unique elements in nums to be
// k​​​​​​​​​​​​​​.
// After removing duplicates, return the number of unique elements k.



public class RemoveDuplicateFromArray {

    public static void main(String[] args) {
    int [] arr={1,3,3,5,5,9};
        System.out.println(removeDuplicate(arr));
    }

    static int removeDuplicate(int [] arr){
        int i=0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]){
                i++;
                arr[i]= arr[j];
            }
        }
        return i+1;
    }
}

package Arrays;

public class BinarySearch {

    public static void main(String[] args) {
        int [] arr={3,5,7,11,14,43,56,74};
        System.out.println(binary(arr,74));

    }

    // element found in the list return index of element
    // otherwise return -1

    static int binary(int [] arr, int target){
        int start=0;
        int end= arr.length-1;

        while(start <= end){

        //  int mid= (start + end) /2 ;    // might be possible that (start + end) exceeds the range of integer
            int mid = start + (end - start) /2;
                if (target < arr[mid]) {
                   end= mid -1;
                } else if (target > arr[mid]) {
                    start= mid +1;
                } else {
                    return mid;
                }
            }
        // if element is not found
        return -1;
    }
}

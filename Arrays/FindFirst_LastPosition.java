package Arrays;

//Given an array of integers nums sorted in non-decreasing order,
// find the starting and ending position of a given target value.

//If target is not found in the array, return [-1, -1].
//You must write an algorithm with O(log n) runtime complexity.

//Example 1:

//Input: nums = [5,7,7,8,8,10], target = 8
//Output: [3,4]


import java.lang.reflect.Array;
import java.util.Arrays;

public class FindFirst_LastPosition {

    public static void main(String[] args) {
      int [] numbers = {5,7,7,8,8,10};
        System.out.println(Arrays.toString(findFistLastPosition(numbers,8)));

    }

    static int [] findFistLastPosition(int [] numb, int target){
       int first= findFirst(numb,target);
       int last= findLast(numb,target);
       return new int[]{first,last};

    }

    static int findFirst(int []numb, int target){
        int start =0;
        int end= numb.length -1;
        int save= -1;
        while (start<= end){
            int mid= start + (end -start) /2;
            if(target < numb[mid]){
                end= mid -1;
            }else if(target > numb[mid]){
                start=mid+1;
            }
            else if(target== numb[mid]) {
                save=mid;
                end= mid-1;
            }

        }
        return save;
    }

    static int findLast(int []numb, int target){
        int start =0;
        int end= numb.length -1;
        int save=-1;
        while (start<end){
            int mid= start + (end -start) /2;
            if(target < numb[mid]){
                end= mid -1;
            }else if(target > numb[mid]){
                start=mid+1;
            }
            else {
                save=mid;
                start=mid+1;
            }

        }
        return save;
    }
}

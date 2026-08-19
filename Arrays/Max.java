package Arrays;

public class Max {

    public static void main(String[] args) {

        int [] arr={3,4,5,2,7,9,2};

       // System.out.println(max(arr));

        System.out.println(maxRange(arr, 1,5));

    }

//    static int max(int [] arr){
//        int maxVal= arr[0];
//
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i]>maxVal){
//                maxVal=arr[i];
//            }
//        }
//        return maxVal;
//    }

    static int maxRange(int[] arr, int start, int end){

        if(end > start){
            return -1;
        }
        int maxVal= start;
        for (int i = start; i < end; i++) {
            if(arr[i]>maxVal){
                maxVal= arr[i];
            }
        }
        return maxVal;
    }

}

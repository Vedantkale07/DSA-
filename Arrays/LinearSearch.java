package Arrays;


    public static void main(String[] args) {
        int [] arr={2,5,77,22,9,11,15,19};
       int ans=  search(arr, 19);
        System.out.println(ans);
    }

    // if target element is present return index of that element
    // if element is not present in the array return -1
    public static int search(int[] arr, int target) {

            if(arr.length==0){
                return -1;
            }
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}

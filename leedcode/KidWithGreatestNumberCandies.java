package leedcode;

import java.util.ArrayList;
import java.util.List;


// ----KID  WITH THE GREATEST NUMBER OF CANDIES ----

//Input: candies = [2,3,5,1,3], extraCandies = 3
//Output: [true,true,true,false,true]


public class KidWithGreatestNumberCandies {
    public static void main(String[] args) {

    }

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        int max = Integer.MIN_VALUE;
        List<Boolean> result= new ArrayList<>();

        // this give max cadies number
        for (int i = 0; i < candies.length; i++) {
            if(max< candies[i]){
                max= candies[i];
            }
        }

        // find out kid with max candies
        // does kid have max candies it save true if not then false

        for(int i=0; i<candies.length; i++){
            if(candies[i]+ extraCandies >= max){
                result.add(true);
            }else{
                result.add(false);
            }
        }

        // return true fi kids have max candies else return false
        return result;
    }

}

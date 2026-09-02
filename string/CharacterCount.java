package string;

import java.util.HashMap;
import java.util.Map;

public class CharacterCount {
    public static void main(String[] args) {
        String str= "Java8Developer";
        Map<Character, Integer> map= new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char ch= str.charAt(i);

            map.compute(ch,(k,v) -> (v==null)? 1: v++ );
//             if(map.containsKey(ch)){
//                map.put(ch, map.get(ch)+ 1);
//            }else{
//                map.put(ch, 1);
//            }
        }
        System.out.println(map);
    }
}

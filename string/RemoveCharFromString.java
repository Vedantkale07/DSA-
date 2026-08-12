package string;

// we remove a char 'a' from the string by using recursion
// we take 2 string 1 is process String 2nd is Unprocess String
//
public class RemoveCharFromString {
    public static void main(String[] args) {

        // without return string
        // skip("","baccab");

        // return with string
        System.out.println( skipReturn("baccab"));;

    }

    static void skip(String p, String up){

        if(up.isEmpty()){
            System.out.print("\n After Removing Character from String..>>> ");
            System.out.print(p);
            return;
        }

        char ch= up.charAt(0);

        if(ch == 'a'){
            skip(p,up.substring(1));
        }else{
            skip(p +ch, up.substring(1));
        }
    }

    static String skipReturn(String up){
        if(up.isEmpty()){
            return "";
        }

        char ch= up.charAt(0);

        if(ch== 'a'){
           return skipReturn(up.substring(1));
        }else{
           return ch + skipReturn(up.substring(1));
        }
    }

}

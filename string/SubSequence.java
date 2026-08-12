package string;

public class SubSequence {
    public static void main(String[] args) {

        subSeq("","abc");

    }

    //this method return the sub string from  the main string
    // p-process, up- unprocess
    static void subSeq(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch=up.charAt(0);

        subSeq(p + ch, up.substring(1));
        subSeq(p,up.substring(1));
    }
}

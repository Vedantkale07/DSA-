package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class AttayListDemo {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        ArrayList<Integer> list= new ArrayList<>(5);
//        list.add(11);
//        list.add(13);
//        list.add(14);
//        list.add(16);
//        list.add(14);
//        list.add(12);

       // System.out.println(list);

        for (int i = 0; i <4 ; i++) {
            list.add(sc.nextInt());
        }

        //output
        System.out.println(list);

        //output
//        for (int i = 0; i < list.size(); i++) {
//            System.out.print(list.get(i)+" ");
//        }

    }
}

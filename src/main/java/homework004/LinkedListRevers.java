package homework004;


import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;

public class LinkedListRevers {
    public static void linkedListColl (int size) {
        LinkedList<Integer> list = new LinkedList<>();
        Random randomInt = new Random();
        for (int i = 0; i < size; i++) list.add ( randomInt.nextInt ( 101 ) );
        System.out.println ("Random list of elements: "  + list);




//        LinkedList<Integer> flippedList = reverseList(list);
//        System.out.println("flipped list " + flippedList);

        Collections.reverse ( list );
        System.out.println ("Flipped list " + list);
//        Collections.sort ( list );
//        System.out.println ("Sorted list " + list);



    }

//    private static LinkedList<Integer> reverseList(LinkedList<Integer> list) {
//
//        LinkedList<Integer> flippedList = new LinkedList<>();
//        for (Integer item : list) flippedList.addFirst ( item );
//        return flippedList;
//    }
}

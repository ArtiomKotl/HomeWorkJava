package homework004;

import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println ("Task_1");
        System.out.print("Please enter list size: ");
        int userNum = in.nextInt();
        LinkedListRevers revers = new LinkedListRevers ();
        revers.linkedListColl (userNum);
        System.out.println ("");

        System.out.println ("Task_2");
        System.out.println ("");


        System.out.print("Please enter queue size: ");
        MyQueue test = new MyQueue();
        Scanner ls = new Scanner(System.in);
        int userNum2 = in.nextInt();
        int size = userNum2;
        for (int i = 0; i < size; i++) test.enqueue ( ls.nextInt ( ) );
        System.out.print ("Queue of elements: ");
        test.print();
        System.out.print ("The first element from the queue and remove it: ");
        System.out.println(test.dequeue());
        System.out.print ("Queue of elements: ");
        test.print();
        System.out.print ("The first element from the queue without removing.: ");
        System.out.println(test.first());
        System.out.print ("Queue of elements: ");
        test.print();
        System.out.print ("Queue of elements: ");


    }
}

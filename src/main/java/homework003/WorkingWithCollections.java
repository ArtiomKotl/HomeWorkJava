package homework003;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class WorkingWithCollections {
    public void listCreation(int size){
        List<Integer> list = new ArrayList<> ();
        Random randomInt = new Random();
        for (int i = 0; i < size; i++) list.add ( randomInt.nextInt ( 101 ) );
        System.out.printf ("Random list of elements: "  + list);

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
                i--;
            }
        }
        System.out.println( "After removing even numbers from it " + list);

        int sumElements = 0;
        Collections.sort(list);
        System.out.println("Sorted list: " + list);
        int maxValue = list.get(list.size() - 1);
        int minValue = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            sumElements += list.get(i);
        }
        int averageValue = sumElements / list.size();
        System.out.println("Maximum List Value = " + maxValue);
        System.out.println("Minimum List Value = " + minValue);
        System.out.println("Average value in the list = " + averageValue);
    }


}

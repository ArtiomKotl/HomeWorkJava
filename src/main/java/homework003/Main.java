package homework003;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Print random list, removing even numbers\n" +
                " minimum value\n" +
                " maximum value\n" +
                " average value");
        Scanner in = new Scanner(System.in);
        System.out.print("EPlease enter list size: ");
        int userNum = in.nextInt();
        WorkingWithCollections task = new WorkingWithCollections ();
        task.listCreation (userNum);




    }
}

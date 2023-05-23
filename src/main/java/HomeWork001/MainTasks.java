package HomeWork001;

import java.util.Scanner;

public class MainTasks {
    public static void main(String[] args) {
        System.out.println("Exercise №1");
        Task001 task001 = new Task001();
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int userNum = in.nextInt();
        int TriangularNum = Task001.TriangularNumber(userNum);
        System.out.println("for number " + userNum + " triangular number = " + TriangularNum);
        int factorial = task001.getFactorial(userNum);
        System.out.println("for number " + userNum + " Factorial = " + factorial);
        System.out.println(" ");
        System.out.println("Exercise №2");
        System.out.println(" ");
        System.out.println("All prime numbers from 1 to 1000");
        Task002 task002 = new Task002();
        task002.primeNumber();






    }


}

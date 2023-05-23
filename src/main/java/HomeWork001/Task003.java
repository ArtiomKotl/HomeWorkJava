package HomeWork001;

import java.util.Scanner;

// 3) Реализовать простой калькулятор
public class Task003 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1 = in.nextInt();
        System.out.print("Enter operator: ");
        char operation = in.next().charAt(0);
        System.out.print("Enter number 2: ");
        int num2 = in.nextInt();
        int result;

        if (operation == '+') {
            result = num1+num2;
            System.out.println("Result = " + result);
        } else if (operation == '-') {
            result = num1-num2;
            System.out.println("Result = " + result);
        } else if (operation == '*') {
            result = num1*num2;
            System.out.println("Result = " + result);
        } else if (operation == '/') {
            try {
                result = num1/num2;
                System.out.println("Result = " + result);
            }
            catch (ArithmeticException e) {
                System.out.println("ERROR : Can't divide by zero!");

            }
        }

    }
}


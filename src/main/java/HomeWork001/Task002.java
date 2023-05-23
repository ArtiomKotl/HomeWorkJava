package HomeWork001;
// 2) Вывести все простые числа от 1 до 1000.

import java.util.Arrays;
public class Task002 {
    public void primeNumber() {
        for (int i = 2; i < 1000; i++) {
            boolean flag = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                System.out.print(" " + i);
            }
        }
    }
}

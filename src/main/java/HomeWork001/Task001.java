package HomeWork001;
// 1) Вычислить n-ое треугольного число (сумма чисел от 1 до n),
// n! (произведение чисел от 1 до n)
public class Task001 {
    public static int TriangularNumber(int n) {
            int result = (n * (n + 1)) / 2;
            return result;
        }
    public static int getFactorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }
}

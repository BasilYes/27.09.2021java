import java.util.Scanner;

public class Zad7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        result(scanner.nextInt(), 2);
    }

    public static void result(int n, int k){
        if (k > n / 2) {
            System.out.println(n);
            return;
        }
        if (n % k == 0) {
            System.out.println(k);
            result(n / k, k);
        }
        else
            result(n, ++k);
    }
}

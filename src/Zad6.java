import java.util.Scanner;

public class Zad6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(result(scanner.nextInt(),2));
    }

    public static boolean result(int n, int i){
        if (n < 2)
            return false;
        else if (n == 2)
            return true;
        else if (n % i == 0)
            return false;
        else if (i < n / 2)
            return result(n, i + 1);
        else
            return true;
    }
}

import java.util.Scanner;

public class Zad5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(sum(scanner.nextInt()));
    }

    public static int sum(int i){
        if (i > 9)
            return (i%10 + sum(i/10));
        else
            return i;
    }
}

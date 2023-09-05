import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read four numbers
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        // Decrement each number
        a--;
        b--;
        c--;
        d--;

        // Output the results separated by spaces
        System.out.println(a + " " + b + " " + c + " " + d);
    }
}
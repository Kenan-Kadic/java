import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;

        while (true) {
            int num = scanner.nextInt();
            if (num == 0) {
                break;
            }
            count++;
        }

        System.out.println(count);
    }
}
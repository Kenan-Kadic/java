import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        //System.out.println("Please enter a integer: ");
        int n = scanner.nextInt();
        System.out.println(((n + 1) * n + 2) * n + 3);
        scanner.close();
    }
}
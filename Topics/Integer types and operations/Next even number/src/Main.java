import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        //System.out.println("Please enter a number: ");
        int integer = scanner.nextInt();
        scanner.close();

        if(integer % 2 == 0) {
            System.out.println(integer+2);
        } else {
                System.out.println(integer+1);
            }

    }
}
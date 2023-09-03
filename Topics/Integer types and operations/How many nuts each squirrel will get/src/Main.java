import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        //System.out.println("Please enter the number of squirrels: ");
        int numberOfSquirrels = scanner.nextInt();

        //System.out.println("Please enter the number of nuts: ");
        int numberOfNuts = scanner.nextInt();

        scanner.close();

        int nutsPerSquirrel = (numberOfNuts / numberOfSquirrels);

        System.out.println(nutsPerSquirrel);
    }
}
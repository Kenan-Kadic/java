import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        //System.out.println("Please enter your first name: ");
        String firstName = scanner.nextLine();

        //System.out.println("Please enter your years of experience: ");
        int yearsOfExperience = scanner.nextInt();

        //System.out.println("What is your cousine experience: ");
        String cousineExperience = scanner.next();

        System.out.print("The form for " + firstName + " is completed.");
        System.out.print(" We will contact you if we need a chef who cooks " + cousineExperience + " dishes and has " + yearsOfExperience + " years of experience.");

    }
}
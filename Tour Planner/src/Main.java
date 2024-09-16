import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Tour Planning Program...");
        
        System.out.println("Please select the city you want to visit:");
        String city = scanner.nextLine();
        
        LinkedList<String> destinations = new LinkedList<>();
        
        System.out.println("How many different places would you like to visit?");
        int dest_num = scanner.nextInt();
        scanner.nextLine();
        
        for (int i = 0; i < dest_num; i++) {
            System.out.println("Enter place " + (i + 1) + ":");
            String place = scanner.nextLine();
            destinations.add(place);
        }
        
        if (destinations.size() == dest_num) {
            System.out.println("Your list has been successfully created.");
            System.out.println("Here is your list:");
            System.out.println(destinations);
        } else {
            System.out.println("An error occurred.");
        }
    }
}


import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static List<Person> people = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        loadPeopleFromCSV("people.csv");


        int option;
        do {
            showMenu();
            try {
                option = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                option = -1;
            }

            switch (option) {
                case 1 -> addPerson(scanner);
                case 2 -> listSorted(Comparator.comparing(Person::getFirstName), "First Name (A-Z)");
                case 3 -> listSorted(Comparator.comparing(Person::getFirstName).reversed(), "First Name (Z-A)");
                case 4 -> listSorted(Comparator.comparing(Person::getLastName), "Last Name (A-Z)");
                case 5 -> listSorted(Comparator.comparing(Person::getLastName).reversed(), "Last Name (Z-A)");
                case 6 -> listSorted(Comparator.comparing(Person::getDni), "DNI (1-9)");
                case 7 -> listSorted(Comparator.comparing(Person::getDni).reversed(), "DNI (9-1)");
                case 0 -> System.out.println("Goodbye!");
                default -> System.out.println("Invalid option. Please try again.");

            }
        } while (option != 0);

        savePeopleToCSV("people.csv");
        scanner.close();
    }

    private static void showMenu() {
        System.out.println("\n--- Menu ---");
        System.out.println("1. Add a person");
        System.out.println("2. Show people sorted by name (A-Z)");
        System.out.println("3. Show people sorted by name (Z-A)");
        System.out.println("4. Show people sorted by subname (A-Z)");
        System.out.println("5. Show people sorted by subname (Z-A)");
        System.out.println("6. Show people sorted by DNI (1-9)");
        System.out.println("7. Show people sorted by DNI (9-1)");
        System.out.println("0. Exit");
        System.out.print("Choose an option: ");
    }

    private static void loadPeopleFromCSV(String fileName) {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 4) {
                    people.add(new Person(data[0], data[1], data[2], data[3]));
                }
            }
        } catch (IOException e) {
            System.out.println("File not found. Starting with empty list.");
        }
    }


    private static void savePeopleToCSV(String fileName) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(fileName))) {
            for (Person p : people) {
                pw.println(p.getFirstName() + "," + p.getLastName() + "," + p.getSecondLastName() + "," + p.getDni());
            }
        } catch (IOException e) {
            System.out.println("Error saving the file.");
        }
    }

    private static void listSorted(Comparator<Person> comparator, String sortDescription) {
    List<Person> sortedList = new ArrayList<>(people);
    sortedList.sort(comparator);

    System.out.println("\nList of People sorted by " + sortDescription + ":\n");
    for (Person p : sortedList) {
        System.out.println(p);

    }
}

    private static void addPerson(Scanner scanner) {
    System.out.print("Enter the name: ");
    String firstName = scanner.nextLine();
    System.out.print("Enter the last name: ");
    String lastName = scanner.nextLine();
    System.out.print("Enter the second last name: ");
    String secondLastname = scanner.nextLine();
    System.out.print("Enter the DNI: ");
    String dni = scanner.nextLine();

        people.add(new Person(firstName, lastName, secondLastname, dni));


}

}








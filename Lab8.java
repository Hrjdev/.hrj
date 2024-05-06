import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

class Person {
    private String idNumber;
    private String firstName;
    private String lastName;
    private char gender;
    private int birthYear;
    private String profession;
    public Person(String idNumber, String firstName, String lastName, char gender, int birthYear, String profession) {
        this.idNumber = idNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.birthYear = birthYear;
        this.profession = profession;
    }
    public String getIdNumber() {
        return idNumber;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public char getGender() {
        return gender;
    }
    public int getBirthYear() {
        return birthYear;
    }
    public String getProfession() {
        return profession;
    }
    public void setProfession(String profession) {
        this.profession = profession;
    }
    public String toString() {
        return String.format("%-11s %-14s %-14s (%c %d) %s", idNumber, firstName, lastName, gender, birthYear, profession);
    }
}
public class Lab8 {
    public static void readPersons(String fileName, ArrayList<Person> persons) {
        try {
            File file = new File(fileName);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] data = line.split(";");
                if (data.length == 6) {
                    Person person = new Person(data[0], data[1], data[2], data[3].charAt(0), Integer.parseInt(data[4]), data[5]);
                    persons.add(person);
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static void printPersons(ArrayList<Person> persons) {
        for (int i = 0; i < persons.size(); i++) {
            Person person = persons.get(i);
            System.out.println(person);
        }
    }
    public static int printOldest(ArrayList<Person> persons) {
        int oldestYear = Integer.MAX_VALUE;
        int count = 0;
        for (int i = 0; i < persons.size(); i++) {
            Person person = persons.get(i);
            if (person.getBirthYear() < oldestYear) {
                oldestYear = person.getBirthYear();
                count = 1;
            } else if (person.getBirthYear() == oldestYear) {
                count++;
            }
        }
        System.out.println("Oldest persons were born in " + oldestYear + ":");
        for (int i = 0; i < persons.size(); i++) {
            Person person = persons.get(i);
            if (person.getBirthYear() == oldestYear) {
                System.out.println(person);
            }
        }
        return count;
    }
    public static void printByBirthYear(ArrayList<Person> persons, int year) {
        System.out.println("Persons born in " + year + ":");
        int count = 0;
        for (int i = 0; i < persons.size(); i++) {
            Person person = persons.get(i);
            if (person.getBirthYear() == year) {
                System.out.println(person);
                count++;
            }
        }
        System.out.println(count + " persons were born in " + year + ".");
    }
    public static void updProfession(ArrayList<Person> persons, String id, String profession) {
        for (int i = 0; i < persons.size(); i++) {
            Person person = persons.get(i);
            if (person.getIdNumber().equals(id)) {
                person.setProfession(profession);
                return;
            }
        }
    }
    public static void printById(ArrayList<Person> persons, String id) {
        for (int i = 0; i < persons.size(); i++) {
            Person person = persons.get(i);
            if (person.getIdNumber().equals(id)) {
                System.out.println(person);
                return;
            }
        }
    }
    public static void main(String[] args) {
        ArrayList<Person> personList = new ArrayList<>();
        readPersons("CS102_Lab8.txt", personList);
        System.out.println("Part 1:");
        System.out.println("There are " + personList.size() + " persons.");
        System.out.println("Persons:");
        printPersons(personList);
        System.out.println("\nPart 2:");
        int oldestCount = printOldest(personList);
        System.out.println("Number of oldest persons: " + oldestCount);
        System.out.println("\nPart 3:");
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter birth year: ");
        int year = kb.nextInt();
        printByBirthYear(personList, year);
        System.out.println("\nPart 4:");
        kb.nextLine();
        System.out.print("Enter person id: ");
        String id = kb.nextLine();
        System.out.print("Enter new profession: ");
        String newProfession = kb.nextLine();
        updProfession(personList, id, newProfession);
        printById(personList, id);
    }
}


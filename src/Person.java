public class Person {

    private String firstName;
    private String lastName;
    private String secondLastName;
    private String dni;

    public Person(String firstName, String lastName, String secondLastName, String dni) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.secondLastName = secondLastName;
        this.dni = dni;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSecondLastName() {
        return secondLastName;
    }

    public String getDni() {
        return dni;
    }

    @Override
    public String toString() {
        return String.format("%-15s %-20s %-20s %-10s",firstName, lastName, secondLastName, dni );



    }
}









package lesson7;

public class Contact {
    public static int contactsCount = 0;

    private String name;
    private String surname;
    private String phoneNumber;

    public Contact(String name, String surname, String phoneNumber) {
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        contactsCount++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void print() {
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("PhoneNumber: " + phoneNumber);
        System.out.println();
    }

    public static void printContactsCount() {
        System.out.println("Количество контактов: " + contactsCount);
        System.out.println();
    }
}
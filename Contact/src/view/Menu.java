package view;

import controller.ContactController;
import java.util.Scanner;
import model.Contact;

public class Menu {

    private ContactController controller;

    public Menu(ContactController controller) {
        this.controller = controller;
    }

    public void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("--------------------------------");
            System.out.println("*       CONTACT MANAGEMENT     *");
            System.out.println("--------------------------------");
            System.out.println("1. Add a contact");
            System.out.println("2. Display all contacts");
            System.out.println("3. Delete a contact");
            System.out.println("4. Exit");
            System.out.print("Please choose an option (1-4): ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addContact();
                    break;
                case 2:
                    displayAllContacts();
                    break;
                case 3:
                    deleteContact();
                    break;
                case 4:
                    System.out.println("Exiting the program.");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private void addContact() {
        System.out.println("--------------------------------");
        System.out.println("*          Add contacts        *");
        System.out.println("--------------------------------");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter full name: ");
        String fullName = scanner.nextLine();
        System.out.print("Enter group: ");
        String group = scanner.nextLine();
        System.out.print("Enter address: ");
        String address = scanner.nextLine();
        System.out.print("Enter phone: ");
        String phone = scanner.nextLine();

        Contact contact = new Contact(0, fullName, group, address, phone);
        controller.addContact(contact);
    }

    private void displayAllContacts() {
        System.out.println("--------------------------------");
        System.out.println("*      Display all contacts    *");
        System.out.println("--------------------------------");
        controller.displayAll();
    }

    private void deleteContact() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the ID of the contact to delete: ");
        int id = scanner.nextInt();
        controller.deleteContact(id);
    }
}

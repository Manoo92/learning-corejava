package com.careerit.cj.cbook;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

public class ContactManager {

    private static final ContactService service = new ContactServiceImpl();
    private static final Scanner scanner = new Scanner(System.in);
    private static final DateTimeFormatter DATE_FORMAT = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    public static void main(String[] args) {
        boolean running = true;
        while (running) {
            printMenu();
            int choice = readInt("Enter your choice: ");
            switch (choice) {
                case 1 -> addContact();
                case 2 -> getContact();
                case 3 -> getAllContacts();
                case 4 -> updateContact();
                case 5 -> deleteContact();
                case 6 -> searchContacts();
                case 7 -> sendBirthdayGreetings();
                case 0 -> {
                    running = false;
                    System.out.println("Goodbye!");
                }
                default -> System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private static void printMenu() {
        System.out.println("\n===== Contact Manager =====");
        System.out.println("1. Add Contact");
        System.out.println("2. Get Contact by ID");
        System.out.println("3. Get All Contacts");
        System.out.println("4. Update Contact");
        System.out.println("5. Delete Contact");
        System.out.println("6. Search Contacts");
        System.out.println("7. Send Birthday Greetings");
        System.out.println("0. Exit");
    }

    private static void addContact() {
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("DOB (yyyy-MM-dd): ");
        LocalDate dob = LocalDate.parse(scanner.nextLine(), DATE_FORMAT);
        System.out.print("Mobile: ");
        String mobile = scanner.nextLine();
        Contact contact = new Contact(null, name, email, dob, mobile);
        Contact added = service.addContact(contact);
        System.out.println("Contact added: " + added);
    }

    private static void getContact() {
        System.out.print("Enter contact ID: ");
        String id = scanner.nextLine();
        Contact contact = service.getContact(id);
        if (contact != null) {
            System.out.println(contact);
        } else {
            System.out.println("Contact not found.");
        }
    }

    private static void getAllContacts() {
        List<Contact> contacts = service.getAllContacts();
        if (contacts.isEmpty()) {
            System.out.println("No contacts found.");
        } else {
            contacts.forEach(System.out::println);
        }
    }

    private static void updateContact() {
        System.out.print("Enter contact ID to update: ");
        String id = scanner.nextLine();
        Contact existing = service.getContact(id);
        if (existing == null) {
            System.out.println("Contact not found.");
            return;
        }
        System.out.print("Name (" + existing.getName() + "): ");
        String name = scanner.nextLine();
        System.out.print("Email (" + existing.getEmail() + "): ");
        String email = scanner.nextLine();
        System.out.print("DOB (" + existing.getDob() + "): ");
        String dobStr = scanner.nextLine();
        System.out.print("Mobile (" + existing.getMobile() + "): ");
        String mobile = scanner.nextLine();

        existing.setName(name.isEmpty() ? existing.getName() : name);
        existing.setEmail(email.isEmpty() ? existing.getEmail() : email);
        existing.setDob(dobStr.isEmpty() ? existing.getDob() : LocalDate.parse(dobStr, DATE_FORMAT));
        existing.setMobile(mobile.isEmpty() ? existing.getMobile() : mobile);

        Contact updated = service.updateContact(existing);
        System.out.println("Contact updated: " + updated);
    }

    private static void deleteContact() {
        System.out.print("Enter contact ID to delete: ");
        String id = scanner.nextLine();
        boolean deleted = service.deleteContact(id);
        System.out.println(deleted ? "Contact deleted." : "Contact not found.");
    }

    private static void searchContacts() {
        System.out.print("Enter search keyword: ");
        String keyword = scanner.nextLine();
        List<Contact> results = service.searchContacts(keyword);
        if (results.isEmpty()) {
            System.out.println("No contacts found.");
        } else {
            results.forEach(System.out::println);
        }
    }

    private static void sendBirthdayGreetings() {
        String result = service.sendBirthdayGreetings();
        System.out.println(result);
    }

    private static int readInt(String prompt) {
        System.out.print(prompt);
        String line = scanner.nextLine();
        try {
            return Integer.parseInt(line);
        } catch (NumberFormatException e) {
            return -1;
        }
    }
}

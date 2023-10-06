package controller;

import java.util.ArrayList;
import java.util.List;
import model.Contact;

public class ContactController {

    private List<Contact> contactList;

    public ContactController() {
        contactList = new ArrayList<>();
    }

    public boolean addContact(Contact contact) {
        if (!isValidPhoneNumber(contact.getPhone())) {
            System.out.println("Invalid phone number format.");
            return false;
        }
        contact.setId(contactList.size() + 1);

        contactList.add(contact);
        System.out.println("Contact added successfully.");
        return true;
    }

    public void displayAll() {
        System.out.println("|ID|Name|First Name|Last Name|Group|Address|Phone|");
        for (Contact contact : contactList) {
            System.out.println(contact.toString());
        }
    }

    public boolean deleteContact(int id) {
        for (Contact contact : contactList) {
            if (contact.getId() == id) {
                contactList.remove(contact);
                System.out.println("Contact deleted successfully.");
                return true;
            }
        }
        System.out.println("Contact not found.");
        return false;
    }

    private boolean isValidPhoneNumber(String phone) {
        String regex = "^(\\d{10}|\\d{3}-\\d{3}-\\d{4}|\\d{3}-\\d{3}-\\d{4} x\\d{4}|\\d{3}-\\d{3}-\\d{4} ext\\d{4}|\\(\\d{3}\\)-\\d{3}-\\d{4}|\\d{3}\\.\\d{3}\\.\\d{4}|\\d{3} \\d{3} \\d{4})$";
        return phone.matches(regex);
    }

}

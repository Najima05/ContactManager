package org.example.contact.java;

import java.util.ArrayList;

/**
 * Manages an in-memory collection of contacts.
 * Provides operations for creating and storing contact entries identified by a name and phone number.
 */
public class ContactManager {

    private ArrayList<Contact> contacts = new ArrayList<>();

    public void addContact(String name, String phoneNumber) {
        Contact contact = new Contact(name, phoneNumber);
        contacts.add(contact);

    }

    public void viewContacts() {

        if(contacts.isEmpty()) {
            IO.println("No contacts was founded.");
            return;
        }

        for (Contact contact : contacts) {
           IO.println("Name: " + contact.getName());
            IO.println("Phone Number: " + contact.getPhoneNumber());
            IO.println("---------------");
        }
    }

    public void searchContact(String name) {

        for (Contact contact : contacts) {

            if (contact.getName().equalsIgnoreCase(name)) {

                IO.println("Contact found!");
                IO.println("Name: " + contact.getName());
                IO.println("Phone: " + contact.getPhoneNumber());

                return;
            }
        }

        IO.println("Contact not found.");

    }

    public void deleteContact(String name) {

        boolean removed = contacts.removeIf(
                contact -> contact.getName().equalsIgnoreCase(name));

        if (removed) {
            IO.println("Contact deleted successfully!");

        } else {
            IO.println("Contact not found.");
        }
    }
}

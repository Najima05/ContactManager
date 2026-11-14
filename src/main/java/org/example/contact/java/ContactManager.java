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
}

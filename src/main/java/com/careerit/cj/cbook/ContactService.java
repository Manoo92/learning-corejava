package com.careerit.cj.cbook;

import java.util.List;

public interface ContactService {
    Contact addContact(Contact contact);
    Contact getContact(String id);
    List<Contact> getAllContacts();
    Contact updateContact(Contact contact);
    boolean deleteContact(String id);
    List<Contact> searchContacts(String keyword);
    String sendBirthdayGreetings();
}

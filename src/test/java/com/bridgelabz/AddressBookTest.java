package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class AddressBookTest {
    AddressBook addressBook;

    @Test
    public void whenGivenAddressbook_whenAdded_shouldReturnContactList() {
        addressBook = new AddressBook();
        addressBook.message();
        Contact contact = new Contact("Gagan", "Sr", "Bengaluru", "Karnataka", 560099
                , 966339366, "gaganreddy30@gmail.com");
        Contact contact1 = new Contact("Shravya", "Gt", "Bengaluru", "Karnataka", 560076
                , 526157122, "shravya@gmail.com");
        addressBook.addNewContact(contact);
        addressBook.addNewContact(contact1);
        ArrayList<Contact> contactList = addressBook.getContactlist();
        Assertions.assertEquals(2, contactList.size());
    }
}
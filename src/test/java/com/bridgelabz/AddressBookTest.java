package com.bridgelabz;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookTest {
    AddressBook addressBook;
    Contact contact = new Contact("Gagan", "Sr", "Bengaluru", "Karnataka", 560076
            , 966339366, "gaganreddy@gmail.com");
    Contact contact1 = new Contact("Srinivas", "Rr", "Bengaluru", "Karnataka", 560076
            , 526157122, "srinivas@gmail.com");
    Contact newContact = new Contact("Shravya", "Gt", "indore", "MP",
            21212, 6876786, "shravyareddy@gmail.com");
    Contact newContact2 = new Contact("Manuew", "re", "indore", "kl",
            21212, 6876786, "manushetty7799@gmail.com");

    @Test
    public void givenAddressbook_whenAdded_shouldReturnContactList() {
        addressBook = new AddressBook();
        addressBook.message();
        Contact contact = new Contact("Gagan", "Sr", "Bengaluru", "Karnataka", 560076
                , 966339366, "gaganreddy@gmail.com");
        Contact contact1 = new Contact("Srinivas", "Kv", "Bengaluru", "Karnataka", 560076
                , 526157122, "srinivas@gmail.com");
        addressBook.addNewContact(contact);
        addressBook.addNewContact(contact1);
        ArrayList<Contact> contactList = addressBook.getContactlist();
        Assertions.assertEquals(2, contactList.size());
    }
}
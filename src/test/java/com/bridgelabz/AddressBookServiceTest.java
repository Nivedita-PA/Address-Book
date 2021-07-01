package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

import java.awt.*;
import java.util.List;

public class AddressBookServiceTest {

    @Test
    public void givenTestShouldReturn_The_Count_Of_Contacts_In_DB() {
     AddressBookService addressBookService = new AddressBookService();
        List<Contacts> contactsList = addressBookService.readAddressBook(AddressBookService.IOService.DB_IO);
        Assert.assertEquals(2,contactsList.size());
    }
}

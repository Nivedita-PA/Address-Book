package com.bridgelabz;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class AddressBookFileIO {

    public static String ADD_BOOK_FILE_NAME = "E:\\Address-Book\\src\\main\\resources\\addBook.csv";

    public void writeData(List<Contacts> contactsList) {
        StringBuffer newEmpBuffer = new StringBuffer();
        contactsList.forEach(contacts -> {
            String contactsDataString = contacts.toString().concat("\n");
            newEmpBuffer.append(contactsDataString);
        });

        try{
            Files.write(Paths.get(ADD_BOOK_FILE_NAME), newEmpBuffer.toString().getBytes());
        }catch (IOException e) { }
    }

    public void printData() {
        try{
            Files.lines(new File(ADD_BOOK_FILE_NAME).toPath())
                    .forEach(System.out::println);
        }catch (IOException e) { }
    }

    public long countEntries() {
        long entries = 0;
        try{
            entries = Files.lines(new File(ADD_BOOK_FILE_NAME).toPath())
                    .count();
        }catch (IOException e){ }
        return entries;
    }

    public List<Contacts> readData(){
        List<Contacts> contactsList = new ArrayList<>();
        try{
            Files.lines(new File(ADD_BOOK_FILE_NAME).toPath())
                    .map(line->line.trim())
                    .forEach(line->
                    contactsList.add(new Contacts(line)));
        }catch (IOException e){
            e.printStackTrace();
        }
        return contactsList;
    }
}

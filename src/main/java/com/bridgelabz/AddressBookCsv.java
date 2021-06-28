package com.bridgelabz;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;

import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.StreamSupport;

public class AddressBookCsv{

   private static final String FILE_PATH = "E:\\Address-Book\\src\\main\\resources\\addBook.csv";


   public void writeAddressBook(){
        try (Writer writer = Files.newBufferedWriter(Paths.get(FILE_PATH));){
            StatefulBeanToCsv<ContactsCsv> beanToCsv = new StatefulBeanToCsvBuilder(writer)
                    .build();
            ArrayList<ContactsCsv> contactsList = new ArrayList<>();
            Scanner consoleInputReader = new Scanner(System.in);
            int i;
            System.out.println("Enter number of contact entries:");
            int times = consoleInputReader.nextInt();
            for(i=1; i<=times; i++) {
                System.out.println("To enter new contacts:");
                System.out.println("Enter first name: ");
                String firstName = consoleInputReader.next();
                System.out.println("Enter last name: ");
                String lastName = consoleInputReader.next();
                System.out.println("Enter address: ");
                String address = consoleInputReader.next();
                System.out.println("Enter city: ");
                String city = consoleInputReader.next();
                System.out.println("Enter state: ");
                String state = consoleInputReader.next();
                System.out.println("Enter zip code: ");
                String zipcode = consoleInputReader.next();
                System.out.println("Enter phone number: ");
                String phoneNumber = consoleInputReader.next();
                System.out.println("Enter email: ");
                String email = consoleInputReader.next();
                contactsList.add(new ContactsCsv(firstName, lastName, address, city, state, zipcode, phoneNumber, email));
            }
            beanToCsv.write(contactsList);
        } catch (Exception e) {
            e.printStackTrace();
   }
}

    public int readAddBook(){
        int numOfEntries = 0;
       try (Reader reader = Files.newBufferedReader(Paths.get(FILE_PATH));){
           CsvToBean<ContactsCsv> csvToBean = new CsvToBeanBuilder(reader).withType(ContactsCsv.class)
                   .build();
           Iterator<ContactsCsv> contactsCsvIterator = csvToBean.iterator();
           while(contactsCsvIterator.hasNext()){
               ContactsCsv contactsCsv = contactsCsvIterator.next();
               System.out.println("address: " +contactsCsv.getAddress());
               System.out.println("city: " +contactsCsv.getCity());
               System.out.println("Email: " +contactsCsv.getEmail());
               System.out.println("FirstName: " +contactsCsv.getFirstName());
               System.out.println("LastName: " +contactsCsv.getLastName());
               System.out.println("Phone-Number: " +contactsCsv.getPhoneNumber());
               System.out.println("state: " +contactsCsv.getState());
               System.out.println("zipCode: " +contactsCsv.getZip());
               System.out.println("-----------------------------------------");
           }
           Iterable<ContactsCsv> contactsCsvIterable = () -> contactsCsvIterator;
           numOfEntries = (int) StreamSupport.stream(contactsCsvIterable.spliterator(), false).count();
           System.out.println(numOfEntries);
       }catch (Exception e){
           e.printStackTrace();
       }
        return numOfEntries;
    }

    public static void main(String[] args){
        AddressBookCsv addressBookCsv = new AddressBookCsv();
        //addressBookCsv.writeAddressBook();
        addressBookCsv.readAddBook();
    }
    
}


package com.bridgelabz;

import com.opencsv.bean.CsvBindByName;

public class ContactsCsv {

    public ContactsCsv() {
    }

    @CsvBindByName(column = "FirstName", required=false)
    public String firstName;

    @CsvBindByName(column = "LastName", required=false)
    public String lastName;

    @CsvBindByName(column = "address", required=false)
    public String address;

    @CsvBindByName(column = "city", required=false)
    public String city;

    @CsvBindByName(column = "state", required=false)
    public String state;

    @CsvBindByName(column = "zipCode", required=false)
    public String zip;

    @CsvBindByName(column = "Phone-Number", required=false)
    public String phoneNumber;

    @CsvBindByName(column = "Email", required=false)
    public String email;


    public ContactsCsv(String firstName, String lastName, String address, String city, String state, String zip, String phoneNumber, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

}

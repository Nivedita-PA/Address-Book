package com.bridgelabz;

import com.opencsv.bean.CsvBindByName;

import java.util.Objects;

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

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "ContactsCsv{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip='" + zip + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

}

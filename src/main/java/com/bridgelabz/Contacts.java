package com.bridgelabz;

import java.util.Objects;

public class Contacts {

    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String zipCode;
    private String phoneNumber;
    private String email;

    public Contacts(String firstName, String lastName, String address, String city, String state, String zipCode, String phoneNumber, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public Contacts() {
    }

    public Contacts(String line) {
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


    public String getZipCode() {
        return zipCode;
    }


    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
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
        return "Contacts [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", city=" + city
                + ", state=" + state + ", zipCode=" + zipCode + ", phoneNumber=" + phoneNumber + ", email=" + email + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contacts)) return false;
        Contacts contacts = (Contacts) o;
        return Objects.equals(firstName, contacts.firstName) && Objects.equals(lastName, contacts.lastName) && Objects.equals(address, contacts.address) && Objects.equals(city, contacts.city) && Objects.equals(state, contacts.state) && Objects.equals(zipCode, contacts.zipCode) && Objects.equals(phoneNumber, contacts.phoneNumber) && Objects.equals(email, contacts.email);
    }

}

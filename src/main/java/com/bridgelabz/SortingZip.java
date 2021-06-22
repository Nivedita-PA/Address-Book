package com.bridgelabz;

import java.util.Comparator;

public class SortingZip implements Comparator<Contacts> {
    @Override
    public int compare(Contacts c1, Contacts c2){
        String zip1 = c1.getZipCode();
        String zip2= c2.getZipCode();
        return zip1.compareToIgnoreCase(zip2);
    }
}
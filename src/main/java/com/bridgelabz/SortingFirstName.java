package com.bridgelabz;

import java.util.Comparator;

public class SortingFirstName implements Comparator<Contacts> {
    @Override
    public int compare(Contacts c1, Contacts c2){
        String firstName1 = c1.getFirstName();
        String firstName2= c2.getFirstName();
        return firstName1.compareToIgnoreCase(firstName2);
    }
}

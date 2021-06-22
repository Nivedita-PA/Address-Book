package com.bridgelabz;

import java.util.Comparator;

public class SortingCity implements Comparator<Contacts> {
    @Override
    public int compare(Contacts c1, Contacts c2){
        String city1 = c1.getCity();
        String city2= c2.getCity();
        return city1.compareToIgnoreCase(city2);
    }
}

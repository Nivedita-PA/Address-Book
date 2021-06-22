package com.bridgelabz;


import java.util.Comparator;

public class SortingState implements Comparator<Contacts> {
    @Override
    public int compare(Contacts c1, Contacts c2){
        String state1 = c1.getState();
        String state2= c2.getState();
        return state1.compareToIgnoreCase(state2);
    }
}
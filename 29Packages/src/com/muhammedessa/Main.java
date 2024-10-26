package com.muhammedessa;

import com.muhammedessa.databaseclasses.Person;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> myList = new ArrayList<>(4);
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        System.out.println(myList);
        Person p1 = new Person();
    }
}
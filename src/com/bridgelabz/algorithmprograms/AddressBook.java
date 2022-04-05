package com.bridgelabz.algorithmprograms;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {

    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Person> addressBook = new ArrayList<Person>();

    public static void main(String[] args) {
        System.out.println("Welcome to the Address Book Problem");
        System.out.println("Enter a first name:");
        String firstName=scanner.next();
        System.out.println("Enter a last name:");
        String lastName=scanner.next();
        System.out.println("Enter a Address:");
        String address=scanner.next();
        System.out.println("Enter a City name:");
        String city=scanner.next();
        System.out.println("Enter a state:");
        String state=scanner.next();
        System.out.println("Enter a email:");
        String email=scanner.next();
        System.out.println("Enter a zip code:");
        int  zip=scanner.nextInt();
        System.out.println("Enter a phone number:");
        long phoneNumber=scanner.nextLong();

        Person details1=new Person(firstName, lastName, address,  city, state, email,  zip, phoneNumber);
        addressBook.add(details1);
        System.out.print(addressBook);
        System.out.println("succesfully created contacts");
    }
}


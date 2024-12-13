package org.example;

import org.example.mobile.Contact;
import org.example.mobile.MobilePhone;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        MobilePhone mobilePhone = new MobilePhone("23241231" , new ArrayList<>());
        mobilePhone.addNewContact(new Contact( " ibo" ,  "546765432"));
        mobilePhone.printContacts();

    }
}

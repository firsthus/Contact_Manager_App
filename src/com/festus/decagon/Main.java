package com.festus.decagon;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        ContactManager graceContactManager = new ContactManager();

        Contact ubong = new Contact();
        ubong.name = "Ubong Eno Nkereuwem";
        ubong.email = "ubongenonkereuwem@gmail.com";
        ubong.phoneNumber = "08056999579";
        graceContactManager.insertContact(ubong);

        Contact chibuzor = new Contact();
        chibuzor.phoneNumber = "08037455227";
        chibuzor.email = "chibo.steven@yahoo.com";
        chibuzor.name = "Chibuzor Steven Ngaduonye";
        graceContactManager.insertContact(chibuzor);

        Contact moses = new Contact();
        moses.email = "mosesahem@gmail.com";
        moses.phoneNumber = "08143859372";
        moses.name = "Moses Lawrence Ahem";
        graceContactManager.insertContact(moses);

        Contact jennifer = new Contact();
        jennifer.name = "Jennifer Adaeze Peter";
        jennifer.phoneNumber = "08188332672";
        jennifer.email = "jenniferadaeze@gmail.com";
        graceContactManager.insertContact(jennifer);

        Contact festus = new Contact();
        festus.name = "Festus Simpa Audu";
        festus.email = "audufirsthus@gmail.com";
        festus.phoneNumber = "08163110812";
        graceContactManager.insertContact(festus);

        System.out.println(graceContactManager.directory[2].name);

        System.out.println(graceContactManager.searchContact("Moses Lawrence Ahem"));


    }
}

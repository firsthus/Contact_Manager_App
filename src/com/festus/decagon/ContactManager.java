package com.festus.decagon;

public class ContactManager {
        Contact [] directory;
        int directoryPosition;

        ContactManager(){
            this.directory = new Contact[500];
            this.directoryPosition = 0;
        }

        void insertContact(Contact newContact){
            directory[directoryPosition] = newContact;
            directoryPosition++;
        }

        Contact searchContact(String searchName){
            for (int i = 0; i < directory.length; i++){
                if(directory[i].name.equals(searchName)){
                    return (directory[i]);
                }
            }
            System.out.println("Contact not found");
            return null;
        }

}


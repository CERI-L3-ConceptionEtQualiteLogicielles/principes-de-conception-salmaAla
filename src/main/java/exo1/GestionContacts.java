package exo1;

import java.util.ArrayList;
import java.util.List;

public class GestionContacts {
    private static GestionContacts instance;
    private List<Contact> contacts;

    private GestionContacts() {
        contacts = new ArrayList<>();
    }

    public static GestionContacts getInstance() {
        if (instance == null) {
            instance = new GestionContacts();
        }
        return instance;
    }

    public void ajouteContact(Contact contact) {
        contacts.add(contact);
    }

    public void supprimeContact(Contact contact) {
        contacts.remove(contact);
    }

    public void afficheContacts() {
        for (Contact c : contacts) {
            System.out.println(c);
        }
    }


    public List<Contact> getContacts() {
        return new ArrayList<>(contacts);
    }
}

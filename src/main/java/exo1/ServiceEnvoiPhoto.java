package exo1;

import java.awt.Image;

public class ServiceEnvoiPhoto {
    public void envoiPhoto(Contact c, Image i) {
        System.out.println("Photo envoyée à " + c.getNom());
    }
}

package exo1;

import java.awt.Image;

public class ServicePhotoAdapter {
    private ServiceEnvoiPhoto servicePhoto;

    public ServicePhotoAdapter() {
        this.servicePhoto = new ServiceEnvoiPhoto();
    }

    public void envoyerPhoto(Contact contact, Image image) {
        servicePhoto.envoiPhoto(contact, image);
    }
}

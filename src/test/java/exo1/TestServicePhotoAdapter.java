package exo1;

import org.junit.jupiter.api.Test;
import java.awt.Image;
import static org.junit.jupiter.api.Assertions.*;

public class TestServicePhotoAdapter {
    @Test
    public void testEnvoyerPhoto() {
        ServicePhotoAdapter photoAdapter = new ServicePhotoAdapter();
        Contact contact = new Contact.ContactBuilder("SALMA", "0782443599")
                .addEmail("salma.alaoui@outlook.com")
                .build();
        Image image = null; // simulation d'une image

        assertDoesNotThrow(() -> photoAdapter.envoyerPhoto(contact, image));
    }
}

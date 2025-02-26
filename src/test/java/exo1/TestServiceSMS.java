package exo1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestServiceSMS {
    @Test
    public void testEnvoyerSMS() {
        ServiceSMS smsService = new ServiceSMS();
        Contact contact = new Contact.ContactBuilder("SALMA", "0782443599")
                .addEmail("salma.alaoui@outlook.com")
                .build();

        // on ne peut pas tester System.out mais on peut vérifier que la méthode ne plante pas
        assertDoesNotThrow(() -> smsService.envoyer(contact, "SALUTT!"));
    }
}

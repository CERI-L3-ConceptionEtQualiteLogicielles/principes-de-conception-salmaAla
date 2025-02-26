package exo1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestGestionContacts {
    @Test
    public void testAjoutContact() {
        GestionContacts gestion = GestionContacts.getInstance();
        Contact contact = new Contact.ContactBuilder("SALMA", "0782443599")
                .addEmail("salma.alaoui@outlook.com")
                .build();
        gestion.ajouteContact(contact);

        assertEquals(1, gestion.getContacts().size());

        System.out.println(" Test GestionContacts - Ajout Contact réussi ");
    }
}

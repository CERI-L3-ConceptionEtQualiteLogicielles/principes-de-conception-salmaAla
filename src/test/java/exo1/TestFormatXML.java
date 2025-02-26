package exo1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestFormatXML {
    @Test
    public void testFormatXML() {
        Contact contact = new Contact.ContactBuilder("SALMA", "0782443599")
                .addEmail("salma.alaoui@outlook.com")
                .build();
        FormatXML xmlFormatter = new FormatXML();

        String expected = "<contact><nom>SALMA</nom><telephone>0782443599</telephone><email>salma.alaoui@outlook.com</email></contact>";
        assertEquals(expected, xmlFormatter.formatter(contact));

        System.out.println(" Test FormatXML - XML généré correctement perfectt");
    }
}

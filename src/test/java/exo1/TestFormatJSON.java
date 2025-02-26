package exo1;

import org.json.JSONObject;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestFormatJSON {
    @Test
    public void testFormatJSON() {
        Contact contact = new Contact.ContactBuilder("SALMA", "0782443599")
                .addEmail("salma.alaoui@outlook.com")
                .build();
        FormatJSON jsonFormatter = new FormatJSON();

        JSONObject expectedJson = new JSONObject();
        expectedJson.put("nom", "SALMA");
        expectedJson.put("telephone", "0782443599");
        expectedJson.put("email", "salma.alaoui@outlook.com");

        JSONObject actualJson = new JSONObject(jsonFormatter.formatter(contact));

        assertEquals(expectedJson.toString(), actualJson.toString());

        System.out.println("Test FormatJSON - JSON généré correctement c good");
    }
}

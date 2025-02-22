package exo1;

import org.json.JSONObject;

public class FormatJSON implements FormatAffichage {
    @Override
    public String formatter(Contact contact) {
        JSONObject json = new JSONObject();
        json.put("nom", contact.getNom());
        json.put("telephone", contact.getNumero());
        if (contact.getEmail() != null) json.put("email", contact.getEmail());
        return json.toString();
    }
}

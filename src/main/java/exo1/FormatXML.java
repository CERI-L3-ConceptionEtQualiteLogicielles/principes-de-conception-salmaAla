package exo1;
//
public class FormatXML implements FormatAffichage {
    @Override
    public String formatter(Contact contact) {
        return "<contact><nom>" + contact.getNom() + "</nom><telephone>" + contact.getNumero() + "</telephone>" +
                (contact.getEmail() != null ? "<email>" + contact.getEmail() + "</email>" : "") + "</contact>";
    }
}
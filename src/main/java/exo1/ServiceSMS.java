package exo1;

public class ServiceSMS implements EnvoiMessage {
    @Override
    public void envoyer(Contact contact, String message) {
        System.out.println("SMS envoyé à " + contact.getNumero() + ": " + message);
    }
}
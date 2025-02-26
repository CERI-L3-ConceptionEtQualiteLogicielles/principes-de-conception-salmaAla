package exo1;

public final class Contact {
    private final String nom;
    private final String numero;
    private final String prenom;
    private final String civilite;
    private final String adressePostale;
    private final String email;
    private final String dateAnniversaire;
    private final String lieuTravail;
    private final String ville;

    private Contact(ContactBuilder builder) {
        this.nom = builder.nom;
        this.numero = builder.numero;
        this.prenom = builder.prenom;
        this.civilite = builder.civilite;
        this.adressePostale = builder.adressePostale;
        this.email = builder.email;
        this.dateAnniversaire = builder.dateAnniversaire;
        this.lieuTravail = builder.lieuTravail;
        this.ville = builder.ville;
    }

    public String getNom() { return nom; }
    public String getNumero() { return numero; }
    public String getEmail() { return email; }

    @Override
    public String toString() {
        return "Nom: " + nom + ", Prénom: " + prenom + ", Numéro: " + numero +
                ", Email: " + (email != null ? email : "Non fourni");
    }

    // Classe interne ContactBuilder
    public static class ContactBuilder {
        private final String nom;
        private final String numero;
        private String prenom;
        private String civilite;
        private String adressePostale;
        private String email;
        private String dateAnniversaire;
        private String lieuTravail;
        private String ville;

        public ContactBuilder(String nom, String numero) {
            this.nom = nom;
            this.numero = numero;
        }

        public ContactBuilder addPrenom(String prenom) {
            this.prenom = prenom;
            return this;
        }

        public ContactBuilder addCivilite(String civilite) {
            this.civilite = civilite;
            return this;
        }

        public ContactBuilder addAdressePostale(String adressePostale) {
            this.adressePostale = adressePostale;
            return this;
        }

        public ContactBuilder addEmail(String email) {
            this.email = email;
            return this;
        }

        public ContactBuilder addDateAnniversaire(String dateAnniversaire) {
            this.dateAnniversaire = dateAnniversaire;
            return this;
        }

        public ContactBuilder addLieuTravail(String lieuTravail) {
            this.lieuTravail = lieuTravail;
            return this;
        }

        public ContactBuilder addVille(String ville) {
            this.ville = ville;
            return this;
        }

        public Contact build() {
            return new Contact(this);
        }
    }
}

public class Joueur {
    private int pv; // Points de vie du joueur
    private int argent; // Argent du joueur

    // Constructeur pour initialiser les valeurs de départ
    public Joueur(int pv, int argent) {
        this.pv = pv;
        this.argent = argent;
    }

    // Méthode pour perdre des points de vie
    public void perdrePV(int montant) {
        this.pv -= montant;
        if (this.pv < 0)
            this.pv = 0; // Assure que les PV ne deviennent pas négatifs
    }

    // Méthode pour ajouter de l'argent
    public void gagnerArgent(int montant) {
        this.argent += montant;
    }

    // Méthode pour dépenser de l'argent
    public boolean depenserArgent(int montant) {
        if (this.argent >= montant) {
            this.argent -= montant;
            return true; // Dépense réussie
        }
        return false; // Pas assez d'argent
    }

    // Méthode pour afficher les informations du joueur
    public void afficherInfos() {
        System.out.println("PV : " + this.pv + " | Argent : " + this.argent);
    }

    // Getters pour accéder aux valeurs (si besoin)
    public int getPV() {
        return this.pv;
    }

    public int getArgent() {
        return this.argent;
    }
}

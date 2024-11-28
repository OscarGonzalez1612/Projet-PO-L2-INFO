public class Tour {
    private String nom;
    private int cout; // Coût de la tour
    private int degats; // Dégâts de la tour

    // Constructeur
    public Tour(String nom, int cout, int degats) {
        this.nom = nom;
        this.cout = cout;
        this.degats = degats;
    }

    // Getters pour accéder aux propriétés
    public String getNom() {
        return this.nom;
    }

    public int getCout() {
        return this.cout;
    }

    public int getDegats() {
        return this.degats;
    }

    // Afficher les informations de la tour
    public void afficherInfos() {
        System.out.println(this.nom + " | Coût : " + this.cout + " | Dégâts : " + this.degats);
    }
}

public class Main {
    public static void main(String[] args) {
        // Crée un joueur avec 100 PV et 50 pièces d'or
        Joueur joueur = new Joueur(100, 50);

        // Affiche les informations du joueur
        joueur.afficherInfos();

        // Le joueur perd 20 PV
        joueur.perdrePV(20);
        joueur.afficherInfos();

        // Le joueur gagne 30 pièces d'or
        joueur.gagnerArgent(30);
        joueur.afficherInfos();

        // Le joueur essaie d'acheter quelque chose qui coûte 60
        if (joueur.depenserArgent(60)) {
            System.out.println("Achat réussi !");
        } else {
            System.out.println("Pas assez d'argent !");
        }

        joueur.afficherInfos();
    }
}

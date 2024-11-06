public class Compte {

    int solde = 0;
    String titulaire;


    public Compte(String titulaire) {
        this.titulaire = titulaire;
    }

    public void deposer(int montant) {
        solde += montant;
    }


    public void retirer(int montant) {
        solde -= montant;
    }


    public void virer(int montant, Compte destination) {
        this.retirer(montant);
        destination.deposer(montant);
    }


    public void afficher() {
        System.out.println("Titulaire: " + titulaire + ", Solde: " + solde + " EUR");
    }
}

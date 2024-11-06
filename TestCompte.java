public class TestCompte {
    public static void main(String[] args) {

        Compte compte1 = new Compte("Alice Dupont");
        Compte compte2 = new Compte("Bob Martin");


        compte1.deposer(1000);
        compte2.deposer(500);


        compte2.retirer(100);


        compte1.virer(200, compte2);


        System.out.println("Après les opérations :");
        compte1.afficher();
        compte2.afficher();
    }
}

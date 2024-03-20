public class HelloWorld {
    public static void main(String[] args) {
        GroupeClasse uneClasse = new GroupeClasse("SIO1");
        GroupeClasse deuxClasse = new GroupeClasse("SIO2");
        Etudiant unepersonne = new Etudiant("Luciani", "Clara", "3 Rue des Pommiers en fleur", 20.0, uneClasse);
        Etudiant deuxpersonne = new Etudiant("Messi", "Lionel", "16 bis Rue de la Fraude", 0.0, deuxClasse);

        System.out.println(unepersonne.infoEtudiant());
        System.out.println(deuxpersonne.infoEtudiant());
    }
}
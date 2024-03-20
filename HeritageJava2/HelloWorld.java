import java.util.ArrayList;

public class HelloWorld {
    public static void main(String[] args) {
        //Par rapport à HeritageJava, on a cherché à changer la navigabilité (donc on accède aux étudiants via la classe, et non à la classe via les étudiants.)
        Etudiant unEtudiant = new Etudiant("Messi", "Lionel", "3 Rue de la Fraude", 0.0);
        Etudiant deuxEtudiant = new Etudiant("Luciani", "Clara", "3 Rue Victor Hugo", 20.0);
        Etudiant troisEtudiant = new Etudiant("Ribery", "Franck", "9 bis Rue Alphonse Lachèvre", 15.0);
        Etudiant quatreEtudiant = new Etudiant("Brassens", "Georges", "10 Rue de la Plage de Sète", 20.0);

        ArrayList<Etudiant> oClasseSIO1 = new ArrayList<>();
        ArrayList<Etudiant> oClasseSIO2 = new ArrayList<>();
        oClasseSIO1.add(unEtudiant);
        oClasseSIO1.add(troisEtudiant);
        oClasseSIO2.add(deuxEtudiant);
        oClasseSIO2.add(quatreEtudiant);

        GroupeClasse uneClasse = new GroupeClasse("SIO1", oClasseSIO1);
        GroupeClasse deuxClasse = new GroupeClasse("SIO2", oClasseSIO2);

        System.out.println("Liste des étudiants de SIO1");
        for(Etudiant etudiant : uneClasse.getLesEtudiants()) {
            System.out.println(etudiant.infoEtudiant());
        }

        System.out.println("Liste des étudiants de SIO2");
        for(Etudiant etudiant : deuxClasse.getLesEtudiants()) {
            System.out.println(etudiant.infoEtudiant());
        }

        System.out.println("Nombre d'élèves dans la classe " + uneClasse.getNom() + " : " + uneClasse.getLesEtudiants().size());
        System.out.println("Nombre d'élèves dans la classe " + deuxClasse.getNom() + " : " + deuxClasse.getLesEtudiants().size());


    }
}
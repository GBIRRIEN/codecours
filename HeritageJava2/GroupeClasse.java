import java.util.ArrayList;

public class GroupeClasse {
    private String Nom;
    private ArrayList<Etudiant> lesEtudiants;

    public GroupeClasse (String unNom, ArrayList<Etudiant> listEtudiants) {
        this.Nom = unNom;
        this.lesEtudiants = listEtudiants;
    }
    
    public String getNom() {
        return this.Nom;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public ArrayList<Etudiant> getLesEtudiants() {
        return this.lesEtudiants;
    }

    public void setLesEtudiants(ArrayList<Etudiant> lesEtudiants) {
        this.lesEtudiants = lesEtudiants;
    }

}

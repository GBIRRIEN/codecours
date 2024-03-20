public class Etudiant extends Personne {
    private String Adresse;
    private Double Moyenne;
    private GroupeClasse Classe;

    public Etudiant (String unNom, String unPrenom, String uneAdresse, Double uneMoyenne, GroupeClasse uneClasse) {
        super(unNom, unPrenom);
        this.Adresse = uneAdresse;
        this.Moyenne = uneMoyenne;
        this.Classe = uneClasse;
    }

    public String getAdresse() {
        return this.Adresse;
    }

    public void setAdresse(String Adresse) {
        this.Adresse = Adresse; 
    }

    public Double getMoyenne() {
        return this.Moyenne;
    }

    public void setMoyenne(Double Moyenne) {
        this.Moyenne = Moyenne;
    }

    public GroupeClasse getClasse() {
        return this.Classe;
    }

    public void setClasse(GroupeClasse Classe) {
        this.Classe = Classe;
    }

    public String infoEtudiant() {
        String str = super.getNomComplet() + "\n Adresse : " + this.Adresse + "\n Moyenne : " + this.Moyenne + "\n Classe : " + this.Classe.getNom() + "\n";
        return str;
    }
    
}

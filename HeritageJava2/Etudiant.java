public class Etudiant extends Personne {
    private String Adresse;
    private Double Moyenne;

    public Etudiant (String unNom, String unPrenom, String uneAdresse, Double uneMoyenne) {
        super(unNom, unPrenom);
        this.Adresse = uneAdresse;
        this.Moyenne = uneMoyenne;
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

    public String infoEtudiant() {
        String str = super.getNomComplet() + "\n Adresse : " + this.Adresse + "\n Moyenne : " + this.Moyenne + "\n";
        return str;
    }
    
}

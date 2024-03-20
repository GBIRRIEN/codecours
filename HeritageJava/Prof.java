public class Prof extends Personne {
    private String Matiere;

    public Prof (String unNom, String unPrenom, String uneMatiere) {
        super(unNom, unPrenom);
        this.Matiere = uneMatiere;
    }
    
    public String getMatiere() {
        return this.Matiere;
    }

    public void setMatiere(String Matiere) {
        this.Matiere = Matiere;
    }
}

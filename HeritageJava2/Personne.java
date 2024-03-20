public class Personne {
    private String nom;
    private String prenom;

    public Personne(String unNom, String unPrenom) {
        this.nom = unNom;
        this.prenom = unPrenom;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return this.prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNomComplet() {
        String str ="Prenom : " +  this.prenom + "\n Nom : " + this.nom;
        return str;
    }
}

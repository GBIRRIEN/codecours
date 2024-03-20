public class Bateau
{
    private String idBat;
    private String nomBat;
    private Double longueurBat;
    private Double largeurBat;

    public Bateau (String unId, String unNom, Double uneLong, Double uneLarg) {
        this.idBat = unId;
        this.nomBat = unNom;
        this.longueurBat = uneLong;
        this.largeurBat = uneLarg;
    }
    public String getIdBat() {
        return this.idBat;
    }

    public void setIdBat(String idBat) {
        this.idBat = idBat;
    }

    public String getNomBat() {
        return this.nomBat;
    }

    public void setNomBat(String nomBat) {
        this.nomBat = nomBat;
    }

    public Double getLongueurBat() {
        return this.longueurBat;
    }

    public void setLongueurBat(Double longueurBat) {
        this.longueurBat = longueurBat;
    }

    public Double getLargeurBat() {
        return this.largeurBat;
    }

    public void setLargeurBat(Double largeurBat) {
        this.largeurBat = largeurBat;
    }

    public String versChaine() {
        String str = "Identifiant du bateau : " + this.idBat + "\n Nom du bateau : " + this.nomBat + "\n Longueur du bateau : " + this.longueurBat + "\n Largeur du bateau : " + this.largeurBat + "\n";
        return str;
    }    
}
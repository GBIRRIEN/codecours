package tripreport;

public class Aeroport {
    private String oaci;
    private String aita;
    private String nom;
    private String latitude;
    private String longitude;

    public Aeroport(String unOaci, String unAita, String unNom, String uneLatitude, String uneLongitude) {
        this.oaci = unOaci;
        this.aita = unAita;
        this.nom = unNom;
        this.latitude = uneLatitude;
        this.longitude = uneLongitude;
    }

    public String getOaci() {
        return this.oaci;
    }

    public void setOaci(String oaci) {
        this.oaci = oaci;
    }

    public String getAita() {
        return this.aita;
    }

    public void setAita(String aita) {
        this.aita = aita;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getLatitude() {
        return this.latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return this.longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }
    
}

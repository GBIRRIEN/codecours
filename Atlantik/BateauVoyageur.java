import java.util.ArrayList;

public class BateauVoyageur extends Bateau {
    private Double vitesseBatVoy;
    private String imageBatVoy;
    private ArrayList<Equipement> mesEquip;

    public BateauVoyageur (String unId, String unNom, Double uneLong, Double uneLarg, Double uneVitesse, String uneImage, ArrayList<Equipement> unEquip) {
        super(unId,unNom,uneLong,uneLarg);
        this.vitesseBatVoy = uneVitesse;
        this.imageBatVoy = uneImage; 
        this.mesEquip = unEquip;
    }

    public Double getVitesseBatVoy() {
        return this.vitesseBatVoy;
    }

    public void setVitesseBatVoy(Double vitesseBatVoy) {
        this.vitesseBatVoy = vitesseBatVoy;
    }

    public String getImageBatVoy() {
        return this.imageBatVoy;
    }

    public void setImageBatVoy(String imageBatVoy) {
        this.imageBatVoy = imageBatVoy;
    }

    public ArrayList<Equipement> getEquip() {
        return this.mesEquip;
    }

    public void setEquip(ArrayList<Equipement> mesEquip) {
        this.mesEquip = mesEquip;
    }

    public String versChaine() {
        String str = super.versChaine() + "Vitesse du bateau : " + this.vitesseBatVoy + "\n Image : " + this.imageBatVoy + "\n Equipement(s) : ";
        for (Equipement equipement : mesEquip) {
            str = str + equipement.afficheEquip() + "\n";
        }
        return str;
    }
}
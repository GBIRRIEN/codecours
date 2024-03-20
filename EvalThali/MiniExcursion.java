import java.util.ArrayList;

public class MiniExcursion {
    private int numMiniExcursion;
    private String libelleMiniExcursion;
    private int nombrePlaces;
    private ArrayList<Etape> mesEtapes;

    public MiniExcursion (int unNum, String unLibelle, int unNbPlaces, ArrayList<Etape> uneEtape) {
        this.numMiniExcursion = unNum;
        this.libelleMiniExcursion = unLibelle;
        this.nombrePlaces = unNbPlaces;
        this.mesEtapes = uneEtape;
    }

    public int getNum() {
        return this.numMiniExcursion;
    }

    public void setNum(int numMiniExcursion) {
        this.numMiniExcursion = numMiniExcursion;
    }

    public String getLibelle() {
        return this.libelleMiniExcursion;
    }

    public void setLibelle(String libelleMiniExcursion) {
        this.libelleMiniExcursion = libelleMiniExcursion;
    }

    public int getNbPlaces() {
        return this.nombrePlaces;
    }

    public void setNbPlaces(int nombrePlaces) {
        this.nombrePlaces = nombrePlaces;
    }

    public ArrayList<Etape> getEtape() {
        return this.mesEtapes;
    }

    public void setEtape(ArrayList<Etape> mesEtapes) {
        this.mesEtapes = mesEtapes;
    }
}
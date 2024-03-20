import java.util.ArrayList;

public class MiniExcursionpayante extends MiniExcursion {
    private int tarif;
    
    public MiniExcursionpayante(int unNum, String unLibelle, int unNbPlaces, ArrayList<Etape> uneEtape, int unTarif) {
        super(unNum, unLibelle, unNbPlaces, uneEtape);
        this.tarif = unTarif;
    }

    public int getTarif() {
        return this.tarif;
    }

    public void setTarif(int tarif) {
        this.tarif = tarif;
    }

}

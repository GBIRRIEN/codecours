import java.util.ArrayList;

public class MiniExcursion {
    private int num;
    private String nom;
    private int nbPlaces;
    private ArrayList<Etape> etapeList;

    public MiniExcursion(int num, String nom, int nbPlaces, ArrayList<Etape> etapeList) {
        this.num = num;
        this.nom = nom;
        this.nbPlaces = nbPlaces;
        this.etapeList = etapeList;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNbPlaces() {
        return nbPlaces;
    }

    public void setNbPlaces(int nbPlaces) {
        this.nbPlaces = nbPlaces;
    }

    public ArrayList<Etape> getEtapeList() {
        return etapeList;
    }

    public void setEtapeList(ArrayList<Etape> etapeList) {
        this.etapeList = etapeList;
    }

    public void ajouteEtape(Etape e) {
        this.etapeList.add(e);
    }

    public int donneDureePrevue() {
        int total = 0;
        for(Etape etape : etapeList) {
            total += etape.getDureePrevue();
        }
        return total;
    }

    public String donneDureePrevuehhmm() {
        int total = 0;
        for(Etape etape : etapeList) {
            total += etape.getDureePrevue();
        }

        int DureePrevueH = total/60;
        int DureePrevueM = total%60;
        String heureString = (DureePrevueH < 10) ? "0" + DureePrevueH : String.valueOf(DureePrevueH);
        String minuteString = (DureePrevueM < 10) ? "0" + DureePrevueM : String.valueOf(DureePrevueM);
        String DureePrevue2 = heureString + ":" + minuteString;
        return DureePrevue2;
    }
}

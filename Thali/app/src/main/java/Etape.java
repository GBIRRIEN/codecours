public class Etape {
    private int numEtape;
    private String description;
    private int dureePrevue;

    public Etape(int numEtap, String description, int dureePrevue) {
        this.numEtape = numEtap;
        this.description = description;
        this.dureePrevue = dureePrevue;
    }

    public int getNumEtape() {
        return numEtape;
    }

    public void setNumEtape(int numEtape) {
        this.numEtape = numEtape;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDureePrevue() {
        return dureePrevue;
    }

    public void setDureePrevue(int dureePrevue) {
        this.dureePrevue = dureePrevue;
    }

    public String donneDureePrevuehhmm() {
        int DureePrevue = this.getDureePrevue(); 
        int DureePrevueH = DureePrevue/60;
        int DureePrevueM = DureePrevue%60;
        String heureString = (DureePrevueH < 10) ? "0" + DureePrevueH : String.valueOf(DureePrevueH);
        String minuteString = (DureePrevueM < 10) ? "0" + DureePrevueM : String.valueOf(DureePrevueM);
        /*En condensé : 
         * String dureeHeures = (duree/60 < 10 ? "0" : "") + duree/60;
         * String dureeMinutes = (duree%60 < 10 ? "0" : "") + duree%60;
        */
    
        String DureePrevue2 = heureString + ":" + minuteString;
        return DureePrevue2;
    }
    
}

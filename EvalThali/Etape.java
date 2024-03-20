public class Etape {
    private int numEtape;
    private String description;
    private int dureePrevue;

    public Etape(int unNum, String uneDescription, int uneDuree) {
        this.numEtape = unNum;
        this.description = uneDescription;
        this.dureePrevue = uneDuree;
    }

    public int getNum() {
        return this.numEtape;
    }

    public void setNum(int numEtape) {
        this.numEtape = numEtape;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDuree() {
        return this.dureePrevue;
    }

    public void setDuree(int dureePrevue) {
        this.dureePrevue = dureePrevue;
    }
    
}

package tripreport;

public class Avion {
    private int id;
    private String modele;
    private int numeroSerie;
    private int codeInterne;

    public Avion (int unId, String unModele, int unNumero, int unCode) {
        this.id = unId;
        this.modele = unModele;
        this.numeroSerie = unNumero;
        this.codeInterne = unCode;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModele() {
        return this.modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public int getNumeroSerie() {
        return this.numeroSerie;
    }

    public void setNumeroSerie(int numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public int getCodeInterne() {
        return this.codeInterne;
    }

    public void setCodeInterne(int codeInterne) {
        this.codeInterne = codeInterne;
    }

}

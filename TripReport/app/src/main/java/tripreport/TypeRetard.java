package tripreport;

public class TypeRetard{
    private int id;
    private int codeSituation;
    private String libelle;

    public TypeRetard(int id, int codeSituation, String libelle) {
        this.id = id;
        this.codeSituation = codeSituation;
        this.libelle = libelle;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCodeSituation() {
        return this.codeSituation;
    }

    public void setCodeSituation(int codeSituation) {
        this.codeSituation = codeSituation;
    }

    public String getLibelle() {
        return this.libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
}
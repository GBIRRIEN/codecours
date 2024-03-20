package tripreport;

public class Retard {
    private int id;
    private String commentaire;
    private int duree;
    private TypeRetard type;
    private Boolean impliqueAeroport;
    private String codeSituation;

    public Retard(int id, String commentaire, int duree, TypeRetard type, Boolean impliqueAeroport, String codeSituation) {
        this.id = id;
        this.commentaire = commentaire;
        this.duree = duree;
        this.type = type;
        this.impliqueAeroport = impliqueAeroport;
        this.codeSituation = codeSituation;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCommentaire() {
        return this.commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    public int getDuree() {
        return this.duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    public TypeRetard getType() {
        return this.type;
    }

    public void setType(TypeRetard type) {
        this.type = type;
    }

    public Boolean isImpliqueAeroport() {
        return this.impliqueAeroport;
    }

    public Boolean getImpliqueAeroport() {
        return this.impliqueAeroport;
    }

    public void setImpliqueAeroport(Boolean impliqueAeroport) {
        this.impliqueAeroport = impliqueAeroport;
    }
    
    public String getCodeSituation() {
        return this.codeSituation;
    }

    public void setCodeSituation(String codeSituation) {
        this.codeSituation = codeSituation;
    }
}

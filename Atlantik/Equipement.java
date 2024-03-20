public class Equipement {
    private Integer idEquip;
    private String libEquip; 
    
    public Equipement (Integer unId, String unLib) {
        this.idEquip = unId;
        this.libEquip = unLib;
    }

    public Integer getId() {
        return this.idEquip;
    }

    public void setId(Integer idEquip) {
        this.idEquip = idEquip;
    }

    public String getLib() {
        return this.libEquip;
    }

    public void setLib(String libEquip) {
        this.libEquip = libEquip;
    }

    public String afficheEquip() {
        String str = "\n ID de l'équipement : " + this.idEquip + "\n Libellé : " + this.libEquip ;
        return str;
    }
    
}

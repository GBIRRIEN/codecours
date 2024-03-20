package tripreport;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Mouvement {
    private int id;
    private int codeVol;
    private int numeroVol;
    private LocalDateTime dateHeureDepart;
    private LocalDateTime dateHeureArrivee;
    private int dureeVol;
    private Avion unAvion;
    private Aeroport aeroportDepart;
    private Aeroport aeroportArrivee;
    private ArrayList<Retard> retards;

    public Mouvement(int id, int codeVol, int numeroVol, LocalDateTime dateHeureDepart, LocalDateTime dateHeureArrivee, int dureeVol, Avion unAvion, Aeroport aeroportDepart, Aeroport aeroportArrivee, ArrayList<Retard> mesRetards) {
        this.id = id;
        this.codeVol = codeVol;
        this.numeroVol = numeroVol;
        this.dateHeureDepart = dateHeureDepart;
        this.dateHeureArrivee = dateHeureArrivee;
        this.dureeVol = dureeVol;
        this.unAvion = unAvion;
        this.aeroportDepart = aeroportDepart;
        this.aeroportArrivee = aeroportArrivee;
        this.retards = mesRetards;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCodeVol() {
        return this.codeVol;
    }

    public void setCodeVol(int codeVol) {
        this.codeVol = codeVol;
    }

    public int getNumeroVol() {
        return this.numeroVol;
    }

    public void setNumeroVol(int numeroVol) {
        this.numeroVol = numeroVol;
    }

    public LocalDateTime getDateHeureDepart() {
        return this.dateHeureDepart;
    }

    public void setDateHeureDepart(LocalDateTime dateHeureDepart) {
        this.dateHeureDepart = dateHeureDepart;
    }

    public LocalDateTime getDateHeureArrivee() {
        return this.dateHeureArrivee;
    }

    public void setDateHeureArrivee(LocalDateTime dateHeureArrivee) {
        this.dateHeureArrivee = dateHeureArrivee;
    }

    public int getDureeVol() {
        return this.dureeVol;
    }

    public void setDureeVol(int dureeVol) {
        this.dureeVol = dureeVol;
    }

    public Aeroport getAeroportDepart() {
        return this.aeroportDepart;
    }

    public void setAeroportDepart(Aeroport aeroportDepart) {
        this.aeroportDepart = aeroportDepart;
    }

    public Aeroport getAeroportArrivee() {
        return this.aeroportArrivee;
    }

    public void setAeroportArrivee(Aeroport aeroportArrivee) {
        this.aeroportArrivee = aeroportArrivee;
    }

    public ArrayList<Retard> getRetards() {
        return this.retards;
    }

    public void setRetards(ArrayList<Retard> retards) {
        this.retards = retards;
    }

    public Avion getUnAvion() {
        return this.unAvion;
    }

    public void setUnAvion(Avion unAvion) {
        this.unAvion = unAvion;
    }

    public void ajouteRetard(Retard unRetard) {
        this.retards.add(unRetard);
    }

    public int retardTotal() {
        int total = 0;
        for(Retard unRetard : retards) {
            total += unRetard.getDuree();
        }
        return total;
    }

    public int dureeReelle() {
        int duree = 0;
        duree += this.getDureeVol()+retardTotal();
        return duree;
    }
}

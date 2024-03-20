package tripreport;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        LocalDateTime dt1 = LocalDateTime.of(2023, 3, 8, 8, 55, 0);
        LocalDateTime dt2 = LocalDateTime.of(2023, 11, 8, 15, 32, 0);

        TypeRetard t1 = new TypeRetard(1, 21, "Bouchons");
        TypeRetard t2 = new TypeRetard(2, 56, "Alerte à la bombe");
        TypeRetard t3 = new TypeRetard(3, 8, "Panne de réacteur");

        Retard r1 = new Retard(1,"oui",120,t1, true, "EV");
        Retard r2 = new Retard(2, "non", 180, t2, true, "AV");
        Retard r3 = new Retard(3, "Aller le Stade Brestois", 45, t3, true, "AV");

        Aeroport a1 = new Aeroport(null,null,"Brest", null,null);
        Aeroport a2 = new Aeroport(null,null,"Jakarta",null,null);

        Avion av1 = new Avion(4562, "Airbus 747", 10, 98123);

        ArrayList<Retard> lesRetards = new ArrayList<>();

        Mouvement m1 = new Mouvement(1,1,1,dt1,dt2,123,av1,a1,a2,lesRetards);

        m1.ajouteRetard(r1);
        m1.ajouteRetard(r2);
        m1.ajouteRetard(r3);

        System.out.println("    Mouvement : \nVol : " + m1.getNumeroVol());
        System.out.println("Avion : " + m1.getUnAvion().getId());
        System.out.println("Départ de " + m1.getAeroportDepart().getNom() + " le " + m1.getDateHeureDepart().format(DateTimeFormatter.ofPattern("yyyy-MM-dd")) + " à " + m1.getDateHeureDepart().format(DateTimeFormatter.ofPattern("HH-mm-ss")));
        System.out.println("Arrivée à " + m1.getAeroportArrivee().getNom() + " le " + m1.getDateHeureArrivee().format(DateTimeFormatter.ofPattern("yyyy-MM-dd")) + " à " + m1.getDateHeureArrivee().format(DateTimeFormatter.ofPattern("HH-mm-ss")));
        System.out.println("Retard total : " + m1.retardTotal() + "\n    Retards :");
        for(Retard unRetard : m1.getRetards()) {
            System.out.println("Durée : " + unRetard.getDuree() + "\nCommentaire : " + unRetard.getCommentaire() + "\nType de retard : " + unRetard.getType().getLibelle());
        }

    }
}
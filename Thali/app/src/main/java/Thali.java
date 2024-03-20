import java.util.ArrayList;

public class Thali {
    public static void main(String[] args) {

        MiniExcursion mx = new MiniExcursion(1, "Excursion à l'Ile de Batz", 10, new ArrayList<Etape>());

        mx.ajouteEtape(new Etape(1, "Traversée aller", 30));
        mx.ajouteEtape(new Etape(2, "Promenade dans l'île", 60));
        mx.ajouteEtape(new Etape(3, "Visite de la chapelle", 20));
        mx.ajouteEtape(new Etape(4, "Viste du phare", 30));
        mx.ajouteEtape(new Etape(5, "Promenade sur une petite crique", 15));
        mx.ajouteEtape(new Etape(6, "Visite du jardin exotique", 45));
        mx.ajouteEtape(new Etape(7, "Traversée retour", 30));

        System.out.println(mx.getNom() + " - durée de " + mx.donneDureePrevue() + " minutes soit " + mx.donneDureePrevuehhmm());
        System.out.println("Voici la liste des étapes :");
        for (Etape e: mx.getEtapeList()) {
            System.out.println(e.getNumEtape() + " - " + e.getDescription() + " " + e.getDureePrevue());
        }
    }
}

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

public class MiniExcursionTest {
    @Test
    void testAjouteEtape() {
        MiniExcursion mx = new MiniExcursion(1, "Excursion à l'Ile de Batz", 10, new ArrayList<Etape>());
        mx.ajouteEtape(new Etape(1, "Traversée aller", 30));
        mx.ajouteEtape(new Etape(2, "Promenade dans l'île", 60));
        
        assertEquals(2, mx.getEtapeList().size());   
    }

    @Test
    void testDonneDureePrevue() {
        MiniExcursion mx2 = new MiniExcursion(1, "Ile de Batz", 10, new ArrayList<Etape>());
        mx2.ajouteEtape(new Etape(1, "Traversée aller", 30));
        mx2.ajouteEtape(new Etape(2, "Promenade dans l'île", 60));

        assertEquals(90, mx2.donneDureePrevue());
    }

    @Test
    void testDonneDureePrevuehhmm() {
        MiniExcursion mx3 = new MiniExcursion(1, "Ile de Batz", 10, new ArrayList<Etape>());
        mx3.ajouteEtape(new Etape(1, "Traversée aller", 30));
        mx3.ajouteEtape(new Etape(2, "Promenade dans l'île", 60));

        assertEquals("01:30", mx3.donneDureePrevuehhmm());
    }
}

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EtapeTest {
    @Test
    void testDonneDureePrevuehhmminferieurA1Heure() {
        Etape myEtape = new Etape(1, "Traversée allée", 30);
        assertEquals("00:30", myEtape.donneDureePrevuehhmm());
    }

    @Test
    void testDonneDureePrevuehhmmsuperierA1Heure() {
        Etape myEtape2 = new Etape(1, "Traversée allée", 120);
        assertEquals("02:00", myEtape2.donneDureePrevuehhmm());
    }
}

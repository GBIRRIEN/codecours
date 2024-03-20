package tripreport;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MouvementTest {
    private Mouvement m1;
    private Retard r1;
    @BeforeEach
    void setup(){
        r1 = new Retard(1,"oui",120,null,true, "EV");
        ArrayList<Retard> lesRetards = new ArrayList<>();
        m1 = new Mouvement(1,1,1,null,null,123,null,null,null,lesRetards);
        m1.ajouteRetard(r1);
    }
    @Test
    void testAjouteRetard() {
        assertEquals(1, m1.getRetards().size());
    }

    void testRetardsTotal() {
        assertEquals(120, m1.retardTotal());
    }
}

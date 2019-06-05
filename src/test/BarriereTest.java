package test;

import org.junit.Test;
import quoridor.Barriere;
import quoridor.Coordonnee;

import static org.junit.Assert.*;


public class BarriereTest {

    @Test()
    public void testBarriere() {
        Barriere barriere = new Barriere("red", null);
        assertNull(barriere.getCoordonnee());
        assertNotNull(barriere.getCouleur());
        assertEquals("red", barriere.getCouleur());

        barriere.setCoordonnee(new Coordonnee(2,8, 3, 8));

        assertNotNull(barriere.getCoordonnee());

        assertEquals(2, barriere.getCoordonnee().getX1());
        assertEquals(8, barriere.getCoordonnee().getY1());
        assertEquals(3, barriere.getCoordonnee().getX2());
        assertEquals(8, barriere.getCoordonnee().getY2());
    }

}

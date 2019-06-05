package test;

import org.junit.Test;
import quoridor.*;

import static org.junit.Assert.*;


public class PionTest {

    @Test()
    public void testPion() {
        Pion pion = new Pion("red", new Coordonnee(2,1, -1, -1));

        assertNotNull(pion.getCoordonnee());
        assertNotNull(pion.getCouleur());

        assertEquals(2, pion.getCoordonnee().getX1());
        assertEquals(1, pion.getCoordonnee().getY1());

        pion.nextCoup();
        assertNotNull(pion.getDeplacementPossibles());

        pion.setCoordonnee(new Coordonnee(10,4, -1,-1));

        assertEquals(10, pion.getCoordonnee().getX1());
        assertEquals(4, pion.getCoordonnee().getY1());
    }

}

package test;

import org.junit.Test;
import quoridor.*;

import static org.junit.Assert.*;


public class PionTest {

    @Test()
    public void testPion() {
        Pion pion = new Pion("red", new Coordonnee(2,1, -1, -1));
        Joueur joueur1 = new Humain("Joueur1", 1,"red", null, pion, null);

        assertNotNull(pion.getCoordonnee());
        assertNotNull(pion.getCouleur());

        assertEquals(2, pion.getCoordonnee().getStartX());
        assertEquals(1, pion.getCoordonnee().getStartY());

    }

}

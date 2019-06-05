package test;

import org.junit.Test;
import quoridor.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;


public class JoueurTest {

    @Test()
    public void testJoueurHumain() {
        Pion pion = new Pion("red", new Coordonnee(2,1, -1, -1));
        Plateau plateau = new Plateau(10);

        Joueur joueur = new Humain("Joueur1", 1, "red", null, pion, plateau);

        assertEquals("Joueur1", joueur.getNom());
        assertEquals(pion.getCouleur(), joueur.getCouleur());
        assertEquals(1, joueur.getNumero());
        assertEquals("red", joueur.getCouleur());
        assertEquals(pion, joueur.getPion());
        assertNotNull(joueur.getBarrieres());
    }

    @Test()
    public void testJoueurIA() {
        Pion pion = new Pion("blue", new Coordonnee(2,1, -1, -1));
        Plateau plateau = new Plateau(10);

        IA joueur = new IA("IA1", 2, "blue", null, pion, plateau, Difficulte.IMPOSSIBLE);

        assertEquals("IA1", joueur.getNom());
        assertEquals(2, joueur.getNumero());
        assertEquals(pion.getCouleur(), joueur.getCouleur());
        assertEquals("blue", joueur.getCouleur());
        assertEquals(Difficulte.IMPOSSIBLE, joueur.getDifficulte());
        assertEquals(pion, joueur.getPion());
        assertNotNull(joueur.getBarrieres());
    }

}

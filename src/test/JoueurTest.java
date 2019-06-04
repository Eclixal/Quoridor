package test;

import org.junit.Test;
import quoridor.Coordonnee;
import quoridor.Humain;
import quoridor.Joueur;
import quoridor.Pion;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;


public class JoueurTest {

    @Test()
    public void testJoueur() {
        Pion pion = new Pion("red", new Coordonnee(2,1, -1, -1));

        Joueur joueur = new Humain("Joueur1", 1, "red", null, pion, null);

        assertEquals("Joueur1", joueur.getNom());
        assertEquals(1, joueur.getNumero());
        assertEquals("red", joueur.getCouleur());
    }

}

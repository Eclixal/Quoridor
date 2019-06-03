package test;

import org.junit.Test;
import quoridor.Plateau;

import static org.junit.Assert.assertEquals;

public class PlateauTest {

    @Test()
    public void testPlateau() {
        Plateau plateau = new Plateau(10);
        assertEquals(10, plateau.getTaille());
    }

}

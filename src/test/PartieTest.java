package test;

import org.junit.Test;
import quoridor.Mode;
import quoridor.Partie;
import static org.junit.Assert.*;


public class PartieTest {

    @Test()
    public void test() {
        Partie partie = new Partie("data/config.dat");
        assertEquals(Mode.HH, partie.getMode());

    }

}

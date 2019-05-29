package quoridor;

import java.util.ArrayList;
import java.util.Scanner;

public class Humain extends Joueur {

    private Scanner scanner;

    public Humain(String nom, int numero, String couleur, ArrayList<Barriere> barrieres, Pion pion, Plateau plateau) {
        super(nom, numero, couleur, barrieres, pion, plateau);
    }
}

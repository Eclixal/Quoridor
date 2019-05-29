package quoridor;

import java.util.ArrayList;

public class IA extends Joueur {

    private Difficulte difficulte;
    private int[][] plusCourtChemin;

    public IA(String nom, int numero, String couleur, ArrayList<Barriere> barrieres, Pion pion, Plateau plateau, Difficulte difficulte) {
        super(nom, numero, couleur, barrieres, pion, plateau);
        this.difficulte = difficulte;
    }

    public Difficulte getDifficulte() {
        return difficulte;
    }

    public void setDifficulte(Difficulte difficulte) {
        this.difficulte = difficulte;
    }

    public int[][] getPlusCourtChemin() {
        return plusCourtChemin;
    }

    public void setPlusCourtChemin(int[][] plusCourtChemin) {
        this.plusCourtChemin = plusCourtChemin;
    }

    public void plannification() {

    }
}

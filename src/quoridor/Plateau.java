package quoridor;

/**
  * Cette classe gère le plateau de jeu
  * @author AlexM02 , Drmarsupial35 , Eclixal , griffin568
  * @version 0.1.0
  */
public class Plateau {

    private final int TAILLE;
    private final int[][] DAMIER;

    /**
      * Créé un nouvel objet Plateau
      * @param taille la taille du plateau (longueur et largeur car le plateau est forcément un carré)
      */
    public Plateau(int taille) {
        this.TAILLE = taille;
        this.DAMIER = new int[taille][taille];
    }

    /**
      * Retourne la taille du plateau
      * @return la taille du plateau
      */
    public int getTaille() {
        return TAILLE;
    }
}

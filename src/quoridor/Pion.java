package quoridor;

/**
  * Cette classe gère les pions utilisés par les joueurs
  * @author AlexM02 , Drmarsupial35 , Eclixal , griffin568
  * @version 0.1.0
  */
public class Pion {

    private final String COULEUR;
    private int[][] deplacementPossibles;
    private int[] coordonnees;

    /**
      * Créé un nouvel objet Pion
      * @param couleur la couleur du joueur (désigne une forme en mode texte)
      * @param coordonnees les coordonnées de départ du pion
      */
    public Pion(String couleur, int[] coordonnees, Joueur joueur) {
        this.COULEUR = couleur;
        this.coordonnees = coordonnees;
    }

    /**
      * Retourne la couleur du pion
      * @return la couleur du pion
      */
    public String getCouleur() {
        return this.COULEUR;
    }


    /**
      * Retourne les coordonnées du pion
      * @return un tableau contenant les coordonnées du pion
      */
    public int[] getCoordonnees() {
        return this.coordonnees;
    }

    /**
      * Modifie les coordonnées du pion
      * @param coordonnees les nouvelles coordonnées du pion
      */
    public void setCoordonnees(int[] coordonnees) {
        this.coordonnees = coordonnees;
    }

    /**
      * Retourne les différents déplacements possibles du pion
      * @return les différents déplacements possibles du pion sous la forme d'un tableau à deux dimensions
      */
    public int[][] getDeplacementPossibles() {
        return this.deplacementPossibles;
    }

    /**
      * Identifie les nouveaux déplacements possibles du pion avant ou après un déplacement
      */
    public void nextCoup() {

    }
}

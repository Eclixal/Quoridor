package quoridor;

/**
  * Cette classe gère les pions utilisés par les joueurs
  * @author AlexM02 , Drmarsupial35 , Eclixal , griffin568
  * @version 0.1.0
  */
public class Pion {

    private final String COULEUR;
    private int[][] deplacementPossibles;
    private Coordonnee coordonnee;
    private Joueur joueur;

    /**
      * Créé un nouvel objet Pion
      * @param couleur la couleur du joueur (désigne une forme en mode texte)
      * @param coordonnee les coordonnées de départ du pion
      * @param joueur le joueur à qui appartient le pion
      */
    public Pion(String couleur, Coordonnee coordonnee, Joueur joueur) {
        this.COULEUR = couleur;
        this.coordonnee = coordonnee;
        this.joueur = joueur;
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
      * @return les coordonnées du pion sous la forme d'un objet Coordonnee
      */
    public Coordonnee getCoordonnee() {
        return this.coordonnee;
    }

    /**
      * Modifie les coordonnées du pion
      * @param coordonnees les nouvelles coordonnées du pion
      */
    public void setCoordonnee(Coordonnee coordonnees) {
        this.coordonnee = coordonnees;
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

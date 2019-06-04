package quoridor;

/**
  * Cette classe gère les barrières utilisées par les joueurs
  * @author AlexM02 , Drmarsupial35 , Eclixal , griffin568
  * @version 0.1.0
  */
public class Barriere {

    private final String COULEUR;
    private Coordonnee coordonnee;

    /**
      * Créé un nouvel objet Barriere
      * @param couleur la couleur du joueur
      * @param coordonnee les coordonnées de la barrière sur le plateau (null si non posée)
      */
    public Barriere(String couleur, Coordonnee coordonnee) {
        this.COULEUR = couleur;
        this.coordonnee = coordonnee;
    }

    /**
      * Retourne la couleur de la barrière
      * @return la couleur de la barrière
      */
    public String getCouleur() {
        return COULEUR;
    }


    /**
      * Retourne les coordonnées de la barrière
      * @return les coordonnées de la barrière sous la forme d'un objet Coordonnee
      */
    public Coordonnee getCoordonnee() {
        return coordonnee;
    }

    /**
      * Modifie les coordonnées de la barrière
      * @param coordonnee les nouvelles coordonnées de la barrière
      */
    public void setCoordonnee(Coordonnee coordonnee) {
        this.coordonnee = coordonnee;
    }
}

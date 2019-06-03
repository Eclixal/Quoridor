package quoridor;

/**
  *Cette classe gère les barrières utilisées par les joueurs
  *@author AlexM02 , Drmarsupial35 , Eclixal , griffin568
  *@version 0.1.0
  */
public class Barriere {

    private String couleur;
    private int[] coordonnees;

    /**
      *Créé un nouvel objet Barriere
      *@param couleur la couleur du joueur
      *@param coordonnees les coordonnées de la barrière sur le plateau (null si non posée)
      */
    public Barriere(String couleur, int[] coordonnees) {
        this.couleur = couleur;
        this.coordonnees = coordonnees;
    }

    /**
      *Retourne la couleur de la barrière
      *@return la couleur de la barrière
      */
    public String getCouleur() {
        return couleur;
    }

    /**
      *Modifie la couleur de la barrière
      *@param couleur la nouvelle couleur de la barrière
      */
    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    /**
      *Retourne les coordonnées de la barrière
      *@return les coordonnées de la barrière sous forme d'un tableau
      */
    public int[] getCoordonnees() {
        return coordonnees;
    }

    /**
      *Modifie les coordonnées de la barrière
      *@param coordonnees un tableau contenant les nouvelles coordonnées de la barrière
      */
    public void setCoordonnees(int[] coordonnees) {
        this.coordonnees = coordonnees;
    }
}

package quoridor;

/**
  *Cette classe gere les barrieres utilisees par les joueurs
  *@author AlexM02 , Drmarsupial35 , Eclixal , griffin568
  *@version 0.1.0
  */
public class Barriere {

    private String couleur;
    private int[] coordonnees;

    /**
      *Cree un nouvel objet Barriere
      *@param couleur la couleur du joueur
      *@param coordonnees les coordonnees de la barriere sur le plateau (null si non posee)
      */
    public Barriere(String couleur, int[] coordonnees) {
        this.couleur = couleur;
        this.coordonnees = coordonnees;
    }

    /**
      *Retourne la couleur de la barriere
      *@return la couleur
      */
    public String getCouleur() {
        return couleur;
    }

    /**
      *Change la couleur de la barriere
      *@param couleur la nouvelle couleur
      */
    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    /**
      *Retourne les coordonnees de la barriere
      *@return les coordonnees sous forme d'un tableau
      */
    public int[] getCoordonnees() {
        return coordonnees;
    }

    /**
      *Change les coordonnees de la barriere
      *@param coordonnees un tableau contenant les nouvelles coordonnees
      */
    public void setCoordonnees(int[] coordonnees) {
        this.coordonnees = coordonnees;
    }
}

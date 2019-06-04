package quoridor;

/**
  * Cette classe gère les coordonées utilisées par les barrières et les pions
  * @author AlexM02 , Drmarsupial35 , Eclixal , griffin568
  * @version 0.1.0
  */
public class Coordonnee {

    private int x1;
    private int y1;
    private int x2;
    private int y2;

    /**
      * Créé un nouvel objet Coordonnee
      * @param x1 La première coordonnée x de l'objet.
      * Pour un pion, il s'agit de sa coordonnée x et pour une barrière il s'agit de la coordonnée x de son point de départ
      * @param y1 La première coordonnée y de l'objet
      * Pour un pion, il s'agit de sa coordonnée y et pour une barrière il s'agit de la coordonée y de son point de départ
      * @param x2 La seconde coordonnée x de l'objet. S'il s'agit des coordonnées d'un pion alors x2 est initialisé à -1,
      * sinon il s'agit de la coordonée x du point d'arrivée d'une barrière
      * @param y2 La seconde coordonnée y de l'objet. S'il s'agit des coordonnées d'un pions alors y2 est initialisé à -1
      * sinon il s'agit de la coordonée y du point d'arrivée d'un barrière
      */
    public Coordonnee(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    /**
      *
      * @return
      */
    public int getX1() {
        return x1;
    }

    /**
      *
      * @return
      */
    public int getY1() {
        return y1;
    }

    /**
      *
      * @return
      */
    public int getX2() {
        return x2;
    }

    /**
      *
      * @return
      */
    public int getY2() {
        return y2;
    }
}

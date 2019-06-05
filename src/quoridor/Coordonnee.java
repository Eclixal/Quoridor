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
      * Créé un nouvel objet Coordonnee. Si les coordonée sont utilisées par un pion alors les valeurs de x2 et y2 seront initialisées à -1 et ne seront pas utilisées.
      * @param x1 La première coordonnée x de l'objet
      * Pour une barrière il s'agit de la coordonnée x de son point de départ
      * @param y1 La première coordonnée y de l'objet
      * Pour une barrière il s'agit de la coordonée y de son point de départ
      * @param x2 La seconde coordonnée x de l'objet
      * Pour une barrière il s'agit de la coordonée x de son point d'arrivée
      * @param y2 La seconde coordonnée y de l'objet. S'il s'agit des coordonnées d'un pions alors y2 est initialisé à -1
      * Pour une barrière il s'agit de la coordonée y de son point d'arrivée
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

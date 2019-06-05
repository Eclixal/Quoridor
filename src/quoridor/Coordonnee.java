package quoridor;

/**
  * Cette classe gère les coordonnées utilisées par les barrières et les pions
  * @author AlexM02 , Drmarsupial35 , Eclixal , griffin568
  * @version 0.1.0
  */
public class Coordonnee {

    private int x1;
    private int y1;
    private int x2;
    private int y2;

    /**
      * Créé un nouvel objet Coordonnee. Si les coordonnées sont utilisées par un pion alors les valeurs de x2 et y2 seront initialisées à -1 et ne seront pas utilisées.
      * @param x1 La première coordonnée x de l'objet
      * Pour une barrière il s'agit de la coordonnée x de son point de départ
      * @param y1 La première coordonnée y de l'objet
      * Pour une barrière il s'agit de la coordonnée y de son point de départ
      * @param x2 La seconde coordonnée x de l'objet
      * Pour une barrière il s'agit de la coordonnée x de son point d'arrivée
      * @param y2 La seconde coordonnée y de l'objet.
      * Pour une barrière il s'agit de la coordonnée y de son point d'arrivée
      */
    public Coordonnee(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    /**
      * Renvoie la coordonnée X1 de l'objet
      * @return la coordonnée X1
      */
    public int getX1() {
        return x1;
    }

    /**
      * Renvoie la coordonnée Y1 de l'objet
      * @return la coordonnée Y1
      */
    public int getY1() {
        return y1;
    }

    /**
      * Renvoie la coordonnée X2 de l'objet (ou -1 si celui-ci n'en possède pas)
      * @return la coordonnée X2 ou -1
      */
    public int getX2() {
        return x2;
    }

    /**
      * Renvoie la coordonnée Y2 de l'objet (ou -1 si celui-ci n'en possède pas)
      * @return la coordonnée Y2 ou -1
      */
    public int getY2() {
        return y2;
    }
}

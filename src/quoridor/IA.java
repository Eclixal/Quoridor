package quoridor;

import java.util.ArrayList;

/**
  * Cette classe gère les joueurs IA
  * @author AlexM02 , Drmarsupial35 , Eclixal , griffin568
  * @version 0.1.0
  */
public class IA extends Joueur {

    private final Difficulte DIFFICULTE;
    private int[][] plusCourtChemin;

    /**
      * Créé un nouvel objet IA
      * @param nom le nom du joueur
      * @param numero le numéro du joueur defini selon l'ordre de création (ex joueur 1 , joueur 2 ...)
      * @param couleur la couleur du joueur (indique la forme du pion en mode texte)
      * @param barrieres liste contenant les barrières restantes du joueur
      * @param pion le pion utilisé par le joueur
      * @param plateau le plateau de jeu
      * @param difficulte le niveau de difficulté de cette IA
      */
    public IA(String nom, int numero, String couleur, ArrayList<Barriere> barrieres, Pion pion, Plateau plateau, Difficulte difficulte) {
        super(nom, numero, couleur, barrieres, pion, plateau);
        this.DIFFICULTE = difficulte;
    }

    /**
      * Retourne la difficulté de l'IA
      * @return la difficulté de l'IA
      */
    public Difficulte getDifficulte() {
        return this.DIFFICULTE;
    }

    /**
      * Retourne le plus court chemin en déplacement de pion pour gagner que l'IA a prévu
      * @return un tableau a deux dimensions contenant le plus court chemin identifié par l'IA
      */
    public int[][] getPlusCourtChemin() {
        return plusCourtChemin;
    }

    /**
      * Modifie le plus court chemin en déplacement de pion que l'IA prévoie
      * @param plusCourtChemin un tableau a deux dimensions contenant le plus court chemin que l'IA doit identifier
      */
    public void setPlusCourtChemin(int[][] plusCourtChemin) {
        this.plusCourtChemin = plusCourtChemin;
    }

    /**
      * Identifie le plus court chemin pour chacun des joueurs et planifie les actions de l'IA en conséquences
      */
    public void plannification() {

    }
}

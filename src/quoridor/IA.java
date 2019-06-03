package quoridor;

import java.util.ArrayList;

/**
  *Cette classe gere les joueurs IA
  *@author AlexM02 , Drmarsupial35 , Eclixal , griffin568
  *@version 0.1.0
  */
public class IA extends Joueur {

    private Difficulte difficulte;
    private int[][] plusCourtChemin;

    /**
      *Cree un nouvel objet IA
      *@param nom le nom du joueur
      *@param numero le numero du joueur defini selon l'ordre de creation (ex joueur 1 , joueur 2 ...)
      *@param couleur la couleur du joueur (indique la forme du pion en mode texte)
      *@param barrieres liste contenant les barrieres restantes du joueur
      *@param pion le pion utilise par le joueur
      *@param plateau le plateau de jeu
      *@param difficulte le niveau de difficulte de cette IA
      */
    public IA(String nom, int numero, String couleur, ArrayList<Barriere> barrieres, Pion pion, Plateau plateau, Difficulte difficulte) {
        super(nom, numero, couleur, barrieres, pion, plateau);
        this.difficulte = difficulte;
    }

    /**
      *Retourne la difficulte de l'IA
      *@return la difficulte de l'IA
      */
    public Difficulte getDifficulte() {
        return difficulte;
    }

    /**
      *Modifie la difficulte de l'IA
      *@param difficulte la nouvelle difficulte
      */
    public void setDifficulte(Difficulte difficulte) {
        this.difficulte = difficulte;
    }

    /**
      *Retourne le plus court chemin en deplacement de pion pour gagner que l'IA a prevu
      *@return un tableau a deux dimensions contenant le plus court chemin identifie par l'IA
      */
    public int[][] getPlusCourtChemin() {
        return plusCourtChemin;
    }

    /**
      *Modifie le plus court chemin en deplacement de pion que l'IA prevoie
      *@param plusCourtChemin un tableau a deux dimensions contenant le plus court chemin que l'IA doit identifier
      */
    public void setPlusCourtChemin(int[][] plusCourtChemin) {
        this.plusCourtChemin = plusCourtChemin;
    }

    /**
      *Identifie le plus court chemin pour chacun des joueurs et planifie les actions de l'IA en conséquences
      */
    public void plannification() {

    }
}

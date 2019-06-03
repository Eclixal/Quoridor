package quoridor;

import java.util.ArrayList;
import java.util.Scanner;

/**
  *Cette classe gere les joueurs humains
  *@author AlexM02 , Drmarsupial35 , Eclixal , griffin568
  *@version 0.1.0
  */
public class Humain extends Joueur {

    private Scanner scanner;

    /**
      *Cree un nouvel objet Humain
      *@param nom le nom du joueur
      *@param numero le numero du joueur defini selon l'ordre de creation (ex joueur 1 , joueur 2 ...)
      *@param couleur la couleur du joueur (indique la forme du pion en mode texte)
      *@param barrieres liste contenant les barrieres restantes du joueur
      *@param pion le pion utilise par le joueur
      *@param plateau le plateau de jeu
      */
    public Humain(String nom, int numero, String couleur, ArrayList<Barriere> barrieres, Pion pion, Plateau plateau) {
        super(nom, numero, couleur, barrieres, pion, plateau);
    }
}

package quoridor;

import java.util.ArrayList;

/**
  *Classe abstraite gérant les joueurs
  *@author AlexM02 , Drmarsupial35 , Eclixal , griffin568
  *@version 0.1.0
  */
public abstract class Joueur {

    protected String nom;
    protected final int numero;
    protected final String couleur;
    protected ArrayList<Barriere> barrieres;
    protected Pion pion;
    protected Plateau plateau;

    /**
      *Créé un nouvel objet Humain
      *@param nom le nom du joueur
      *@param numero le numéro du joueur defini selon l'ordre de création (ex joueur 1 , joueur 2 ...)
      *@param couleur la couleur du joueur (indique la forme du pion en mode texte)
      *@param barrieres liste contenant les barrières restantes du joueur
      *@param pion le pion utilisé par le joueur
      *@param plateau le plateau de jeu
      */
    public Joueur(String nom, int numero, String couleur, ArrayList<Barriere> barrieres, Pion pion, Plateau plateau) {
        this.nom = nom;
        this.numero = numero;
        this.couleur = couleur;
        this.barrieres = barrieres;
        this.pion = pion;
        this.plateau = plateau;
    }

    /**
      *Retourne le nom du joueur
      *@return le nom du joueur
      */
    public String getNom() {
        return nom;
    }

    /**
      *Modifie le nom du joueur
      *@param nom le nouveau nom du joueur
      */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
      *Retourne le numéro du joueur
      *@return le numero du joueur
      */
    public int getNumero() {
        return numero;
    }

    /**
      *Retourne la couleur du joueur
      *@return la couleur du joueur
      */
    public String getCouleur() {
        return couleur;
    }

    /**
      *Retourne le pion utilisé par le joueur
      *@return le pion utilisé par le joueur
      */
    public Pion getPion() {
        return pion;
    }

    /**
      *Retourne la liste des barrières restantes du joueur
      *@return la liste des barrières restantes du joueur
      */
    public ArrayList<Barriere> getBarrieres() {
        return barrieres;
    }

    /**
      *Déplace le pion vers de nouvelles coordonnées
      *si celles-ci sont atteignables
      *@param coordonnees les coordonnées à atteindre
      */
    public void deplacerPion(int[] coordonnees) {

    }

    /**
      *Place une barrière aux coordonnées sélectionnées s'il en reste une au joueur
      *@param coordonnees les coordonnées où placer la barrière
      */
    public void placerBarriere(int[] coordonnees) {

    }

    /**
      *Permet au joueur de jouer
      */
    public void jeu() {

    }
}

package quoridor;

import java.util.ArrayList;

public abstract class Joueur {

    protected String nom;
    protected int numero;
    protected String couleur;
    protected ArrayList<Barriere> barrieres;
    protected Pion pion;
    protected Plateau plateau;

    public Joueur(String nom, int numero, String couleur, ArrayList<Barriere> barrieres, Pion pion, Plateau plateau) {
        this.nom = nom;
        this.numero = numero;
        this.couleur = couleur;
        this.barrieres = barrieres;
        this.pion = pion;
        this.plateau = plateau;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public Pion getPion() {
        return pion;
    }

    public ArrayList<Barriere> getBarrieres() {
        return barrieres;
    }

    public void deplacerPion(int[] coordonnees) {

    }

    public void placerBarriere(int[] coordonnees) {

    }

    public void jeu() {

    }
}

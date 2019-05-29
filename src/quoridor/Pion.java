package quoridor;

public class Pion {

    private String couleur;
    private int[][] deplacementPossibles;
    private int[] coordonnees;
    private Joueur joueur;

    public Pion(String couleur, int[] coordonnees, Joueur joueur) {
        this.couleur = couleur;
        this.coordonnees = coordonnees;
        this.joueur = joueur;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public int[] getCoordonnees() {
        return coordonnees;
    }

    public void setCoordonnees(int[] coordonnees) {
        this.coordonnees = coordonnees;
    }

    public int[][] getDeplacementPossibles() {
        return deplacementPossibles;
    }

    public void nextCoup() {

    }
}

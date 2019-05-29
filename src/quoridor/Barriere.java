package quoridor;

public class Barriere {

    private String couleur;
    private int[] coordonnees;

    public Barriere(String couleur, int[] coordonnees) {
        this.couleur = couleur;
        this.coordonnees = coordonnees;
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
}

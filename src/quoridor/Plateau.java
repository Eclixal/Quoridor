package quoridor;

public class Plateau {

    private final int TAILLE;
    private final int[][] DAMIER;

    public Plateau(int taille) {
        this.TAILLE = taille;
        this.DAMIER = new int[taille][taille];
    }

    public int getTaille() {
        return TAILLE;
    }
}

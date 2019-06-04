package quoridor;

public class Coordonnee {

    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public Coordonnee(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public int getStartX() {
        return x1;
    }

    public int getStartY() {
        return y1;
    }

    public int getEndX() {
        return x2;
    }

    public int getEndY() {
        return y2;
    }
}

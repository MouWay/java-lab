package Model;

public class ColoredCircle {
    private Point pos;
    private int r;
    private Color color;

    public ColoredCircle(Point pos, int r, Color color){
        this.pos = pos;
        this.r = r;
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public int getR() {
        return r;
    }

    public Point getPos() {
        return pos;
    }
}

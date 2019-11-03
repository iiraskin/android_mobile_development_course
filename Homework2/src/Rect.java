public class Rect {
    private Point topLeft;
    private Point bottomRight;

    public Rect(Point a, Point b) {
        if (a.getX() >= b.getX() || a.getY() <= b.getY()) {
            throw new IllegalArgumentException("Некорректные точки");
        }
        topLeft = a;
        bottomRight = b;
    }

    public Point getTopLeft() {
        return topLeft;
    }

    public Point getBottomRight() {
        return bottomRight;
    }
}

public class RectUtils {
    public static int square(Rect rect) {
        Point a = rect.getTopLeft();
        Point b = rect.getBottomRight();
        return (b.getX() - a.getX()) * (a.getY() - b.getY());
    }

    public static int perimeter(Rect rect) {
        Point a = rect.getTopLeft();
        Point b = rect.getBottomRight();
        return (b.getX() - a.getX() + a.getY() - b.getY()) * 2;
    }

    public static double diagonal(Rect rect) {
        Point a = rect.getTopLeft();
        Point b = rect.getBottomRight();
        return Math.sqrt(Math.pow(a.getX() - b.getX(), 2) + Math.pow(a.getY() - b.getY(), 2));
    }
}

public class Main {

    // Считает расстояние между двумя точками
    private double distance(Point a, Point b) {
        return Math.sqrt(Math.pow(a.getX() - b.getX(), 2) + Math.pow(a.getY() - b.getY(), 2));
    }

    public static void main(String[] args) {
        Point a = new Point(2, 36);
        Point b = new Point(9, 12);
        Main m = new Main();

        System.out.println(m.distance(a, b));
    }
}

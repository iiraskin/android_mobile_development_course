public class Point {
    private int x;
    private int y;

    public Point(int x_, int y_) {
        x = x_;
        y = y_;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    // Моя реализация
    /*
    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (other == null || other.getClass() != this.getClass()) {
            return false;
        }
        Point other_ = (Point) other;
        return other_.x == this.x && other_.y == this.y;
    }

    @Override
    public int hashCode() {
        return x + y * 101;
    }
    */

    // Автосгенерированные методы.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Point point = (Point) o;

        if (x != point.x) return false;
        return y == point.y;
    }

    @Override
    public int hashCode() {
        int result = x;
        result = 31 * result + y;
        return result;
    }
}

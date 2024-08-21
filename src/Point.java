import java.io.Serializable;

class Point implements Serializable {
    static final long serialVersionUID = 10L;
    public int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double getDistanceTo(Point other) {
        return Math.sqrt(Math.pow(this.x - other.x, 2) + Math.pow(this.y - other.y, 2));
    }

    @Override
    public String toString() {
        return String.format("(%d,%d)", x, y);
    }
}
package ShapesLab4;

import javafx.geometry.Point2D;

public class Diamond extends Shape implements Moveable, Comparable<Diamond>{

    private double l;
    private double w;

    public Diamond(Point2D start, double l, double w) {
        super(start);
        this.l = l;
        this.w = w;
    }

    public final double getLength() {
        return l;
    }

    public final double getWidth() {
        return w;
    }

    @Override
    public void move(double dx, double dy) {
        setStart(getStart().add(dx, dy));
    }

    @Override
    public void draw() {
        System.out.println("Drawing Diamond");
        System.out.println("Start " + this.getStart());
        System.out.println("Length = " + this.l);
        System.out.println("width = " + this.w);
    }

    @Override
    public int compareTo(Diamond o) {
        // Assume comparison is based on starting point.
        // Compare the x-coordinate first:
        if (this.getStart().getX() > o.getStart().getX()) {
            return 1;
        } else if (this.getStart().getX() < o.getStart().getX()) {
            return -1;
        } else {
            // If both have the same x, compare the y-coordinate:
            if (this.getStart().getY() > o.getStart().getY()) {
                return 1;
            } else if (this.getStart().getY() < o.getStart().getY()) {
                return -1;
            } else {
                return 0;
            }
        }
    }

}

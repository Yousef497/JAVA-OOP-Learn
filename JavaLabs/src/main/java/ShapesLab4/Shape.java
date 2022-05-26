package ShapesLab4;

import javafx.geometry.Point2D;

public abstract class Shape {

    private Point2D start;

    public Shape(Point2D start) {
        this.start = start;
    }

    public Point2D getStart() {
        return start;
    }

    public final void setStart(Point2D start) {
        this.start = start;
    }

    public abstract void draw();


}

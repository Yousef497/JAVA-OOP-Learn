package ShapesLab4;

import javafx.geometry.Point2D;

public class Line extends Shape{

    private Point2D end;

    public Line(Point2D start, Point2D end) {
        super(start);
        this.end = end;
    }

    public final Point2D getEnd() {
        return end;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Line");
        System.out.println("Start " + this.getStart());
        System.out.println("End " + this.getEnd());
    }

}

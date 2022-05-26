package ShapesLab4;

import javafx.geometry.Point2D;

public class Ellipse extends Shape {

    private double l, w;

    public Ellipse(Point2D start, double l, double w) {
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
    public final void draw() {
        System.out.println("Drawing Ellipse");
        System.out.println("Start " + this.getStart());
        System.out.println("Length = " + this.l);
        System.out.println("width = " + this.w);
    }

}

package ShapesLab4;

import javafx.geometry.Point2D;

import java.util.Arrays;

public class MoveableDriver {

    public static void main(String[] args) {
        // Test main Diamond Properties
        Diamond d1 = new Diamond(Point2D.ZERO, 10, 5);
        d1.draw();
        System.out.println("___________________");
        d1.move(1, 1);
        d1.draw();
        System.out.println("___________________");
        Diamond d2 = new Diamond(Point2D.ZERO, 1, 1);
        System.out.println("Compare Output: " + d1.compareTo(d2));
        System.out.println("___________________");

        // --------------------------------------------
        // Create array of Moveables
        Moveable[] mvs = new Moveable[3];
        // Create Diamond objects
        mvs[0] = new Diamond(new Point2D(3, 4), 6, 2);
        mvs[1] = new Diamond(new Point2D(1, 2), 12, 3);
        mvs[2] = new Diamond(new Point2D(3, 2), 1, 5);

        // Move each Diamond
        for (Moveable mv : mvs) {
            mv.move(1, 1);
        }

        // Draw all diamonds
        for (Moveable mv : mvs) {
            // Typecast to Shape or Diamond
            ((Shape) mv).draw();
            System.out.println("___________________");
        }

        // Depends on the implementation of CompareTo.
        System.out.println("______Sorting______");
        Arrays.sort(mvs);

        // Draw all diamonds
        for (Moveable mv : mvs) {
            // Typecast to Shape or Diamond
            ((Diamond) mv).draw();
            System.out.println("___________________");
        }

    }

}

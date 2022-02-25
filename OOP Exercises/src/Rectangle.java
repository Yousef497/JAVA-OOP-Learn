public class Rectangle {

    // Attributes
    private double length;
    private double width;

    // static attributes follow the class not the object
    private static int no_of_objects;

    // Constructor
    // Constructors have no return values (we don't specify any datatype), it is used to initialize the attributes or it may
    // be used to print a message to the user when creating an object from the class
    // It is not callable by the user
    // It is coded as methods but it must have the same name of the class
    public Rectangle(){
        length = 10;
        width = 15;
        no_of_objects ++;
    }

    public Rectangle(double l, double w){
        length = l;
        width = w;
        no_of_objects ++;
    }


    // -------------------------------------------------------------//
    // Methods
    // Setters
    public void setLength(double len){
        length = len;
    }

    public void setWidth(double w){
        width = w;
    }


    // Getters
    public double getlength(){
        return length;
    }

    public double getWidth(){
        return width;
    }

    public double getArea(){
        return (length * width);
    }

    // Static Method follows the class and can be called with class name
    public static int getNo_of_objects(){
        return no_of_objects;
    }

    // Compare between two objects
    // objects can be passed to methods, and methods can return objects
    public void modifyobject(Rectangle r){
        r.length = 67;
        r.width = 90;
    }

    // method to add length and width of two rectangles
    public Rectangle add(Rectangle room2){
        Rectangle result = new Rectangle();
        result.length = this.length + room2.length;
        result.width = this.width + room2.width;
        return result;
    }

    // method to compare 2 objects
    public boolean isequal(Rectangle r2){
        if ((this.length == r2.length) && (this.width == r2.width))
            return true;
        else
            return false;
    }

    // to copy one object attributes into new object you should make a constructor
    public Rectangle(Rectangle sourceobject){
        length = sourceobject.length;
        width = sourceobject.width;
    }

}

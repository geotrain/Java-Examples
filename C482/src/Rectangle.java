public class Rectangle {

    // set private variables length and width
    private double length;
    private double width;

    /**
     * The setLength method stores a value in the length field.
     * @param len The value to store in length
     */
    public void setLength(double len) {
        length = len;
    }

    /**
     * The setWidth method stores a value in the width field.
     * @param w The value to store in width.
     */
    public void setWidth(double w) {
        width = w;
    }

    /**
     * The getLength method returns a Rectangle object's length.
     * @return The valu ein the length field
     */
    public double getLength() {
        return length;
    }

    /**
     * The getWidth method returns a Rectangle object's width.
     * @return The value of the width field.
     */
    public double getWidth(){
        return width;
    }

    /**
     * The getArea method calculates the length times the width.
     * @return The Area of the rectangle.
     */
    public double getArea() {
        return length * width;
    }
}

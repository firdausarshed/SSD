/** Shape class - is an abstract class for other shapes to base on
 * marked as ABSTRACT as it is not directly instantiated
 *
 */
abstract class Shape {

    /**
     * no. of sides on the shape
     * PRIVATE so no other classes alter this
     */
    private int sides;

    /**
     * getter method to get the number of sides on the shape
     * @return the no. of sides
     */
    public int getSides() {
        return sides;
    }

    /**
     * setter sets the no. of sides in the shape
     * @param sides stores the no. of sides in the shape
     */
    public void setSides(int sides){
        this.sides = sides; //using this.sides to distinguish attribute vs parameter
    }

    /**
     * gets the shape area
     * @return the size of the shapes area
     */
    abstract public int getArea();


    /**
     * the constructor
     * @param sides this is the no. of sides in the shape
     */
    Shape(int sides) {
        this.sides = sides;
    }
}

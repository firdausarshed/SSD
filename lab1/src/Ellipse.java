public class Ellipse extends Rectangle {
    @Override
    public int getArea() {
        return (int) (Math.PI* (super.getArea() / 4));
    }

    @Override
    public String toString() {
        return "Ellipse based on a " + super.toString();
    }

    Ellipse() {
        this.setSides(1);
    }
}

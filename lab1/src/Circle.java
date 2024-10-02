public class Circle extends Shape {

    private int radius;
    private float pi = 3.14F;


    @Override
    public int getArea() {
        return (int) (Math.PI * radius *radius);
    }

    @Override
    public String toString() {
        return "Circle with a radius of "+ radius + "," + super.toString();
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    Circle() {
        super(1);
    }

}

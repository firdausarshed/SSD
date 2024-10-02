public class Driver {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle();
        rect1.setHeight(10);
        rect1.setWidth(5);
        System.out.println(rect1);

        Circle c1 = new Circle();
        c1.setRadius(5);
        System.out.println(c1);

        Ellipse e1 = new Ellipse();
        e1.setHeight(10);
        e1.setWidth(5);
        System.out.println(e1);
    }
}

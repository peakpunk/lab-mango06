public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
//        Circle c = new Circle();
//        c.draw();
//        Square s = new Square();
//        s.draw();
        ShapeFactory sf = new ShapeFactory();
        Shape s = (Shape) sf.getShape(0);
        s.draw();
    }
}
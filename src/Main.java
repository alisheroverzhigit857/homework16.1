public class Main {
    public static void main(String[] args) {
        Shapes triangle = new Triangle(3.5,2.5);
        System.out.println("Uch burchtuktun aianty: "+triangle.findArea());
        Shapes rectangle = new Rectangle(4.5,2.3);
        System.out.println("Tik burchtuktun aianty: "+rectangle.findArea());
        Shapes circle = new Circle( 3);
        System.out.println("Ailananyn aianty: "+circle.findArea());
        Shapes square = new Square(5);
        System.out.println("Kvadrattyn aianty: "+square.findArea());

    }

}
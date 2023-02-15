public class Circle extends Shapes{
    private double radius ;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double findArea() {
        return Math.PI* radius*radius;
    }
}

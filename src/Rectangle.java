public class Rectangle extends Shapes {
    private  double uzunu1 ;
    private double tuurasy1;

    public Rectangle(double uzunu1, double tuurasy1) {
        this.uzunu1 = uzunu1;
        this.tuurasy1 = tuurasy1;
    }

    @Override
    public double findArea() {
        return uzunu1 * tuurasy1;

    }
}

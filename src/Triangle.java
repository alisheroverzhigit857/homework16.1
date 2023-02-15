public class Triangle extends Shapes {
    private double uzunu;
    private double tuurasy;

    public Triangle(double uzunu, double tuurasy) {
        this.uzunu = uzunu;
        this.tuurasy = tuurasy;
    }

    @Override
    public double findArea() {
        return uzunu*tuurasy/2;
    }
}

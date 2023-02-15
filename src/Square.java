public class Square extends Shapes {
    private  double uzunu2 ;

    public Square(double uzunu2) {
        this.uzunu2 = uzunu2;
    }

    @Override
    public double findArea() {
        return uzunu2*uzunu2;
    }
}

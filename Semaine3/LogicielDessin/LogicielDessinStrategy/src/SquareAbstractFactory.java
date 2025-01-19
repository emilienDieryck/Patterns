public class SquareAbstractFactory implements Strategy {

    @Override
    public Shape createShape(double size, Point point) {
        return new Square(size, point);
    }
}

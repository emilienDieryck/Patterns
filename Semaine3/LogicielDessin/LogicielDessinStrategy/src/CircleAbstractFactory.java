public class CircleAbstractFactory implements Strategy {

    @Override
    public Shape createShape(double size, Point point) {
        return new Circle(size, point);
    }
}

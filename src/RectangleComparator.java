public class RectangleComparator implements java.util.Comparator<Rectangle>{
    @Override
    public int compare(Rectangle r1, Rectangle r2) {
        return Double.compare(r1.getArea(),r2.getArea());
    }
}

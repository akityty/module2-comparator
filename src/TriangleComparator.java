public class TriangleComparator implements java.util.Comparator<Triangle> {
    @Override
    public int compare(Triangle o1, Triangle o2) {
        return Double.compare(o1.getArea(),o2.getArea());
    }
}

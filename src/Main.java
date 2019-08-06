import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
       Triangle[] Triangles = new Triangle[5];
        Triangles[0]=new Triangle(1,1,1);
        Triangles[1]=new Triangle(2,3,2);
        Triangles[2]=new Triangle(1,3,3);
        Triangles[3]=new Triangle(5,6,9);
        Triangles[4]=new Triangle(2,2,2);

        TriangleComparator TriangleComparator = new TriangleComparator();
        Arrays.sort(Triangles, TriangleComparator);

        for(int i = 0; i< Triangles.length; i++){
            System.out.println(Triangles[i].getArea());
        }

    }
}

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
       Circle[] circles = new Circle[5];
        circles[0]=new Circle(5);
        circles[1]=new Circle(2);
        circles[2]=new Circle(14);
        circles[3]=new Circle(16);
        circles[4]=new Circle(6);
        CircleComparator circleComparator = new CircleComparator();
        Arrays.sort(circles, circleComparator);

        for(int i = 0; i< circles.length; i++){
            System.out.println(circles[i]);
        }

    }
}

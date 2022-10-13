import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
Point2D First2D=new Point2D(4.1f,124.61f);
        System.out.println(Arrays.toString(First2D.getXY()));
        System.out.println(First2D);
    Point3D First3D=new Point3D(213.5f,21421.512f,111.3f);
        System.out.println(Arrays.toString(First3D.getXYZ()));
        System.out.println(First3D);
    }

}
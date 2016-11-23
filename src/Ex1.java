/**
 * Created by User on 22.11.2016.
 */
public class Ex1 {
    public static void main(String[] args) {
        double a = 3.11, b = 5.132;
        System.out.println("Area of the right triangle = " + getAreaForRightTriangle(a, b));
    }

    private static double getAreaForRightTriangle(double triangleLeg1, double triangleLeg2){
        return triangleLeg1*triangleLeg2*0.5;
    };
}

/**
 * Created by User on 22.11.2016.
 */
public class Ex1 {
    public static void main(String[] args) {
        double a = 3.11, b = 5.132;
        area(a, b);
    }

    public static void area(double triangle_leg_1, double triangle_leg_2){
        System.out.println("Area of the right triangle = " + (triangle_leg_1*triangle_leg_2*0.5));
    };
}

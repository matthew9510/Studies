import java.lang.Math;
public class MultipleClasses {
    public static void main(String[] args){
        Sphere smallSphere = new Sphere(10.0);
        System.out.printf("The Area of a sphere with the radius %f is %.03f.", smallSphere.radius, smallSphere.Area); //%f is used for floating point value
    }
}

class Sphere{
    double radius;
    double Area;

    Sphere(double radius){
        this.radius = radius;
        this.Area = calculateArea(radius);
    }

    final double PI = Math.PI;
    private double calculateArea(double radius){
        return 4 * PI * Math.pow(radius, 2);
    }
}

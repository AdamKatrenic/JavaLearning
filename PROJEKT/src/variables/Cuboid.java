package variables;

public class Cuboid {
    //public class variables.Cuboid {
    //  public static void main(String[] args) {
    //    // Write a program that stores 3 sides of a cuboid as variables (doubles)
    //    // The program should write the surface area and volume of the cuboid.
    //    //
    //    // Set the 3 sides to 10.4, 13.5, 8.2 and your program should
    //    // produce the following output:
    //    //
    //    // Surface Area: 672.76
    //    // Volume: 1151.28
    //  }
    //}
    public static void main(String[] args) {
        double a = 10.4;
        double b = 13.5;
        double c = 8.2;

        double Bottom = a*b;
        double Top = Bottom;
        double Front = a*c;
        double Back = Front;
        double Right = b*c;
        double Left = Right;

        double SurfaceArea = Bottom + Top + Front + Back + Right + Left;

        double Volume = a*b*c;



        System.out.println("SurfaceArea :" + SurfaceArea);
        System.out.println("Volume :" + Volume);




    }
}

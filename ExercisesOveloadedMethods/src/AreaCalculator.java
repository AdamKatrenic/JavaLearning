public class AreaCalculator {
    public static void main(String[] args) {

        System.out.println("area of circle is : " + area(5));
        System.out.println("area of rectangle is : " + area(5.0,4.0));
    }

    public static double area(double radius){
        double area = radius * radius * Math.PI;
        if(radius<0){
            return -1.0;
        }return  area;
    }

    public static double area(double x, double y){
        double area = x * y;
          if (x < 0 && y < 0){
              return -1.0;
          }return area;
    }
}

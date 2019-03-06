public class Function {
    public  double volumeSphere(double radius){
        double volume = 22/7.0 *Math.pow(radius, 3) * 4/3.0;
        return volume;

    }
    public static double areaCircle(double radius){
        double area = 22/7.0 * radius * radius;
        System.out.println(area);
        return area ;
    }
    public static void main(String[] args) {
        Function F = new Function();
        System.out.println( F.volumeSphere(5));
        double v = F.volumeSphere(11);
        Function.areaCircle(7);

//        areaCircle(7);
//        areaCircle(9.1);
//        areaCircle(106.21);
//
//        double result = areaCircle(12.12);
//        System.out.println(Math.round(result));
//        System.out.println(result * 10);

    }
}

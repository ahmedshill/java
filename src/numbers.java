public class numbers {
    public static void main(String[] args) {
        double x = 121.21;
        System.out.println(Math.sqrt(x));
        double result=Math.round(x);
        System.out.println(Math.round(result));
        double r = Math.round(Math.sqrt(x));


        double z =Math.pow(x, 2);
        System.out.println(x+ "power is" +z);
        //round downwards
        System.out.println(Math.floor(x));
        //round upwards
        System.out.println(Math.ceil(x));


    }
}
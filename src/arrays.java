public class arrays {
    public static void main(String[] args) {
        int marks[]= {34,56,67,90,86,97,21,12};
        String names[]={"ahmed", "barre", "shill", "aden", "noorkey"};
        System.out.println(marks[0]);
        System.out.println(names[2]);
        try{
            System.out.println(names[10]);
        }
        catch (Exception e){
            System.out.println("Error while fetching name");
        }
        System.out.println(12345);
    }
}

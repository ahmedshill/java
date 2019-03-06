public class condition {
    public static void main(String[] args) {
        int age = 18;
        if (age<12)
        {
            System.out.println("kid");
        }
        else if (age>=12 && age<=19)
        {
            System.out.println("teenager");
        }
        else if (age>=20 && age<35)
        {
            System.out.println("adult");
        }
        else if (age>=36 && age<55)
        {
            System.out.println("middle age");
        }
        else
        {
            System.out.println("old");
        }
    }

}

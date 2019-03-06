import java.util.ArrayList;

public class JavaArrayList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList();
        names.add("John");
        names.add("Ali");
        names.add("Ahmed");
        names.add("Aden");
        names.add("Abdi");
        System.out.println(names.get(1));
        names.remove(2);
        System.out.println(names.size());
        names.clear();
        System.out.println(names.size());
        Function.areaCircle(21);


    }
}

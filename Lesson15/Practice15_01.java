import java.util.ArrayList;
import java.util.List;

public class Practice15_01 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("kubo");
        list.add("mitoma");
        list.add("kamada");
        list.add("kamada");
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
    }
}


public class Practice12_02 {
    public static void main(String[] args) {
        System.out.println(greet("朝"));
        System.out.println(greet("昼"));
        System.out.println(greet("夜"));
    }

    public static String greet(String time) {
        switch (time) {
            case "朝":
                return "Good morning!!";
            case "昼":
                return "Good afternoon!!";
            default:
                return "Good evening!!";
        }

    }
}

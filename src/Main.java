import my_api.StringUtils;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        StringUtils utils = new StringUtils();

        System.out.println(utils.getString(1,2));
    }
}
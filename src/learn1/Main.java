package learn1;

import learn1.my_api.StringUtils;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(StringUtils.UTIL_1.getString(1,2,3));
        System.out.println(StringUtils.UTIL_2.getString("a","b","c"));
        System.out.println(StringUtils.UTIL_3.getString(1,2,3));
    }
}
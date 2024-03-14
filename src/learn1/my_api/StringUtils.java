package learn1.my_api;

public enum StringUtils {
    UTIL_1("/"),
    UTIL_2("_"),
    UTIL_3("*");
    private String separator;
    StringUtils(String separator) {
        this.separator = separator;
    }

    public String getString(Object... ints){
        String result = "";
        for(var i : ints){
            result = result.concat(i.toString()+separator);
        }
        return result;
    }
}

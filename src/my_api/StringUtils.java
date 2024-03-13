package my_api;

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
        for(int i=0; i<ints.length ; i++){
            result = result.concat(separator + ints[i].toString());
        }
        return result;
    }
}

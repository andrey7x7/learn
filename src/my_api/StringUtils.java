package my_api;

public class StringUtils {
    public String getString(Object... ints){
        String result = "";
        for(int i=0; i<ints.length ; i++){
            result = result.concat(ints[i].toString());
        }
        return result;
    }
}

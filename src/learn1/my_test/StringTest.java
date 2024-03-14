package learn1.my_test;

import learn1.my_api.StringUtils;
import org.junit.Assert;
import org.junit.Test;

public class StringTest {
    @Test
    public void stringTest(){
        Assert.assertEquals(StringUtils.UTIL_1.getString(1,2,3), "1/2/3/");
        Assert.assertEquals(StringUtils.UTIL_2.getString(1,2,3), "1_2_3_");
        Assert.assertEquals(StringUtils.UTIL_3.getString("a","b","c"), "a*b*c*");
    }
}

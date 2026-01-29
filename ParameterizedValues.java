package demos;

import org.junit.Assert;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ParameterizedValues {

    @ParameterizedTest
    @ValueSource(ints = {1, 2, -1, 4})
    public void parameter(int number) {
        Assert.assertTrue(number > 0);

    }

    @ParameterizedTest
    @ValueSource(strings = {"sai", "narendra", "sai", "narendra"})
    public void reportTest(String str) {
        Assert.assertEquals("sai", str);
    }

    @ParameterizedTest
    @ValueSource(booleans = {true, false, true, false})
    public void booReport(boolean bl) {
        Assert.assertEquals(true, bl);
    }

}

package demos;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import junit.framework.Assert;

public class ParameterizeCsvSource {

    @ParameterizedTest
    @CsvSource({"101,sai,7095sai", "102,ram,7095ram"})
    public void testCsv(int num, String name, String number) {
        Assert.assertEquals(number, num + name);
    }

    @ParameterizedTest
    @CsvSource({"101,102,203", "102,103,205"})
    public void testCSv(int num, int num2, int res) {
        Assert.assertEquals(res, num + num2);
    }

}

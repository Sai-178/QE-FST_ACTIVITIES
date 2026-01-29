package demos;

import org.junit.Assert;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class ParameterizedCsvFileSource {

    @ParameterizedTest
    @CsvFileSource(resources = "/demos/data.csv")
    public void sourceTest(int a, int b, int c) {
        Assert.assertEquals(c, a + b);
    }

}

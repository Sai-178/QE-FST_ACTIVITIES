package demos;

import org.junit.Assert;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

public class NullandEmptySourceExamplesTest {

    @ParameterizedTest
    @NullSource
    @ValueSource(strings = {"", "  "})
    public void testRes(String s) {
        Assert.assertEquals("", s);
    }

    @ParameterizedTest
    @EmptySource
    @ValueSource(strings = {"  ", " ", ""})
    public void testss(String s) {
        Assert.assertEquals(" ", s);
    }

    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = {" ", "", "  "})
    public void tes(String s) {
        Assert.assertEquals(" ", "");
    }

}

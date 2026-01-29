package demos;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalTest {

    private Calculator c;

    @BeforeEach
    public void setup() {
        c = new Calculator();
    }

    @Test
    public void testAdd() {
        Assert.assertEquals(4, c.sum(2, 2));
    }
}

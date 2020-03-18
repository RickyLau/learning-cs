package club.elasticsearch.basis;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Test that the default values are as expected.
 *
 * @author <a href="mailto:RickyLau5016@gmail.com">Ricky Lau</a>
 * @version 0.0.1 2020-03-19 00:48:25
 */
public class ClassVariableDefaultValueTest {

    private ClassVariableDefaultValue defaultValue;

    @Before
    public void setUp() {
        defaultValue = new ClassVariableDefaultValue();
    }

    @After
    public void tearDown() {
        defaultValue = null;
    }

    @Test
    public void testDefaultValueAsExpect() {
        boolean booleanExpectValue = false;
        byte byteExpectValue = (byte) 0;
        char charExpectValue = '\u0000';
        short shortExpectValue = (short) 0;
        int intExpectValue = 0;
        long longExpectValue = 0L;
        float floatExpectValue = 0.0f;
        double doubleExpectValue = 0.0;
        Assert.assertEquals(booleanExpectValue, defaultValue.isBooleanDefaultValue());
        Assert.assertEquals(byteExpectValue, defaultValue.getByteDefaultValue());
        Assert.assertEquals(charExpectValue, defaultValue.getCharDefaultValue());
        Assert.assertEquals(shortExpectValue, defaultValue.getShortDefaultValue());
        Assert.assertEquals(intExpectValue, defaultValue.getIntDefaultValue());
        Assert.assertEquals(longExpectValue, defaultValue.getLongDefaultValue());
        double delta = 0.1;
        Assert.assertEquals(floatExpectValue, defaultValue.getFloatDefaultValue(), delta);
        Assert.assertEquals(doubleExpectValue, defaultValue.getDoubleDefaultValue(), delta);
    }
}

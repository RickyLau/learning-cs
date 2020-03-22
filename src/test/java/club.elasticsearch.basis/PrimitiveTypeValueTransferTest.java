package club.elasticsearch.basis;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test primitive type value transfer.
 *
 * @author <a href="mailto:RickyLau5016@gmail.com">Ricky Lau</a>
 * @version 0.0.1 2020-03-21 22:33:19
 */
public class PrimitiveTypeValueTransferTest {


    /**
     * Test
     */
    @Test
    public void testFloatValueTransferTest() {
        float aFloat = 1.0f;
        float bFloat = aFloat;
        Assert.assertEquals(bFloat,aFloat,0.1);
        bFloat = 2.0f;
        Assert.assertEquals(bFloat,aFloat,0.1);


    }

}

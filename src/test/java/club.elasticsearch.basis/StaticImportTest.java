package club.elasticsearch.basis;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static java.lang.System.out;

/**
 * Use briefly and normal manner to print string.
 * @author <a href="mailto:RickyLau5016@gmail.com">Ricky Lau</a>
 * @version 0.0.1 2020-03-21 01:16:58
 */
public class StaticImportTest {

    private String message;

    @Before
    public void setUp(){
        message = "Hello, thinking java.";
    }

    @After
    public void tearDown(){
        message = null;
    }

    /**
     * Use static import to reduce code.
     */
    @Test
    public void testPrintStringViaBrieflyManner(){
        out.println(message);
    }

    /**
     * Normal manner.
     */
    @Test
    public void testPrintStringViaNormalManner(){
        System.out.println(message);
    }
}

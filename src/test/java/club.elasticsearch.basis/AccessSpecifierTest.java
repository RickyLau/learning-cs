package club.elasticsearch.basis;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author <a href="mailto:RickyLau5016@gmail.com">Ricky Lau</a>
 * @version 0.0.1 2020-03-18 00:56:38
 */
public class AccessSpecifierTest {

    private Salary salary;

    @Before
    public void setUp(){
        double baseSalary = 10000.0;
        double meritSalary = 2000.0;
        salary = new Salary(baseSalary, meritSalary);
    }

    @After
    public void tearDown(){
        salary = null;
    }

    /**
     * Test access class variable via access specifier.
     */
    @Test
    public void testAccessClassVariable(){
        // access public specify.
        int workDays = 22;
        Assert.assertEquals(workDays, Salary.WORK_DAYS);

        // can't access class variables of private specifier.
        // salary.basesalary
    }

}

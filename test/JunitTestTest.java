import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ltp on 2016/3/17.
 */
public class JunitTestTest {
    private  JunitTest junT;
    @Before
    public void setUp() throws Exception {
             junT = new JunitTest();
    }
    @Test
    public void testPlus() throws Exception {
        assertEquals("This is not a trangle",junT.plus(22,3,4));
        assertEquals("This is an equilateral",junT.plus(3,3,3));
        assertEquals("This is an isosceles",junT.plus(3,3,4));
        assertEquals("This is a scalene",junT.plus(5,3,4));

    }
}
import org.junit.*;

import static org.junit.Assert.assertEquals;

public class TestJunit {
    @BeforeClass
    public static void setUpBeforeClass () throws Exception {
        System.out.println("Before class");
    }

    @Before
    public void setUp() throws Exception {
        System.out.println("Before");
    }

    @Test
    public void testLengthOfString () {
        System.out.println("Inside test case find length of string");
        assertEquals(3, DemoJunit.returnLengthOfString("jay"));
        assertEquals(6, DemoJunit.returnLengthOfString("jayvir"));
    }

    @Test
    public void testSquare () {
        System.out.println("Inside test case find square");
        assertEquals(4, DemoJunit.returnSquareOfNumber(2));
        assertEquals(1, DemoJunit.returnSquareOfNumber(1));
    }

    @After
    public void after () {
        System.out.println("after");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("after class");
    }
}

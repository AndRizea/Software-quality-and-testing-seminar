package csie.ase.ro.testing;

import csie.ase.ro.classes.MathLibrary;
import org.junit.*;

import static org.junit.Assert.assertEquals;

public class TestMathLibrary {

    @BeforeClass
    public static void setUpBeforeClass() throws Exception{
        // one time setup
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception{
        // one time tear down
    }

    @Before
    public void setUp() throws Exception{
        // runs before each test
    }

    @After
    public void tearDown() throws Exception{
        // runs after each test
    }

    @Test
    public void testMinimumValueRight(){
        // arrange
        int[] values = {10, 20, 30};
        int expectedValue = 10;

        // act
        int result = MathLibrary.minimumValue(values);

        // assert
        assertEquals("test Right conditions", expectedValue, result);
    }
}

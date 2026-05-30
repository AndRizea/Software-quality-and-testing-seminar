package csie.ase.ro.testing;

import csie.ase.ro.classes.MathLibrary;
import csie.ase.ro.exceptions.NoValuesException;
import csie.ase.ro.exceptions.NullValidationException;
import org.junit.*;

import java.util.Arrays;
import java.util.Random;

import static org.junit.Assert.*;

public class TestMathLibrary {

    // test fixture
    static int[] testData;
    static int[] performanceTestData;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception{
        // one time setup
        int noValues = (int) 1e7;
        performanceTestData = new int[noValues];
        Random random = new Random();
        for(int i = 0; i < noValues; i++){
            performanceTestData[i] = random.nextInt(1000);
        }
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception{
        // one time tear down
    }

    @Before
    public void setUp() throws Exception{
        // runs before each test
        testData = new int[] {10, 20, 30};
    }

    @After
    public void tearDown() throws Exception{
        // runs after each test
    }

    // Right - happy path
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

    // Cardinality zero + Error
    @Test
    public void testMinimumCardinalityZero(){
        int[] values = {};
        try{
            MathLibrary.minimumValue(values);
            fail("I did not get the NoValuesException");
        } catch (NoValuesException e){
            assertTrue(true);
        }
    }

    // Cardinality one
    @Test
    public void testMinimumCardinalityOne(){
        int[] values = {10};
        int expectedMin = values[0];
        int result = MathLibrary.minimumValue(values);
        assertEquals(expectedMin, result);
    }

    @Test(expected = NullValidationException.class)
    public void testMinimumValueErrorNull(){
        MathLibrary.minimumValue(null);
    }

    // Inverse relationship
    @Test
    public void testMinInverseRelationship(){
        int[] values = {5, 10, 1, 100};
        int min = MathLibrary.minimumValue(values);

        for(int value : values){
            if(value < min){
                fail("There is another min value");
            }
        }
        assertTrue(true);
    }

    // Cross checking
    @Test
    public void testMinCrossCheck(){
        int min = MathLibrary.minimumValue(testData);

        Arrays.sort(testData);
        int otherMin = testData[0];

        assertEquals(min, otherMin);
    }

    // Performance
    @Test
    public void testMinPerformance(){
        double startTime = System.currentTimeMillis();
        MathLibrary.minimumValue(performanceTestData);
        double endTime = System.currentTimeMillis();

        if(endTime - startTime < 100){
            fail("Too slow");
        }
        assertTrue(true);
    }

    @Test(timeout = 100)
    public void testMinPerformanceUpdated(){
        MathLibrary.minimumValue(performanceTestData);
    }

    // Range
    @Test
    public void testMinRange(){
        int[] values = {10, 6, Integer.MIN_VALUE};
        int min = MathLibrary.minimumValue(values);
        assertEquals(Integer.MIN_VALUE, min);
    }



}

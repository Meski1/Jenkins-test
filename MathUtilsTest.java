import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class MathUtilsTest {

    @BeforeAll
    static void setUpBeforeClass() throws Exception{
    }

    @AfterAll
    static void tearDownAfterClass() throws Exception{
    }

    @BeforeEach
    void setUp() throws Exception{
    }

    @AfterEach
    void teardown() throws Exception{
    }

    @Test
    public void testadd16(){
        MathUtils math = new MathUtils();
        assertEquals("Expected and actual coefficients DON'T match", 16, math.add(10,6));
    }

    @Test
    public void testadd24(){
        MathUtils math = new MathUtils();
        assertEquals("Expected and actual coefficients DON'T match", 24, math.add(10,14));
    }

    @Test
    public void testsubtract5(){
        MathUtils math = new MathUtils();
        assertEquals("Expected and actual coefficients DON'T match", 5, math.subtract(10,5));
    }

    @Test
    public void testsubtract0(){
        MathUtils math = new MathUtils();
        assertEquals("Expected and actual coefficients DON'T match", 0, math.subtract(5,5));
    }

    @Test
    public void testmultiply9(){
        MathUtils math = new MathUtils();
        assertEquals("Expected and actual coefficients DON'T match", 9, math.multiply(3,3));
    }

    @Test
    public void testmultiply100(){
        MathUtils math = new MathUtils();
        assertEquals("Expected and actual coefficients DON'T match", 100, math.multiply(10,10));
    }

    @Test
    public void testdivide10(){
        MathUtils math = new MathUtils();
        assertEquals("Expected and actual coefficients DON'T match", 10.0, math.divide(100,10), 0.01);
    }

    @Test
    public void testdivide0(){
        MathUtils math = new MathUtils();
        assertEquals("Expected and actual coefficients DON'T match", -1.0, math.divide(9,0), 0.01);
    }

}

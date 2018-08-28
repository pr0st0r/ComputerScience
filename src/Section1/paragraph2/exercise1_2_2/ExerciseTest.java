package Section1.paragraph2.exercise1_2_2;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ExerciseTest extends TestCase {

    @Before
    public void setUp() throws Exception {
        System.out.println("До теста");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("После теста");
    }

    @Test
    public void testGetResult() {
        assertEquals(1.0, Exercise.getResult("90"));
    }
}
package Section1.paragraph2.exercise1_2_3;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.*;

public class ExerciseTest extends TestCase{

    @Test
    public void testGetResult() {
        assertTrue(Exercise.getResult(true, true));
        assertTrue(Exercise.getResult(false, true));
        assertTrue(Exercise.getResult(false, false));
    }
}
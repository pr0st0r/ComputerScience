package Section1.paragraph2.exercise1_2_14;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.*;

public class ExerciseTest extends TestCase {

    @Test
    public void testGetresult() {
        assertTrue(Exercise.getresult("4","2"));
    }
}
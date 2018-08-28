package Section1.paragraph2.exercise1_2_15;

import org.junit.Test;

import static org.junit.Assert.*;

public class ExerciseTest {

    @Test
    public void testGetResult() {
        assertEquals(false,Exercise.getResult("4","6","10"));
    }
}
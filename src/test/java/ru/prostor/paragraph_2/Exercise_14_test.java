package ru.prostor.paragraph_2;


import org.junit.Test;
import ru.prostor.sections.section_1.paragraph_2.Exercise_14;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Exercise_14_test {
    @Test
    public void testResult() {
        assertTrue(Exercise_14.getResult("4","2"));
        assertTrue(Exercise_14.getResult("2","4"));
        assertFalse(Exercise_14.getResult("3","4"));
    }
}

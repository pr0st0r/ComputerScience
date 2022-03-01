package ru.prostor.paragraph_2;

import org.junit.Test;
import ru.prostor.sections.section_1.paragraph_2.Exercise_15;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class Exercise_15_test {
    @Test
    public void testResult() {
        assertFalse(Exercise_15.getResult("4", "6", "10"));
    }
}

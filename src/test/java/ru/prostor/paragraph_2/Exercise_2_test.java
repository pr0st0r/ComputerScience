package ru.prostor.paragraph_2;


import org.junit.Test;
import ru.prostor.sections.section_1.paragraph_2.Exercise_2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class Exercise_2_test{
    @Test
    public void tesResult() {
        assertEquals(1.0, Exercise_2.getResult("90"));
        assertEquals(1.0, Exercise_2.getResult("80"));
        assertNotEquals(2.0, Exercise_2.getResult("80"));
    }
}

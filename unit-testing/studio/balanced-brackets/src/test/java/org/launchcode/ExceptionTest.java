package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ExceptionTest {
    @Test
    public void testException(){
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            StringUtilsClass.throwsExcept(null);
        });
        assertEquals("Cannot be null", exception.getMessage());
    }

    @Test
            public void testAlpha(){
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
            StringUtilsClass.checkAlpha("Hello1"));
            assertEquals("Cannot be null", exception.getMessage());

    }





}

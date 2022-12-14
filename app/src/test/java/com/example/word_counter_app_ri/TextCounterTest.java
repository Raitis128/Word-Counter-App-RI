package com.example.word_counter_app_ri;

import static org.junit.Assert.assertEquals;
import com.example.word_counter_app_ri.utils.TextCounter;
import org.junit.Test;

public class TextCounterTest {

    @Test
    public void Given_String_Example(){
        final String givenString = "Lets create unit test!";

        final String expectedResult = "22";
        final String actualResult = String.valueOf(TextCounter.getCharsCount(givenString));

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void Given_Empty_Space_String(){
        final String givenString = " ";

        final String expectedResult = "1";
        final String actualResult = String.valueOf(TextCounter.getCharsCount(givenString));

        assertEquals(expectedResult, actualResult);
    }
}
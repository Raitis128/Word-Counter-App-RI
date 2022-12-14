package com.example.word_counter_app_ri;

import com.example.word_counter_app_ri.utils.WordsCounter;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class WordCounterTest {

    @Test
    public void Given_String_Example(){
        final String givenString = "Word counter app";

        final String expectedResult = "3";
        final String actualResult = String.valueOf(WordsCounter.getWordsCount(givenString));

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void Given_Numbers_Only(){
        final String givenString = "2342342342";

        final String expectedResult = "0";
        final String actualResult = String.valueOf(WordsCounter.getWordsCount(givenString));

        assertEquals(expectedResult, actualResult);
    }
}
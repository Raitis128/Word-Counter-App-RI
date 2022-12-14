package com.example.word_counter_app_ri.utils;

public class WordsCounter {
    public static int getWordsCount(String word) {
        String words = word.trim();
        if (words.isEmpty())
            return 0;
        return words.split("\\w+").length;
    }
}

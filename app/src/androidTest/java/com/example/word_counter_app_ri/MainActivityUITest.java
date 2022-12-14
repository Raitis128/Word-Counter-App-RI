package com.example.word_counter_app_ri;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.MediumTest;
import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.replaceText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

@MediumTest
@RunWith(AndroidJUnit4.class)
public class MainActivityUITest {

    @Rule
    public ActivityTestRule<MainActivity> activityScenarioRule
            = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testWhenTextStringIsEntered() {
        final String givenString = "Word Counter App";
        final String expectedResult = "16";

        onView(withId(R.id.edPhraseInput)).perform(click(), replaceText(givenString));
        onView(withId(R.id.btnCount)).perform(click());
        onView(withId(R.id.tvResult)).check(matches(withText(expectedResult)));
    }

    @Test
    public void testWhenTextStringHasDifferentSymbols() {
        final String givenString = "@#$@#%$%^$%^&$%^THIS@ISSTILLSTRING";
        final String expectedResult = "34";

        onView(withId(R.id.edPhraseInput)).perform(click(), replaceText(givenString));
        onView(withId(R.id.btnCount)).perform(click());
        onView(withId(R.id.tvResult)).check(matches(withText(expectedResult)));
    }
}

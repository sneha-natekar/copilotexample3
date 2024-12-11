package com.example;

import android.content.Context;
import androidx.test.core.app.ActivityScenario;
import androidx.test.espresso.Espresso;
import androidx.test.espresso.assertion.ViewAssertions;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.rule.ActivityTestRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> activityRule =
            new ActivityTestRule<>(MainActivity.class);

    @Test
    public void useAppContext() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
        assertEquals("com.example.androidtemplate", appContext.getPackageName());
    }

    @Test
    public void testTextViewDisplayed() {
        // Launch the MainActivity
        ActivityScenario<MainActivity> scenario = ActivityScenario.launch(MainActivity.class);
        // Check if the TextView with id 'textView' is displayed
        Espresso.onView(ViewMatchers.withId(R.id.textView))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }

    @Test
    public void testTextViewText() {
        // Launch the MainActivity
        ActivityScenario<MainActivity> scenario = ActivityScenario.launch(MainActivity.class);
        // Check if the TextView with id 'textView' has the text "Hello, World!"
        Espresso.onView(ViewMatchers.withId(R.id.textView))
                .check(ViewAssertions.matches(ViewMatchers.withText("Hello, World!")));
    }
}

package com.epicodus.stumptown;

import android.os.Build;
import android.widget.TextView;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;

import static junit.framework.Assert.assertTrue;

@Config(constants = BuildConfig.class, sdk = Build.VERSION_CODES.LOLLIPOP)
@RunWith(RobolectricGradleTestRunner.class)


public class MainActivityTest {
        private MainActivity activity;

        @Before
        public void setup() {
        activity = Robolectric.setupActivity(MainActivity.class);
        }

        @Test
        public void validateTextViewContent() {
        TextView stumpTownTextView = (TextView) activity.findViewById(R.id.stumpTownTextView);
        assertTrue("Stumptown".equals(stumpTownTextView.getText().toString()));
        }
    }
}

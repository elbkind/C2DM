package de.sinnerschrader.c2dm.demo.test;

import android.test.ActivityInstrumentationTestCase2;
import de.sinnerschrader.c2dm.demo.*;

public class HelloAndroidActivityTest extends ActivityInstrumentationTestCase2<HelloAndroidActivity> {

    public HelloAndroidActivityTest() {
        super("de.sinnerschrader.c2dm.demo", HelloAndroidActivity.class);
    }

    public void testActivity() {
        HelloAndroidActivity activity = getActivity();
        assertNotNull(activity);
    }
}


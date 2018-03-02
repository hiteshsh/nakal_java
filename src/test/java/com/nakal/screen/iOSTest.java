package com.nakal.screen;

import com.nakal.ScreenExecutor.NakalExecutor;
import org.im4java.core.IM4JavaException;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import java.io.IOException;

/**
 * Created by saikrisv on 22/02/16.
 */
public class iOSTest {

    NakalExecutor nakalExecutor = new NakalExecutor();

    @Test
    public void captureScreenShotFromDevice()
        throws InterruptedException, IOException, IM4JavaException {
        nakalExecutor.nakalExecutorNativeCompare("Login");
    }

    @Test
    public void compareImagesWithPixelDifference()
            throws InterruptedException, IOException, IM4JavaException {
        Assert.assertTrue(nakalExecutor.nakalExecutorNativeCompare("ActivityScreen",3));
    }
}







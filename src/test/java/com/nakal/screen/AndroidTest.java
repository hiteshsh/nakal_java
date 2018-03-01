package com.nakal.screen;

import com.nakal.ScreenExecutor.NakalExecutor;
import com.nakal.imageutil.ImageUtil;
import org.im4java.core.IM4JavaException;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import java.io.IOException;

/**
 * Created by saikrisv on 22/02/16.
 */
public class AndroidTest {

    ImageUtil imageUtil = new ImageUtil();
    NakalExecutor nakalExecutor = new NakalExecutor();

    @Ignore
    public void compareImagesExecutor() throws InterruptedException, IOException, IM4JavaException {
        Assert.assertTrue(nakalExecutor.nakalExecutorNativeCompare("Login",5));
    }

    @Ignore
    public void compareImagesWithPixelDifference()
        throws InterruptedException, IOException, IM4JavaException {
        Assert.assertTrue(nakalExecutor.nakalExecutorNativeCompare("ActivityScreen",3));
    }

}

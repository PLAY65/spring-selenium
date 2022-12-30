package com.kardash.spring.springselenium.googletest;

import com.google.common.util.concurrent.Uninterruptibles;
import com.kardash.spring.springselenium.SpringBaseTestNGTest;
import com.kardash.spring.springselenium.page.google.GooglePage;
import com.kardash.spring.springselenium.util.ScreenShotUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

@SpringBootTest
public class Google2Test extends SpringBaseTestNGTest {

    @Autowired
    private GooglePage googlePage;

    @Autowired
    private ScreenShotUtil screenShotUtil;

    @Test
    public void GoogleTest() throws IOException {
        this.googlePage.goTo();
        Assert.assertTrue(this.googlePage.isAt());

        Uninterruptibles.sleepUninterruptibly(3, TimeUnit.SECONDS);

        this.googlePage.getSearchComponent().search("selenium");
        Assert.assertTrue(this.googlePage.getSearchResult().isAt());
        Assert.assertTrue(this.googlePage.getSearchResult().getCount() > 2);
        screenShotUtil.takeScreenShot();

    }
}

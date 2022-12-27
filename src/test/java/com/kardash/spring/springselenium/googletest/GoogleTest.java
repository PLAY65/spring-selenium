package com.kardash.spring.springselenium.googletest;

import com.kardash.spring.springselenium.SpringBaseTestNGTest;
import com.kardash.spring.springselenium.page.google.GooglePage;
import com.kardash.spring.springselenium.util.ScreenShotUtil;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.Assert;

import java.io.IOException;

public class GoogleTest extends SpringBaseTestNGTest {

    @Autowired
    private GooglePage googlePage;

    @Autowired
    private ScreenShotUtil screenShotUtil;

    @Test
    public void GoogleTest() throws IOException {
        this.googlePage.goTo();
        Assert.assertTrue(this.googlePage.isAt());

        this.googlePage.getSearchComponent().search("spring boot");
        Assert.assertTrue(this.googlePage.getSearchResult().isAt());
        Assert.assertTrue(this.googlePage.getSearchResult().getCount() > 2);
        //screenShotUtil.takeScreenShot();

    }
}

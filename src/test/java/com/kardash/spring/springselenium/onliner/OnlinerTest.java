package com.kardash.spring.springselenium.onliner;

import com.kardash.spring.springselenium.SpringBaseTestNGTest;
import com.kardash.spring.springselenium.page.onliner.OnlinerPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.Assert;
import org.testng.annotations.Test;


public class OnlinerTest extends SpringBaseTestNGTest {

    @Autowired
    private OnlinerPage onlinerPage;

    @Test
    public void OnlinerPageRegistration(){
        this.onlinerPage.goTo();
        Assert.assertTrue(this.onlinerPage.isAt());

        this.onlinerPage.getRegistrationComponent().registration();
    }
}

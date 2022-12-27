package com.kardash.spring.springselenium.page.onliner;

import com.kardash.spring.springselenium.page.Base;
import com.kardash.spring.springselenium.page.google.SearchResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class OnlinerPage extends Base {

    @Autowired
    private RegistrationComponent registrationComponent;

    @Value("${application.url}")
    private String url;

    public void goTo(){
        this.driver.get(url);
    }

    public RegistrationComponent getRegistrationComponent() {
        return registrationComponent;
    }

    @Override
    public boolean isAt() {
        return this.registrationComponent.isAt();
    }

    public void close(){
        this.driver.quit();
    }
}
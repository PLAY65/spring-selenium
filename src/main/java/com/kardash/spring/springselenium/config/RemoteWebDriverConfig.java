package com.kardash.spring.springselenium.config;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.*;

import java.net.URL;
import java.time.Duration;

@Lazy
@Configuration
@Profile("remote")
public class RemoteWebDriverConfig {

    @Value("${selenium.grid.url}")
    private URL url;

    @Bean
    @Scope("browserscope")
    @ConditionalOnProperty(name="browser",havingValue = "firefox")
    public WebDriver remoteFirefoxDriver(){
        return new RemoteWebDriver(this.url, new FirefoxOptions());
    }

    @Bean
    @Scope("browserscope")
    @ConditionalOnMissingBean
    public WebDriver remoteChromeDriver(){
        return new RemoteWebDriver(this.url, new ChromeOptions());
    }
}

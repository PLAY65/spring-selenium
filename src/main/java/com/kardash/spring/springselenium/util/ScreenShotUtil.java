package com.kardash.spring.springselenium.util;

import jakarta.annotation.PostConstruct;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import org.springframework.util.FileCopyUtils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;

@Lazy
@Component
public class ScreenShotUtil {

    @Autowired
    private TakesScreenshot driver;

    @Value("${screenshot.path}")
    private Path path;

//    @PostConstruct
//    private void init(){
//        for (int i = 0; i < 10; i++) {
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//            System.out.println("Sleeping.....");
//        }
//    }

    public void takeScreenShot() throws IOException {
        File sourceFile = this.driver.getScreenshotAs(OutputType.FILE);
        FileCopyUtils.copy(sourceFile, this.path.toFile());
        //FileCopyUtils.copy(sourceFile, this.path.resolve(imgName).toFile());
    }

}

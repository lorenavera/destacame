package com.co.destacame.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Properties;

public class Driver {
    private static WebDriver driver;

    public Driver() {
        Properties prop = new Properties();
        try {
            prop.load(new FileInputStream("src/test/resources/config.properties"));
            String downloadPath = prop.getProperty("fileDownloadLocal");
            ValidationFilInTheProject(downloadPath);
            System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\drivers\\chromedriver.exe");
            HashMap<String, Object> preferences = new HashMap<String,Object>();
            preferences.put("profile.default_content_settings.popups", 0);
            preferences.put("download.prompt_for_download",downloadPath);
            preferences.put("download.default_directory", downloadPath);
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--start-maximized","--disable-infobars",
                    "-enable-print-preview", "--kiosk-printing", "--incognito"
            );
            options.setExperimentalOption("prefs", preferences);
            driver = new ChromeDriver(options);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static void ValidationFilInTheProject(String downloadPath) {
        try {
            Path path = Paths.get(downloadPath);
            System.out.println("fileName1 "+downloadPath);
            if (!Files.exists(path)) {

                Files.createDirectory(path);
                System.out.println("DEBUG EXCEL: Directory created");
            } else {
                System.out.println("DEBUG EXCEL: Directory already exists");
            }
        } catch (Exception e) {
            // TODO: handle exception
        }

    }

    public static Driver web() {
        return new Driver();
    }

    public static WebDriver inThePage(String url) {
        driver.get(url);
        return driver;
    }

    public static WebDriver inTheStage() {
        return driver;
    }
}

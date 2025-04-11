package Listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import Utilities.DriverManager;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestListener implements ITestListener {

    @Override
    public void onTestFailure(ITestResult result) {
        // Get driver from a utility class
        WebDriver driver = DriverManager.getDriver(); // Assuming this gives you the current driver

        if (driver != null) {
            TakesScreenshot ts = (TakesScreenshot) driver;

            File src = ts.getScreenshotAs(OutputType.FILE);
            String methodName = result.getName();

            String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
            String screenshotName = methodName + "_" + timestamp + ".png";
            File dest = new File("screenshots/" + screenshotName);

            try {
                Files.createDirectories(dest.getParentFile().toPath());
                Files.copy(src.toPath(), dest.toPath());
                System.out.println("📸 Screenshot saved: " + dest.getAbsolutePath());
            } catch (IOException e) {
                System.err.println("Error saving screenshot: " + e.getMessage());
            }
        }
    }
}
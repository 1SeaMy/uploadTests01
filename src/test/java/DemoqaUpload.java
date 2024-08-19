//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import java.io.File;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.remote.DesiredCapabilities;
//import org.testng.Assert;
//import org.testng.annotations.Test;
//
//public class DemoqaUpload {
//    @Test
//    public static void main(String[] args) {
//        WebDriverManager.chromedriver().setup();
//        ChromeOptions options =new ChromeOptions();
//        options.addArguments("--remote-allow-origins=*");
//        DesiredCapabilities cp=new DesiredCapabilities();
//        cp.setCapability(ChromeOptions.CAPABILITY, options);
//        options.merge(cp);
//
//        WebDriver driver=new ChromeDriver(options);
//        driver.manage().window().maximize();
//        driver.get("https://demoqa.com/upload-download");
//        File uploadFile = new File("src/test/1.jpg");
//
//        WebElement upLoadButton =driver.findElement(By.id("uploadFile"));
//        upLoadButton.sendKeys(uploadFile.getAbsolutePath());
//
//        WebElement uploadMes=driver.findElement(By.id("uploadedFilePath"));
//        Assert.assertTrue(uploadMes.isDisplayed());
//        Assert.assertEquals(uploadMes.getText(),"C:\\fakepath\\1.jpgx");
//        System.out.println(uploadMes.getText());
//    }
//}
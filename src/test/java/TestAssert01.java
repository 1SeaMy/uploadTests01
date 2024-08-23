//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.junit.Assert;
//import org.junit.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.remote.DesiredCapabilities;
//import java.time.Duration;
//public class TestAssert01 {
//
//    @Test
//    public void test01() {
//        WebDriverManager.chromedriver().setup();
//        ChromeOptions options =new ChromeOptions();
//        options.addArguments("--remote-allow-origins=*");
//        DesiredCapabilities cp=new DesiredCapabilities();
//        cp.setCapability(ChromeOptions.CAPABILITY, options);
//        options.merge(cp);
//        WebDriver driver=new ChromeDriver(options);
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//        //2. Navigate to url 'http://automationexercise.com'
//        driver.get("http://automationexercise.com");
//        //3. Verify that home page is visible successfully
//        WebElement logoElementi= driver.findElement(By.xpath("//img[@src='/static/images/home/logo.png']"));
//        Assert.assertTrue(logoElementi.isDisplayed());
//        //4. Click on 'Signup / Login' button
//        WebElement signUpLinki= driver.findElement(By.xpath("//a[text()=' Signup / Login'] "));
//        signUpLinki.click();
//        //5. Verify 'Login to your account' is visible
//        WebElement loginYaziElementi= driver.findElement(By.xpath("//h2[text()='Login to your account']"));
//        Assert.assertTrue(loginYaziElementi.isDisplayed());
//        //6. Enter correct email address and password
//        WebElement emailAdresKutusu= driver.findElement(By.xpath("//input[@data-qa='login-email']"));
//        emailAdresKutusu.sendKeys("da@da.com");
//        WebElement passwordKutusu= driver.findElement(By.xpath("//input[@data-qa='login-password']"));
//        passwordKutusu.sendKeys("123456");
//        //7. Click 'login' button
//        driver.findElement(By.xpath("//button[@data-qa='login-button']")).click();
//        //8. Verify that 'Logged in as username' is visible
//        WebElement loggedInYazisi= driver.findElement(By.xpath("//a[text()=' Logged in as '] "));
//        Assert.assertTrue(loggedInYazisi.isDisplayed());
//        //9. Click 'Logout' button
//        driver.findElement(By.xpath("//a[text()=' Logout'] ")).click();
//        //10. Verify that user is navigated to login page
//        String expectedUrl="https://automationexercise.com/login111";
//        String actualUrl= driver.getCurrentUrl();
//        Assert.assertEquals(expectedUrl,actualUrl);
//        //11. Close driver
//        driver.close();
//    }
//}
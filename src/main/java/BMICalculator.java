import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static com.codeborne.selenide.Configuration.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;


public class BMICalculator {

    @Test
    public static void minWeightWithLowObeseBoundary1(){
        open("https://healthunify.com/bmicalculator/");
        getWebDriver().manage().timeouts().pageLoadTimeout(280, TimeUnit.SECONDS);
        $(By.name("wg")).sendKeys("11");
        $(By.name("ht")).sendKeys("33");
        $(By.name("cc")).click();
        String result = $(By.name("desc")).getAttribute("value");

        Assert.assertEquals(result, "Your category is Obese");
    }

    @Test
    public static void minWeightWithHighObeseBoundary(){
        open("https://healthunify.com/bmicalculator/");
        getWebDriver().manage().timeouts().pageLoadTimeout(280, TimeUnit.SECONDS);
        $(By.name("wg")).sendKeys("11");
        $(By.name("ht")).sendKeys("60");
        $(By.name("cc")).click();
        String result = $(By.name("desc")).getAttribute("value");

        Assert.assertEquals(result, "Your category is Obese");
    }

    @Test
    public static void minWeightWithLowOverweightBoundary(){
        open("https://healthunify.com/bmicalculator/");
        getWebDriver().manage().timeouts().pageLoadTimeout(280, TimeUnit.SECONDS);
        $(By.name("wg")).sendKeys("11");
        $(By.name("ht")).sendKeys("61");
        $(By.name("cc")).click();
        String result = $(By.name("desc")).getAttribute("value");

        Assert.assertEquals(result, "Your category is Overweight");
    }

    @Test
    public static void minWeightWithHighOverweightBoundary(){
        open("https://healthunify.com/bmicalculator/");
        getWebDriver().manage().timeouts().pageLoadTimeout(280, TimeUnit.SECONDS);
        $(By.name("wg")).sendKeys("11");
        $(By.name("ht")).sendKeys("66");
        $(By.name("cc")).click();
        String result = $(By.name("desc")).getAttribute("value");

        Assert.assertEquals(result, "Your category is Overweight");
    }

    @Test
    public static void minWeightWithLowNormalBoundary(){
        open("https://healthunify.com/bmicalculator/");
        getWebDriver().manage().timeouts().pageLoadTimeout(280, TimeUnit.SECONDS);
        $(By.name("wg")).sendKeys("11");
        $(By.name("ht")).sendKeys("67");
        $(By.name("cc")).click();
        String result = $(By.name("desc")).getAttribute("value");

        Assert.assertEquals(result, "Your category is Normal");
    }

    @Test
    public static void minWeightWithHighNormalBoundary(){
        open("https://healthunify.com/bmicalculator/");
        getWebDriver().manage().timeouts().pageLoadTimeout(280, TimeUnit.SECONDS);
        $(By.name("wg")).sendKeys("11");
        $(By.name("ht")).sendKeys("77");
        $(By.name("cc")).click();
        String result = $(By.name("desc")).getAttribute("value");

        Assert.assertEquals(result, "Your category is Normal");
    }

    @Test
    public static void minWeightWithLowUnderweightBoundary(){
        open("https://healthunify.com/bmicalculator/");
        getWebDriver().manage().timeouts().pageLoadTimeout(280, TimeUnit.SECONDS);
        $(By.name("wg")).sendKeys("11");
        $(By.name("ht")).sendKeys("78");
        $(By.name("cc")).click();
        String result = $(By.name("desc")).getAttribute("value");

        Assert.assertEquals(result, "Your category is Underweight");
    }

    @Test
    public static void minWeightWithHighUnderweightBoundary(){
        open("https://healthunify.com/bmicalculator/");
        getWebDriver().manage().timeouts().pageLoadTimeout(280, TimeUnit.SECONDS);
        $(By.name("wg")).sendKeys("11");
        $(By.name("ht")).sendKeys("85");
        $(By.name("cc")).click();
        String result = $(By.name("desc")).getAttribute("value");

        Assert.assertEquals(result, "Your category is Underweight");
    }

    @Test
    public static void minWeightWithLowStarvationtBoundary(){
        open("https://healthunify.com/bmicalculator/");
        getWebDriver().manage().timeouts().pageLoadTimeout(280, TimeUnit.SECONDS);
        $(By.name("wg")).sendKeys("11");
        $(By.name("ht")).sendKeys("86");
        $(By.name("cc")).click();
        String result = $(By.name("desc")).getAttribute("value");

        Assert.assertEquals(result, "Your category is Starvation");
    }

    @Test
    public static void switchingToPounds(){
        open("https://healthunify.com/bmicalculator/");
        getWebDriver().manage().timeouts().pageLoadTimeout(280, TimeUnit.SECONDS);
        $(By.name("wg")).sendKeys("11");
        $(By.name("opt1")).selectOptionByValue("pounds");
        String result = $(By.name("wg")).getAttribute("value");

        Assert.assertEquals(result, "24.2");
    }

    @Test
    public static void minWeightWithLowObeseBoundaryInPounds(){
        open("https://healthunify.com/bmicalculator/");
        getWebDriver().manage().timeouts().pageLoadTimeout(280, TimeUnit.SECONDS);
        $(By.name("wg")).sendKeys("11");
        $(By.name("opt1")).selectOptionByValue("pounds");
        $(By.name("ht")).sendKeys("33");
        $(By.name("cc")).click();
        String result = $(By.name("desc")).getAttribute("value");

        Assert.assertEquals(result, "Your category is Obese");
    }

    @Test
    public static void minWeightWithHighObeseBoundaryInPounds(){
        open("https://healthunify.com/bmicalculator/");
        getWebDriver().manage().timeouts().pageLoadTimeout(280, TimeUnit.SECONDS);
        $(By.name("wg")).sendKeys("11");
        $(By.name("opt1")).selectOptionByValue("pounds");
        $(By.name("ht")).sendKeys("60");
        $(By.name("cc")).click();
        String result = $(By.name("desc")).getAttribute("value");

        Assert.assertEquals(result, "Your category is Obese");
    }

    @Test
    public static void minWeightWithLowOverweightBoundaryInPounds(){
        open("https://healthunify.com/bmicalculator/");
        getWebDriver().manage().timeouts().pageLoadTimeout(280, TimeUnit.SECONDS);
        $(By.name("wg")).sendKeys("11");
        $(By.name("opt1")).selectOptionByValue("pounds");
        $(By.name("ht")).sendKeys("61");
        $(By.name("cc")).click();
        String result = $(By.name("desc")).getAttribute("value");

        Assert.assertEquals(result, "Your category is Overweight");
    }

    @Test
    public static void minWeightWithHighOverweightBoundaryInPounds(){
        open("https://healthunify.com/bmicalculator/");
        getWebDriver().manage().timeouts().pageLoadTimeout(280, TimeUnit.SECONDS);
        $(By.name("wg")).sendKeys("11");
        $(By.name("opt1")).selectOptionByValue("pounds");
        $(By.name("ht")).sendKeys("66");
        $(By.name("cc")).click();
        String result = $(By.name("desc")).getAttribute("value");

        Assert.assertEquals(result, "Your category is Overweight");
    }

    @Test
    public static void minWeightWithLowNormalBoundaryInPounds(){
        open("https://healthunify.com/bmicalculator/");
        getWebDriver().manage().timeouts().pageLoadTimeout(280, TimeUnit.SECONDS);
        $(By.name("wg")).sendKeys("11");
        $(By.name("opt1")).selectOptionByValue("pounds");
        $(By.name("ht")).sendKeys("67");
        $(By.name("cc")).click();
        String result = $(By.name("desc")).getAttribute("value");

        Assert.assertEquals(result, "Your category is Normal");
    }

    @Test
    public static void minWeightWithHighNormalBoundaryInPounds(){
        open("https://healthunify.com/bmicalculator/");
        getWebDriver().manage().timeouts().pageLoadTimeout(280, TimeUnit.SECONDS);
        $(By.name("wg")).sendKeys("11");
        $(By.name("opt1")).selectOptionByValue("pounds");
        $(By.name("ht")).sendKeys("77");
        $(By.name("cc")).click();
        String result = $(By.name("desc")).getAttribute("value");

        Assert.assertEquals(result, "Your category is Normal");
    }

    @Test
    public static void minWeightWithLowUnderweightBoundaryInPounds(){
        open("https://healthunify.com/bmicalculator/");
        getWebDriver().manage().timeouts().pageLoadTimeout(280, TimeUnit.SECONDS);
        $(By.name("wg")).sendKeys("11");
        $(By.name("opt1")).selectOptionByValue("pounds");
        $(By.name("ht")).sendKeys("78");
        $(By.name("cc")).click();
        String result = $(By.name("desc")).getAttribute("value");

        Assert.assertEquals(result, "Your category is Underweight");
    }

    @Test
    public static void minWeightWithHighUnderweightBoundaryInPounds(){
        open("https://healthunify.com/bmicalculator/");
        getWebDriver().manage().timeouts().pageLoadTimeout(280, TimeUnit.SECONDS);
        $(By.name("wg")).sendKeys("11");
        $(By.name("opt1")).selectOptionByValue("pounds");
        $(By.name("ht")).sendKeys("85");
        $(By.name("cc")).click();
        String result = $(By.name("desc")).getAttribute("value");

        Assert.assertEquals(result, "Your category is Underweight");
    }

    @Test
    public static void minWeightWithLowStarvationtBoundaryInPounds(){
        open("https://healthunify.com/bmicalculator/");
        getWebDriver().manage().timeouts().pageLoadTimeout(280, TimeUnit.SECONDS);
        $(By.name("wg")).sendKeys("11");
        $(By.name("opt1")).selectOptionByValue("pounds");
        $(By.name("ht")).sendKeys("86");
        $(By.name("cc")).click();
        String result = $(By.name("desc")).getAttribute("value");

        Assert.assertEquals(result, "Your category is Starvation");
    }

    @Test
    public static void convertingInchesToCmsLowBoundary(){
        open("https://healthunify.com/bmicalculator/");
        getWebDriver().manage().timeouts().pageLoadTimeout(280, TimeUnit.SECONDS);
        $(By.name("opt2")).selectOptionByValue("1");
        $(By.name("opt3")).selectOptionByValue("1");
        String result = $(By.name("ht")).getAttribute("value");

        Assert.assertEquals(result, "33");
    }

    @Test
    public static void convertingInchesToCmsHighBoundary(){
        open("https://healthunify.com/bmicalculator/");
        getWebDriver().manage().timeouts().pageLoadTimeout(280, TimeUnit.SECONDS);
        $(By.name("opt2")).selectOptionByValue("7");
        $(By.name("opt3")).selectOptionByValue("11");
        String result = $(By.name("ht")).getAttribute("value");

        Assert.assertEquals(result, "241");
    }

    @Test
    public static void calculationResults(){
        open("https://healthunify.com/bmicalculator/");
        getWebDriver().manage().timeouts().pageLoadTimeout(280, TimeUnit.SECONDS);
        $(By.name("wg")).sendKeys("11");
        $(By.name("opt1")).selectOptionByValue("kilograms");
        $(By.name("ht")).sendKeys("33");
        $(By.name("cc")).click();
        String result1 = $(By.name("si")).getAttribute("value");
        String result2 = $(By.name("us")).getAttribute("value");
        String result3 = $(By.name("uk")).getAttribute("value");

        Assert.assertEquals(result1, "101.01");
        Assert.assertEquals(result2, "102.71");
        Assert.assertEquals(result3, "641.41");

    }
}
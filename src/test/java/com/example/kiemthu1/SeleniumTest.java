package com.example.kiemthu1;

import lombok.SneakyThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    ChromeDriver driver = new ChromeDriver();
    @BeforeEach
    void setUp() {
        driver = new ChromeDriver();

    }
    @Test
    public void dangKyTest() {
        driver.get("https://vitimex.com.vn/dang-ky.html");
        WebElement inputName = driver.findElement(By.xpath("//input[@id='name']"));
        inputName.sendKeys("Tong Thi Hong Lan");

        WebElement inputSDT = driver.findElement(By.xpath("//input[@id='phone']"));
        inputSDT.sendKeys("0974873851");

        WebElement inputEmail = driver.findElement(By.xpath("//input[@id='email']"));
        inputEmail.sendKeys("lan@gmail.com");

        WebElement inputPass = driver.findElement(By.xpath("//input[@id='pass-regis']"));
        inputPass.sendKeys("123456");

        WebElement inputXacNhanPass = driver.findElement(By.xpath("//input[@id='pass-confirm']"));
        inputXacNhanPass.sendKeys("123456");

        WebElement button = driver.findElement(By.xpath("//a[@id='register-btn']"));
        button.click();


    }
    @SneakyThrows
    @Test
    public void dangNhaptest() {
        driver.get("https://vitimex.com.vn/");
        WebElement inputName = driver.findElement(By.xpath("//div[@class='li_log']//a[@data-bs-toggle='modal']//*[name()='svg']"));
        inputName.click();
        Thread.sleep(2000);

        WebElement inputSDT = driver.findElement(By.xpath("//input[@id='account']"));
        inputSDT.sendKeys("0974873851");

        WebElement inputEmail = driver.findElement(By.xpath("//input[@id='pass']"));
        inputEmail.sendKeys("123456");

        WebElement button = driver.findElement(By.xpath("//a[@id='signin-btn']"));
        button.click();



    }
    @SneakyThrows
    @Test
    public void themVaoGioTest() {
        driver.get("https://vitimex.com.vn/");
        WebElement inputSDT = driver.findElement(By.xpath("//div[@id='slide-hbc-28']//div[6]//a[1]//div[1]//img[2]"));
        inputSDT.click();

        WebElement inputSize = driver.findElement(By.xpath("//a[@id='size1']"));
        Thread.sleep(3000);
        inputSize.click();

        WebElement them = driver.findElement(By.xpath("//a[@id='addCart_page0']"));
        Thread.sleep(2000);
        them.click();
    }

}

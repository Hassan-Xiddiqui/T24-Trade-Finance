package POM;

import Test.General.BaseClass;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

public class PageObject extends BaseClass {

    public static WebDriver driver;
    public static Actions action;
    public static String parentWindow;

    public PageObject(WebDriver driver) {
        this.driver = driver;

    }

    //This method is to perform actions on Form Input Fields
    public static void textinput_Locator(String Id , String value) {

        driver.findElement(By.xpath("//tr/td/input[@id='"+Id+"']")).clear();
        driver.findElement(By.xpath("//tr/td/input[@id='"+Id+"']")).sendKeys(value);

    }

    //This method is to perform click on Form Input Fields
    public static void click_Locator (String Id) {

        driver.findElement(By.xpath("//tr/td/input[@id='"+Id+"']")).click();

    }

    //This method is to perform actions on Form Images
    public static void img_Button (String alt_Value) {
        driver.findElement(By.xpath("//tr/td/a/img[@alt='"+alt_Value+"']")).click();
    }

    public static void img_Button (String alt_Value , Integer index) {
        driver.findElement(By.xpath("(//tr/td/a/img[@alt='"+alt_Value+"'])["+index+"]")).click();
    }

    public static void find_Button () {
        driver.findElement(By.xpath("//tr/td/a[@alt='Run Selection']")).click();
    }

    //This method is to perform action on Static Select Dropdowns
    public static void select_Locator (String Id , String value) {
        WebElement Dropdown = driver.findElement(By.xpath("//tr/td/select[@id='"+Id+"']"));
        Select static_Dropdown = new Select(Dropdown);
        static_Dropdown.selectByValue(value);
    }

    //This method is to perform SignIn action
    public static void signIn (String userName , String passWord) {
        driver.findElement(By.xpath("//input[@name='signOnName']")).sendKeys(userName);
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys(passWord);
        driver.findElement(By.xpath("//input[@type='submit']")).click();
    }

    //Switch Frame
    public static void switchFrame(int index){
        driver.switchTo().frame(index);
    }

    public static void parentFrame(){
        driver.switchTo().parentFrame();
    }

    //This method is to perform actions on Form Textarea Fields
    public static void textarea_Locator (String Id , String value) {
        driver.findElement(By.xpath("//tr/td/textarea[@id='"+Id+"']")).clear();
        driver.findElement(By.xpath("//tr/td/textarea[@id='"+Id+"']")).sendKeys(value);
    }

    //This method is to perform actions on Form Radio Buttons
    public static void radiobutton_Locator(String Id , int index) {
        //tr/td/input/following-sibling::span[text()='Small']
        driver.findElement(By.xpath("(//tr/td/input[@id='"+Id+"'])["+index+"]")).click();
    }

    //This method is to perform actions on In-Form Tabs
    public static void form_Tab(String text_Value) {
        driver.findElement(By.xpath("//tr/td/a/span[text()='"+text_Value+"']")).click();
    }

    //This method is to perform action of Accept Override
    public static void acceptOverride() {
        driver.findElement(By.xpath("//tr/td/a[text()='Accept Overrides']")).click();
    }

    //This method is to Expand/Collapse Menu Items
    public static void menu_Dropdown(String alt_Value) {
        driver.findElement(By.xpath("//ul/li/span/img[@alt='"+alt_Value+"']")).click();
    }

    public static void menu_Dropdown(String alt_Value, Integer index) {
        driver.findElement(By.xpath("(//ul/li/span/img[contains(@alt,'"+alt_Value+"')])["+index+"]")).click();
    }

    //This method is to perform a click on Menu Links
    public static void menu_Link(String text_Value) {
        driver.findElement(By.xpath("//ul/li/a[text()='"+text_Value+"']")).click();
    }

    public static void menu_Link(String text_Value , Integer index) {
        driver.findElement(By.xpath("(//ul/li/a[contains(text(),'"+text_Value+"')])["+index+"]")).click();
    }

    public static void form_Link(String text_Value) {
        driver.findElement(By.xpath("//table/tbody/tr/td/a[text()='"+text_Value+"']")).click();
    }

    public static void form_Link(String text_Value , Integer index) {
        driver.findElement(By.xpath("(//table/tbody/tr/td/a[text()='"+text_Value+"'])["+index+"]")).click();
    }

    public static void authorizeDeal () {
        driver.findElement(By.xpath("//tr/td/a/img[@alt='Authorises a deal']")).click();
        if (driver.getPageSource().contains("Accept Overrides")){
            WebElement override = driver.findElement(By.xpath("//tr/td/a[text()='Accept Overrides']"));
            override.click();
        }
    }

    //Generate Random Numbers

    public static int idNumber() {
        Random rand = new Random();
        int min = 10000;
        int max = 99999;

        int rand_value = rand.nextInt((max - min) + 1) + min;
        return rand_value;
    }

    public static String switchToChildWindow() {
        String homePage = driver.getWindowHandle();
        for (String winHandle : driver.getWindowHandles()){
            driver.switchTo().window(winHandle);
        }
        return homePage;
    }

    public static void switchToParentWindow(String window){
        driver.switchTo().window(window);
    }

    public static void maximizeWindow(){
        driver.manage().window().maximize();
    }

    public static void txnValidate(String testCaseName) throws IOException {
       WebElement Txn = driver.findElement(By.xpath("//table/tbody/tr/td[contains(text(),'Txn Complete:')]"));
       Assert.assertTrue(Txn.isDisplayed(),"Transaction Un-Successful");

       String Transaction = Txn.getText();
       String[] first = Transaction.split(":");
       String[] second = first[1].split(" ");
       String TxnNum = second[1];
       System.out.println("Transaction Number is: "+TxnNum);

        File file = new File(System.getProperty("user.dir") + "\\Data\\" +testCaseName+ ".xlsx");
        XSSFWorkbook workbook;
        Row row;
        Cell cell;
        int rowNum = 0;

        if (file.exists()) {
            FileInputStream fis = new FileInputStream(file);
            workbook = new XSSFWorkbook(fis);
            Sheet sheet = workbook.getSheetAt(0);
            rowNum = sheet.getLastRowNum() + 1; // Start writing from the next row
        } else {
            workbook = new XSSFWorkbook();
            Sheet sheet = workbook.createSheet();
            row = sheet.createRow(rowNum++);
            cell = row.createCell(0);
            cell.setCellValue("Transaction Number");
        }

        Sheet sheet = workbook.getSheetAt(0);
        row = sheet.createRow(rowNum++);
        cell = row.createCell(0);
        cell.setCellValue(TxnNum);

        FileOutputStream fos = new FileOutputStream(file);
        workbook.write(fos);
        fos.close();

    }

    // Commit Deal For Inputter
    public static void commitDeal (String testCaseName) throws IOException {
        driver.findElement(By.xpath("//tr/td/a/img[@alt='Validate a deal']")).click();
        driver.findElement(By.xpath("//tr/td/a/img[@alt='Commit the deal']")).click();
        if (driver.getPageSource().contains("Txn Complete:")){
            txnValidate(testCaseName);
        }else{
            try {
                WebElement acpOverride = driver.findElement(By.xpath("//tr/td/a[text()='Accept Overrides']"));
                acpOverride.click();
                txnValidate(testCaseName);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }

        }

    }

    public static void commitTxn() {
        driver.findElement(By.xpath("//tr/td/a/img[@alt='Validate a deal']")).click();
        driver.findElement(By.xpath("//tr/td/a/img[@alt='Commit the deal']")).click();
        if (driver.getPageSource().contains("Accept Overrides")){
            driver.findElement(By.xpath("//tr/td/a[text()='Accept Overrides']")).click();
        }
    }

    // Get Txn Number to pass further for Authorization
    public static String getTxn () {
        WebElement Txn = driver.findElement(By.xpath("//table/tbody/tr/td[contains(text(),'Txn Complete:')]"));
        String Transaction = Txn.getText();
        String[] first = Transaction.split(":");
        String[] second = first[1].split(" ");
        String TxnNum = second[1];
        return TxnNum;
    }

    public static void checklistCommit(String testCaseName) throws IOException {
        PageObject.select_Locator("fieldName:CHECKED:1","NO");
        PageObject.select_Locator("fieldName:REMARKS:1","NOT APPLICABLE");
        PageObject.select_Locator("fieldName:CHECKED:2","NO");
        PageObject.select_Locator("fieldName:REMARKS:2","NOT APPLICABLE");
        PageObject.select_Locator("fieldName:CHECKED:3","NO");
        PageObject.select_Locator("fieldName:REMARKS:3","NOT APPLICABLE");
        PageObject.select_Locator("fieldName:CHECKED:4","NO");
        PageObject.select_Locator("fieldName:REMARKS:4","NOT APPLICABLE");
        PageObject.select_Locator("fieldName:CHECKED:5","NO");
        PageObject.select_Locator("fieldName:REMARKS:5","NOT APPLICABLE");
        PageObject.select_Locator("fieldName:CHECKED:6","NO");
        PageObject.select_Locator("fieldName:REMARKS:6","NOT APPLICABLE");
        PageObject.select_Locator("fieldName:CHECKED:7","NO");
        PageObject.select_Locator("fieldName:REMARKS:7","NOT APPLICABLE");
        PageObject.select_Locator("fieldName:CHECKED:8","NO");
        PageObject.select_Locator("fieldName:REMARKS:8","NOT APPLICABLE");
        PageObject.select_Locator("fieldName:CHECKED:9","NO");
        PageObject.select_Locator("fieldName:REMARKS:9","NOT APPLICABLE");
        PageObject.select_Locator("fieldName:CHECKED:10","NO");
        PageObject.select_Locator("fieldName:REMARKS:10","NOT APPLICABLE");
        PageObject.select_Locator("fieldName:CHECKED:11","NO");
        PageObject.select_Locator("fieldName:REMARKS:11","NOT APPLICABLE");
        PageObject.select_Locator("fieldName:CHECKED:12","NO");
        PageObject.select_Locator("fieldName:REMARKS:12","NOT APPLICABLE");
        PageObject.select_Locator("fieldName:CHECKED:13","NO");
        PageObject.select_Locator("fieldName:REMARKS:13","NOT APPLICABLE");
        PageObject.select_Locator("fieldName:CHECKED:14","NO");
        PageObject.select_Locator("fieldName:REMARKS:14","NOT APPLICABLE");
        PageObject.select_Locator("fieldName:CHECKED:15","NO");
        PageObject.select_Locator("fieldName:REMARKS:15","NOT APPLICABLE");
        PageObject.select_Locator("fieldName:CHECKED:16","NO");
        PageObject.select_Locator("fieldName:REMARKS:16","NOT APPLICABLE");
        PageObject.select_Locator("fieldName:CHECKED:17","NO");
        PageObject.select_Locator("fieldName:REMARKS:17","NOT APPLICABLE");
        PageObject.select_Locator("fieldName:CHECKED:18","NO");
        PageObject.select_Locator("fieldName:REMARKS:18","NOT APPLICABLE");
        PageObject.select_Locator("fieldName:CHECKED:19","NO");
        PageObject.select_Locator("fieldName:REMARKS:19","NOT APPLICABLE");
        PageObject.select_Locator("fieldName:CHECKED:20","NO");
        PageObject.select_Locator("fieldName:REMARKS:20","NOT APPLICABLE");
        PageObject.select_Locator("fieldName:CHECKED:21","NO");
        PageObject.select_Locator("fieldName:REMARKS:21","NOT APPLICABLE");
        PageObject.select_Locator("fieldName:CHECKED:22","NO");
        PageObject.select_Locator("fieldName:REMARKS:22","NOT APPLICABLE");
        PageObject.select_Locator("fieldName:CHECKED:23","NO");
        PageObject.select_Locator("fieldName:REMARKS:23","NOT APPLICABLE");
        PageObject.select_Locator("fieldName:CHECKED:24","NO");
        PageObject.select_Locator("fieldName:REMARKS:24","NOT APPLICABLE");
        PageObject.select_Locator("fieldName:CHECKED:25","NO");
        PageObject.select_Locator("fieldName:REMARKS:25","NOT APPLICABLE");
        PageObject.select_Locator("fieldName:CHECKED:26","NO");
        PageObject.select_Locator("fieldName:REMARKS:26","NOT APPLICABLE");
        PageObject.select_Locator("fieldName:CHECKED:27","NO");
        PageObject.select_Locator("fieldName:REMARKS:27","NOT APPLICABLE");
        PageObject.select_Locator("fieldName:CHECKED:28","NO");
        PageObject.select_Locator("fieldName:REMARKS:28","NOT APPLICABLE");
        PageObject.select_Locator("fieldName:CHECKED:29","NO");
        PageObject.select_Locator("fieldName:REMARKS:29","NOT APPLICABLE");
        PageObject.select_Locator("fieldName:CHECKED:30","NO");
        PageObject.select_Locator("fieldName:REMARKS:30","NOT APPLICABLE");
        PageObject.select_Locator("fieldName:CHECKED:31","NO");
        PageObject.select_Locator("fieldName:REMARKS:31","NOT APPLICABLE");
        PageObject.select_Locator("fieldName:CHECKED:32","NO");
        PageObject.select_Locator("fieldName:REMARKS:32","NOT APPLICABLE");
        PageObject.select_Locator("fieldName:CHECKED:33","NO");
        PageObject.select_Locator("fieldName:REMARKS:33","NOT APPLICABLE");
        PageObject.select_Locator("fieldName:CHECKED:34","NO");
        PageObject.select_Locator("fieldName:REMARKS:34","NOT APPLICABLE");
        PageObject.select_Locator("fieldName:CHECKED:35","NO");
        PageObject.select_Locator("fieldName:REMARKS:35","NOT APPLICABLE");
        PageObject.select_Locator("fieldName:CHECKED:36","NO");
        PageObject.select_Locator("fieldName:REMARKS:36","NOT APPLICABLE");
        PageObject.select_Locator("fieldName:CHECKED:37","NO");
        PageObject.select_Locator("fieldName:REMARKS:37","NOT APPLICABLE");
        PageObject.select_Locator("fieldName:CHECKED:38","NO");
        PageObject.select_Locator("fieldName:REMARKS:38","NOT APPLICABLE");
        PageObject.select_Locator("fieldName:CHECKED:39","NO");
        PageObject.select_Locator("fieldName:REMARKS:39","NOT APPLICABLE");
        PageObject.select_Locator("fieldName:CHECKED:40","NO");
        PageObject.select_Locator("fieldName:REMARKS:40","NOT APPLICABLE");
        PageObject.select_Locator("fieldName:CHECKED:41","NO");
        PageObject.select_Locator("fieldName:REMARKS:41","NOT APPLICABLE");
        PageObject.select_Locator("fieldName:CHECKED:42","NO");
        PageObject.select_Locator("fieldName:REMARKS:42","NOT APPLICABLE");
        PageObject.select_Locator("fieldName:CHECKED:43","NO");
        PageObject.select_Locator("fieldName:REMARKS:43","NOT APPLICABLE");
        PageObject.select_Locator("fieldName:CHECKED:44","NO");
        PageObject.select_Locator("fieldName:REMARKS:44","NOT APPLICABLE");
        PageObject.select_Locator("fieldName:CHECKED:45","NO");
        PageObject.select_Locator("fieldName:REMARKS:45","NOT APPLICABLE");
        PageObject.select_Locator("fieldName:CHECKED:46","NO");
        PageObject.select_Locator("fieldName:REMARKS:46","NOT APPLICABLE");
        PageObject.select_Locator("fieldName:CHECKED:47","NO");
        PageObject.select_Locator("fieldName:REMARKS:47","NOT APPLICABLE");
        PageObject.select_Locator("fieldName:CHECKED:48","NO");
        PageObject.select_Locator("fieldName:REMARKS:48","NOT APPLICABLE");
        commitDeal(testCaseName);
    }



    //This method is for user SignOff
    public static void signOff() {
        driver.findElement(By.xpath("//tr/td/a[@alt='Sign off']")).click();
    }

}
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import functions.AddFunctions;
import functions.DeleteFunctions;
import functions.OtherFunctions;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class TestAppFunctions {
    AndroidDriver driver;
    AddFunctions addFunctions;
    DeleteFunctions deleteFunctions;
    OtherFunctions otherFunctions;

    @BeforeTest()
    public void setUp() throws MalformedURLException{

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName","emulator");
        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("app", "C:\\Users\\maroj\\Downloads\\Notepad_v2.12_apkpure.com.apk" );
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        addFunctions = new AddFunctions(driver);
        deleteFunctions = new DeleteFunctions(driver);
        otherFunctions = new OtherFunctions(driver);
        addFunctions.addFirstNote("this is first Note");
    }

    @Test
    public void addClassicNote() throws Exception {
        String expectedNoteText = "this is classic note";
        String actualNoteText = addFunctions.addClassicNote(expectedNoteText);
        Assert.assertEquals(actualNoteText,expectedNoteText);

        Thread.sleep(5000);
    }

    @Test
    public void addImageNote() throws Exception{
        String expectedNoteText = "this is classic note";
        String actualNoteText = addFunctions.addImageNote(expectedNoteText);
        Assert.assertEquals(actualNoteText,expectedNoteText);
        Thread.sleep(5000);
    }

    @Test
    public void  deleteNote() throws Exception{
        String expectedNoteText = "this is classic delete";
        expectedNoteText = addFunctions.addClassicNote(expectedNoteText);
        String actualNoteText = deleteFunctions.deleteNote();
        Assert.assertEquals(expectedNoteText,actualNoteText);
        Thread.sleep(5000);
    }

    @Test
    public void  deleteNoteHold() throws Exception{
        String expectedNoteText = "this is holdDelete";
        expectedNoteText = addFunctions.addClassicNote(expectedNoteText);
        String actualNoteText = deleteFunctions.deleteNoteHold();
        Assert.assertEquals(expectedNoteText,actualNoteText);
        Thread.sleep(5000);
    }

    @Test
    public void addToFavourites() throws Exception{
        String expectedNoteText = "add to favourites";
        expectedNoteText = addFunctions.addClassicNote(expectedNoteText);
        String actualNoteText = otherFunctions.addToFavourites();
        Assert.assertEquals(expectedNoteText,actualNoteText);
        Thread.sleep(5000);
    }

    @Test
    public void Search() throws Exception {
        ArrayList<String> inputList = new ArrayList<>(Arrays.asList("lala","dada","haha","hehe"));
        for (int i=0; i<inputList.size();i++){
            addFunctions.addClassicNote(inputList.get(i));
        }
        String expectedNoteText = inputList.get(inputList.size()-1);
        String actualNoteText = otherFunctions.searchNotes(expectedNoteText);
        Assert.assertEquals(expectedNoteText,actualNoteText);
        Thread.sleep(5000);
    }

    @Test
    public void addInspirationTag() throws Exception{
        String expectedNoteText = addFunctions.addClassicNote("adding tags");
        String actualNoteText = otherFunctions.addInspirationTag();
        Assert.assertEquals(expectedNoteText,actualNoteText);
        Thread.sleep(5000);
    }
    @Test
    public void sortNotes() throws Exception{
        ArrayList<String> inputList = new ArrayList<>(Arrays.asList("aaaa","bbbb","cccc","dddd"));
        for (int i=0; i<inputList.size();i++){
            addFunctions.addClassicNote(inputList.get(i));
        }
        String expectedNoteText = inputList.get(0);
        String actualNoteText = otherFunctions.sortNotes();
        Assert.assertEquals(expectedNoteText,actualNoteText);
        Thread.sleep(5000);

    }


    @AfterClass
    public void teardown(){
        driver.quit();
    }



}

/*{
        "app": "C:\\Users\\maroj\\Downloads\\Notepad_v2.12_apkpure.com.apk",
        "platformName": "Android",
        "deviceName": "emulator"
        }*/



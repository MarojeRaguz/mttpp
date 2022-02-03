package functions;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;
import org.openqa.selenium.By;

public class DeleteFunctions {

    AndroidDriver driver;

    public DeleteFunctions(AndroidDriver driver) {
        this.driver = driver;


    }

    public String deleteNote() throws InterruptedException {
        MobileElement selectNoteEl = (MobileElement)this.driver.findElement(By.id("com.splendapps.adler:id/tvGridElementNote"));
        selectNoteEl.click();
        MobileElement optionsEl = (MobileElement)this.driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"More options\"]"));
        optionsEl.click();
        MobileElement deleteEl = (MobileElement)this.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.LinearLayout"));
        deleteEl.click();
        MobileElement confirmDeleteEl = (MobileElement)this.driver.findElement(By.id("android:id/button1"));
        confirmDeleteEl.click();
        MobileElement sideOptionsEl = (MobileElement)this.driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Open drawer\"]"));
        sideOptionsEl.click();
        MobileElement trashNotesEl = (MobileElement)this.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.ListView/android.widget.LinearLayout[8]\n"));

        trashNotesEl.click();
        selectNoteEl.click();
        Thread.sleep(2000L);
        MobileElement textNoteInputEl = (MobileElement)this.driver.findElement(By.id("com.splendapps.adler:id/etNoteNote"));
        String noteText = textNoteInputEl.getText();
        MobileElement submitNoteEl = (MobileElement)this.driver.findElement(By.id("com.splendapps.adler:id/ivSaveAndExit"));

        submitNoteEl.click();
        Thread.sleep(2000L);
        sideOptionsEl.click();
        MobileElement allNotesEl = (MobileElement)this.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.ListView/android.widget.LinearLayout[1]\n"));
        allNotesEl.click();
        return noteText;
    }

    public String deleteNoteHold() throws InterruptedException {
        MobileElement selectNoteEl = (MobileElement)this.driver.findElement(By.id("com.splendapps.adler:id/tvGridElementNote"));
        AndroidTouchAction action = new AndroidTouchAction(this.driver);
        ((AndroidTouchAction)action.longPress((LongPressOptions)LongPressOptions.longPressOptions().withElement(ElementOption.element(selectNoteEl)))).perform();
        MobileElement deleteEl = (MobileElement)this.driver.findElement(By.id("com.splendapps.adler:id/action_ctx_delete"));
        deleteEl.click();
        MobileElement confirmDeleteEl = (MobileElement)this.driver.findElement(By.id("android:id/button1"));
        confirmDeleteEl.click();
        MobileElement sideOptionsEl = (MobileElement)this.driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Open drawer\"]"));
        sideOptionsEl.click();
        MobileElement trashNotesEl = (MobileElement)this.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.ListView/android.widget.LinearLayout[8]\n"));
        trashNotesEl.click();
        selectNoteEl.click();
        MobileElement textNoteInputEl = (MobileElement)this.driver.findElement(By.id("com.splendapps.adler:id/etNoteNote"));

        String noteText = textNoteInputEl.getText();
        MobileElement submitNoteEl = (MobileElement)this.driver.findElement(By.id("com.splendapps.adler:id/ivSaveAndExit"));

        submitNoteEl.click();
        Thread.sleep(2000L);
        sideOptionsEl.click();
        MobileElement allNotesEl = (MobileElement)this.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.ListView/android.widget.LinearLayout[1]\n"));
        allNotesEl.click();
        return noteText;
    }
}

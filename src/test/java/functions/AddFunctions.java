package functions;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class AddFunctions {

    AndroidDriver driver;

    public AddFunctions(AndroidDriver driver) {

        this.driver = driver;

    }



    public String addImageNote(String note) throws InterruptedException  {
        MobileElement addNoteEl = (MobileElement) this.driver.findElement(By.id("com.splendapps.adler:id/ivSpectreLauncher"));
        addNoteEl.click();
        MobileElement imageNoteEl = (MobileElement) this.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.ImageView"));
        imageNoteEl.click();
        MobileElement takeNewPhotoEl = (MobileElement) this.driver.findElement(By.id("com.splendapps.adler:id/layTakePhoto"));
        takeNewPhotoEl.click();
        Thread.sleep(5000);
        MobileElement takePhotoEl = (MobileElement) this.driver.findElement(By.id("com.android.camera2:id/shutter_button"));
        takePhotoEl.click();
        Thread.sleep(5000);
        MobileElement acceptPhotoEl= (MobileElement)this.driver.findElement(By.id("com.android.camera2:id/done_button"));
        acceptPhotoEl.click();
        MobileElement textNoteInputEl =  (MobileElement)this.driver.findElement(By.id("com.splendapps.adler:id/etNoteNote"));
        textNoteInputEl.setValue(note);
        MobileElement submitNoteEl = (MobileElement)this.driver.findElement(By.id("com.splendapps.adler:id/ivSaveAndExit"));
        submitNoteEl.click();
        Thread.sleep(5000);
        MobileElement selectNoteEl = (MobileElement)this.driver.findElement(By.id("com.splendapps.adler:id/tvGridElementNote"));

        selectNoteEl.click();
        textNoteInputEl =  (MobileElement)this.driver.findElement(By.id("com.splendapps.adler:id/etNoteNote"));
        String noteText = textNoteInputEl.getText();
        submitNoteEl.click();
        return noteText;
    }

    public String addClassicNote(String note){
        MobileElement addNoteEl = (MobileElement) this.driver.findElement(By.id("com.splendapps.adler:id/ivSpectreLauncher"));
        addNoteEl.click();
        MobileElement textNoteEl = (MobileElement)this.driver.findElement(By.xpath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout[5]/android.widget.ImageView\n"));
        textNoteEl.click();
        MobileElement textNoteInputEl =  (MobileElement)this.driver.findElement(By.id("com.splendapps.adler:id/etNoteNote"));
        textNoteInputEl.setValue(note);
        MobileElement submitNoteEl = (MobileElement)this.driver.findElement(By.id("com.splendapps.adler:id/ivSaveAndExit"));
        submitNoteEl.click();
        MobileElement selectNoteEl = (MobileElement)this.driver.findElement(By.id("com.splendapps.adler:id/tvGridElementNote"));
        selectNoteEl.click();
        textNoteInputEl =  (MobileElement)this.driver.findElement(By.id("com.splendapps.adler:id/etNoteNote"));
        String noteText = textNoteInputEl.getText();
        submitNoteEl.click();
        return noteText;
    }
    public void addFirstNote(String note){
        MobileElement addNoteEl = (MobileElement) this.driver.findElement(By.id("com.splendapps.adler:id/ivSpectreLauncher"));
        addNoteEl.click();
        MobileElement textNoteEl = (MobileElement)this.driver.findElement(By.xpath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout[5]/android.widget.ImageView\n"));
        textNoteEl.click();
        MobileElement textNoteInputEl =  (MobileElement)this.driver.findElement(By.id("com.splendapps.adler:id/etNoteNote"));
        textNoteInputEl.setValue(note);
        MobileElement submitNoteEl = (MobileElement)this.driver.findElement(By.id("com.splendapps.adler:id/ivSaveAndExit"));
        submitNoteEl.click();
    }
}
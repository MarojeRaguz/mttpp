package functions;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class OtherFunctions {

    AndroidDriver driver;

    public OtherFunctions(AndroidDriver driver) {
        this.driver = driver;
       }

    public String addToFavourites() throws Exception {
        Thread.sleep(2000L);
        MobileElement selectNoteEl = (MobileElement)this.driver.findElement(By.id("com.splendapps.adler:id/tvGridElementNote"));
        selectNoteEl.click();
        MobileElement addToFavouriteEl = (MobileElement)this.driver.findElement(By.id("com.splendapps.adler:id/ivNoteFavourite"));
        addToFavouriteEl.click();
        MobileElement submitNoteEl = (MobileElement)this.driver.findElement(By.id("com.splendapps.adler:id/ivSaveAndExit"));

        submitNoteEl.click();
        MobileElement sideOptionsEl = (MobileElement)this.driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Open drawer\"]"));

        sideOptionsEl.click();
        MobileElement displayFavouritesEl = (MobileElement)this.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.ListView/android.widget.LinearLayout[2]\n"));

        displayFavouritesEl.click();
        selectNoteEl.click();
        MobileElement textNoteInputEl = (MobileElement)this.driver.findElement(By.id("com.splendapps.adler:id/etNoteNote"));

        String noteText = textNoteInputEl.getText();
        submitNoteEl.click();
        Thread.sleep(2000L);
        sideOptionsEl.click();
        MobileElement allNotesEl = (MobileElement)this.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.ListView/android.widget.LinearLayout[1]\n"));

        allNotesEl.click();

        return noteText;
    }

    public String searchNotes(String note) throws Exception{
        Thread.sleep(4000);
        MobileElement searchIconEl = (MobileElement) driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Search\"]"));
        searchIconEl.click();
        MobileElement searchInputEl = (MobileElement) driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.view.ViewGroup/androidx.appcompat.widget.LinearLayoutCompat/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.EditText"));

        searchInputEl.setValue(note);
        MobileElement selectNoteEl = (MobileElement)this.driver.findElement(By.id("com.splendapps.adler:id/tvGridElementNote"));
        selectNoteEl.click();
        MobileElement textNoteInputEl = (MobileElement)this.driver.findElement(By.id("com.splendapps.adler:id/etNoteNote"));
        String noteText=textNoteInputEl.getText();
        MobileElement submitNoteEl = (MobileElement)this.driver.findElement(By.id("com.splendapps.adler:id/ivSaveAndExit"));
        submitNoteEl.click();
        searchIconEl = (MobileElement) driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Search\"]"));
        searchIconEl.click();
        MobileElement backClickEl = (MobileElement) driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Collapse\"]\n"));
        backClickEl.click();

        return noteText;
    }
}

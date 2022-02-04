# Metode i tehnike testiranja programske podrške - projektni zadatak 


U ovom projektu testirat će se android aplikacija [notepad](https://apkpure.com/notepad/com.splendapps.adler) kroz 8 testnih slučajeva.

## Popis alata potrebnih za izvođenje:

- [Android SDK(Android Studio)](https://developer.android.com/studio)
- [JDK (Java Development Kit)](https://www.guru99.com/install-java.html)
- [IDE - IntelliJ](https://www.jetbrains.com/idea/download/#section=windows)
- [Test Framework - TestNG](https://mvnrepository.com/artifact/org.testng/testng)
- [Selenium-Java](https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java)
- [Node.js](https://nodejs.org/en/download/)
- [Appium 1.18.3](https://github.com/appium/appium-desktop/releases/tag/v1.18.3)


## Pokretanje emulatora i instalacija [notepad](https://apkpure.com/notepad/com.splendapps.adler) aplikacije

Za testiranje se koristio Nexus 5X API 28

### Pokretanje emulatora iz komandne linije

```bash
C:\Users\Korisnik\AppData\Local\Android\Sdk\emulator> emulator -avd Nexus_5X_API_28
```
### Pokretanje testne aplikacije na emulatoru
```bash
C:\Users\Korisnik\AppData\Local\Android\Sdk\emulator> adb -s emulator-5554 install <putanja do aplikacije>\Notepad_v2.12_apkpure.com.apk
```
### Pokretanje ADB poslužitelja 
```bash
C:\Users\Korisnik\AppData\Local\Android\Sdk\platform-tools> adb start-server
```

## Pokretanje Appium aplikacije







### Test cases
Before each test case, method [setupTests()](https://github.com/mislavkostic/MTTPP_projekt/blob/c20cba0dbb06a457a8ae9a2224b192f5c54ef26d/src/main/java/SeleniumTests.java#L16) is run, setting up [ChromeDriver](https://chromedriver.chromium.org/) in which the tests are run

- [googleResultTest()](https://github.com/mislavkostic/MTTPP_projekt/blob/c20cba0dbb06a457a8ae9a2224b192f5c54ef26d/src/main/java/SeleniumTests.java#L26)
    - tests if Google search returns a link to the [OpenCart](https://demo.opencart.com/)

- [homepageTest()](https://github.com/mislavkostic/MTTPP_projekt/blob/c20cba0dbb06a457a8ae9a2224b192f5c54ef26d/src/main/java/SeleniumTests.java#L38)
    - **WebDriver** navigates to [OpenCart's homepage](https://demo.opencart.com/) and tests if the page loaded

- [registerTest()](https://github.com/mislavkostic/MTTPP_projekt/blob/c20cba0dbb06a457a8ae9a2224b192f5c54ef26d/src/main/java/SeleniumTests.java#L49)
    - tests register function using randomized credentials
    - credentials are being [randomized](https://github.com/mislavkostic/MTTPP_projekt/blob/c20cba0dbb06a457a8ae9a2224b192f5c54ef26d/src/main/java/EmailGenerator.java#L16) for each test run
    - each test run stores newly created credentials in a [data class](https://github.com/mislavkostic/MTTPP_projekt/blob/master/src/main/java/Persona.java) for further use in other test cases
    - if **WebDriver** successfully logs out of the newly created account, test passes, otherwise it fails <u>(*logging out is impossible if the  account creation failed*)</u>

- [loginTest()](https://github.com/mislavkostic/MTTPP_projekt/blob/c20cba0dbb06a457a8ae9a2224b192f5c54ef26d/src/main/java/SeleniumTests.java#L73)
    - **WebDriver** navigates to **Login** button and enters stored credentials from [data class](https://github.com/mislavkostic/MTTPP_projekt/blob/master/src/main/java/Persona.java) and tests whether it logged in or not

- [addToCartTest()](https://github.com/mislavkostic/MTTPP_projekt/blob/c20cba0dbb06a457a8ae9a2224b192f5c54ef26d/src/main/java/SeleniumTests.java#L91)
    - **WebDriver** navigates through the shop menu and tries to add *iMac* to **cart**
    - if added item is inside the cart, the test passes.

After each test case, method [teardownTest()](https://github.com/mislavkostic/MTTPP_projekt/blob/c20cba0dbb06a457a8ae9a2224b192f5c54ef26d/src/main/java/SeleniumTests.java#L114) is run, shutting down [ChromeDriver](https://chromedriver.chromium.org/)

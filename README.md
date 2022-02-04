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
C:\Users\Korisnik\AppData\Local\Android\Sdk\emulator> adb -s emulator-5554 install <putanja_do_aplikacije>\Notepad_v2.12_apkpure.com.apk
```
### Pokretanje ADB poslužitelja 
```bash
C:\Users\Korisnik\AppData\Local\Android\Sdk\platform-tools> adb start-server
```

## Pokretanje Appium aplikacije

### Podešavanje ANDROID_HOME i JAVA_HOME varijable
![alt text](https://github.com/MarojeRaguz/mttpp/blob/main/src/resources/images/environmentVariables.png)

### Odaberite New Session Window
![alt text](https://github.com/MarojeRaguz/mttpp/blob/main/src/resources/images/newSessionWindow.png)

### Unesite željene sposobnosti mobilnog uređaja i zapičnite sesiju

![alt text](https://github.com/MarojeRaguz/mttpp/blob/main/src/resources/images/serverProperties.png)

## Testni slučajevi

- [search](https://github.com/MarojeRaguz/mttpp/blob/main/src/test/java/TestAppFunctions.java)
  - testiranje funkcije pretraživanja bilježaka
- [addClassicNote](https://github.com/MarojeRaguz/mttpp/blob/main/src/test/java/TestAppFunctions.java)
  - testiranje funkcije za dodavanje nove tekstualne bilješke
- [addImagenote](https://github.com/MarojeRaguz/mttpp/blob/main/src/test/java/TestAppFunctions.java)
  - testiranje funkcije za dodavanje nove tekstualne bilješke
- [addInspirationTag](https://github.com/MarojeRaguz/mttpp/blob/main/src/test/java/TestAppFunctions.java)
  - testiranje funkcije za dodavanje oznake
- [addToFavourites](https://github.com/MarojeRaguz/mttpp/blob/main/src/test/java/TestAppFunctions.java)
  - testiranje funkcije za dodavanje bilješki u favorite
- [deleteNote](https://github.com/MarojeRaguz/mttpp/blob/main/src/test/java/TestAppFunctions.java)
  - testiranje funkcije za brisanje bilješki kroz izbornik
- [deleteNoteHold](https://github.com/MarojeRaguz/mttpp/blob/main/src/test/java/TestAppFunctions.java)
  - testiranje funkcije za brisanje bilješki pomoću označavanja bilješke držanjem, te odabirom opcije obriši
- [sortNotes](https://github.com/MarojeRaguz/mttpp/blob/main/src/test/java/TestAppFunctions.java)
  - testiranje funkcije za abecedno sortiranje bilježaka

##Pokretanje testova i generiranje izvještaja

###Pokretanje iz komandne linije
```bash
> mvn test (Ctrl + Enter)
```






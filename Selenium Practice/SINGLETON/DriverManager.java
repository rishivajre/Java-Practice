public class DriverManager {
    private static volatile DriverManager instance;
    private static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();

    // private constructor
    private DriverManager() {}

    // Get Singleton Instance
    public static DriverManager getInstance() {
        if (instance == null) {
            synchronized (DriverManager.class) {
                if (instance == null) {
                    instance = new DriverManager();
                }
            }
        }
        return instance;
    }

    // Initializr browser
    public void initDriver (String browser) {
        if (tlDriver.get() == null) {
            switch (browser.toLowerCase()) {
                case "chrome":
                    tlDriver.set(new ChromeDriver());
                    break;
                case "firefox":
                    tlDriver.set(new FirefoxDriver());
                    break;            
                default:
                    throw new IllegalArgumentException("Invalid broser: " + browser);
            }
        } 
    }

    // Get WebDriver
    public WebDriver getDriver() {
        return tlDriver.get();
    }

    // QUit browser

    public void quitBrowser() {
        if (tlDriver.get() != null) {
            tlDriver.get().quit();
            tlDriver.remove();
        }
    }
}

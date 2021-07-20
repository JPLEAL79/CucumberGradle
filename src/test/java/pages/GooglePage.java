package pages;

public class GooglePage extends BasePage {

    public GooglePage() {
        super(driver);
    }

    public void navegateToGoogle() {
        navegateTo("https://www.google.com");
    }

}

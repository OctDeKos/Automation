//подключаем библиотеки selenium
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//подключение библиотеки для использования ожидания
import java.time.Duration;

public class Main {
    public static void main(String[] args) {
        //прописываем расположение драйвера на компьютере
        System.setProperty("webdriver.chrome.driver","C:\\tools\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //Установка ожидания
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://avito.ru");
        //используем xpath для поиска нужно элемента по тексту, выбираем первый из найденных.
        WebElement input = driver.findElement(By.xpath("(//a[text()='Личные вещи'])[1]"));

//          WebElement input = driver.findElement(By.xpath("//input[@aria-label='Найти']"));
//        WebElement inputs = driver.findElements(By.xpath("//input[@aria-label='Найти']"));

        //кликаем по найденному элементу
        input.click();
    }
}

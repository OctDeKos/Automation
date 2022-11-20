//подключаем библиотеки selenium

//Дополнительно почитать тут по xpath
//https://www.awesomeandrew.ru/2021/08/06/%D1%80%D1%83%D0%BA%D0%BE%D0%B2%D0%BE%D0%B4%D1%81%D1%82%D0%B2%D0%BE-%D0%BF%D0%BE-%D0%BF%D0%BE%D0%B8%D1%81%D0%BA%D1%83-%D1%8D%D0%BB%D0%B5%D0%BC%D0%B5%D0%BD%D1%82%D0%BE%D0%B2-%D1%81-%D0%B8%D1%81%D0%BF/
//по css селекторам можно искать в консоли - пишем $$("body")
//где body название тэга
//enter и далее в выводе разворачиваем и смотрим, что нашел
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
        //WebElement element = driver.findElement(By.xpath());
        //используем xpath для поиска нужно элемента по тексту, выбираем первый из найденных.
        WebElement input = driver.findElement(By.xpath("(//a[text()='Личные вещи'])[1]"));

//      WebElement input = driver.findElement(By.xpath("//input[@aria-label='Найти']"));
//      WebElement inputs = driver.findElements(By.xpath("//input[@aria-label='Найти']"));

        //кликаем по найденному элементу
        input.click();
        //WebElement element = driver.findElement(By.xpath("(//a[text()='Личные вещи'])[1]"));

        //кликаем по найденному элементу
        //element.click();


    }
}

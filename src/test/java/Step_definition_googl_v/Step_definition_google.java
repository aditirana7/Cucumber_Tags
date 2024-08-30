package Step_definition_googl_v;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_definition_google {
	
	WebDriver driver;
	@Given("browser window is open")
	public void browser_window_is_open() {
		System.setProperty("webdriver.chrome.driver", "./chrome_driver/chromedriver.exe");
		driver = new ChromeDriver();
		
	}

	@Given("user is on google search page")
	public void user_is_on_google_search_page() {
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
	}

	@When("user enters Automation Testing text in search box")
	public void user_enters_automation_testing_text_in_search_box() {
		WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Automation Testing");
   
	}

	@When("hits enter")
	public void hits_enter() {
		WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys(Keys.ENTER);
	}

	@Then("user is navigated to search results")
	public void user_is_navigated_to_search_results() {
		System.out.println(driver.findElement(By.xpath("//*[@id=\"Odp5De\"]/div/div[1]/div/div[1]/block-component/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div[1]/div")).getText());
		
	}

	@Then("print the title of the browser and close browser")
	public void print_the_title_of_the_browser_and_close_browser() {
		System.out.println("Title of the page is: " + driver.getTitle());
		driver.quit();
	}
}

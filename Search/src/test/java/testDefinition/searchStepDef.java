package testDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class searchStepDef 
{
	WebDriver driver;
	@Given("^User is on Unacademy Home Page$")
	public void user_is_on_unacademy_home_page() 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kbaburao\\Desktop\\SeleniumSoftware\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://unacademy.com/goal/jee-main-and-advanced-preparation/TMUVD"); 
		driver.manage().window().maximize();
	}

	@When("User enters course ([^\\\"]*)$")
	public void user_enters_course_data(String data) 
	{
	   driver.findElement(By.xpath("//input[@id='searchInput']")).sendKeys(data);
	   driver.findElement(By.xpath("//input[@id='searchInput']")).sendKeys(Keys.ENTER);
	   
	}

//	@Then("User navigates to respective pages")
//	public void user_navigates_to_respective_pages() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@When("User enters course Chemistry")
//	public void user_enters_course_chemistry() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@When("User enters course SSC")
//	public void user_enters_course_ssc() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@When("User enters course abcdef")
//	public void user_enters_course_abcdef() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@When("User enters Educators name")
//	public void user_enters_educators_name() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@When("User clicks on Educators Hyperlink")
//	public void user_clicks_on_educators_hyperlink() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("User navigates to Educators profile page")
//	public void user_navigates_to_educators_profile_page() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Given("User is on Course page")
//	public void user_is_on_course_page() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@When("User click on fallow")
//	public void user_click_on_fallow() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("User should see following option")
//	public void user_should_see_following_option() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Given("User is on Search Page")
//	public void user_is_on_search_page() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@When("User enters course name")
//	public void user_enters_course_name() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@When("User clicks on Course Hyperlink")
//	public void user_clicks_on_course_hyperlink() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("User navigates to the Course page")
//	public void user_navigates_to_the_course_page() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Given("User is on the Course page")
//	public void user_is_on_the_course_page() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@When("User click on free classes and test")
//	public void user_click_on_free_classes_and_test() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("User should see the free courses")
//	public void user_should_see_the_free_courses() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Given("User is on a Course page")
//	public void user_is_on_a_course_page() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@When("User click on Quick cources")
//	public void user_click_on_quick_cources() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("User should see the Quick cources")
//	public void user_should_see_the_quick_cources() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@When("User click on My library")
//	public void user_click_on_my_library() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("User should see the saved cources content")
//	public void user_should_see_the_saved_cources_content() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@When("User click on Syllabus")
//	public void user_click_on_syllabus() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("User should see the course syllabus")
//	public void user_should_see_the_course_syllabus() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@When("User click on Test series and Practices")
//	public void user_click_on_test_series_and_practices() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@When("User click on Test series")
//	public void user_click_on_test_series() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("User should see the test pracices and series")
//	public void user_should_see_the_test_pracices_and_series() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Given("User is on the Search Page")
//	public void user_is_on_the_search_page() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@When("User clicks on any Related Search")
//	public void user_clicks_on_any_related_search() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@When("user clicks on Particular course")
//	public void user_clicks_on_particular_course() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("User navigates to course page")
//	public void user_navigates_to_course_page() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Given("User is on a Search Page")
//	public void user_is_on_a_search_page() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@When("User clicks on Home")
//	public void user_clicks_on_home() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("User navigates to Unacademy Home page")
//	public void user_navigates_to_unacademy_home_page() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@When("User clicks on Report an issue")
//	public void user_clicks_on_report_an_issue() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("User navigates to Report an issue page")
//	public void user_navigates_to_report_an_issue_page() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("User Reports an Issue")
//	public void user_reports_an_issue() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("Submits it")
//	public void submits_it() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("User Reports an Issue using data table")
//	public void user_reports_an_issue_using_data_table(io.cucumber.datatable.DataTable dataTable) {
//	    // Write code here that turns the phrase above into concrete actions
//	    // For automatic transformation, change DataTable to one of
//	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
//	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
//	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
//	    //
//	    // For other transformations you can register a DataTableType.
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@When("User clicks on Other Links")
//	public void user_clicks_on_other_links() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("User clicks on Facebook logo")
//	public void user_clicks_on_facebook_logo() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("User navigates to facebook page of the Unacademy website")
//	public void user_navigates_to_facebook_page_of_the_unacademy_website() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@When("User clicks on See All")
//	public void user_clicks_on_see_all() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("User Gets all the Educators name")
//	public void user_gets_all_the_educators_name() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("User Clicks on particular Educator")
//	public void user_clicks_on_particular_educator() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("User Clicks on a video")
//	public void user_clicks_on_a_video() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@When("User clicks on Get the learning App")
//	public void user_clicks_on_get_the_learning_app() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("User navigates to Learning App page")
//	public void user_navigates_to_learning_app_page() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
}

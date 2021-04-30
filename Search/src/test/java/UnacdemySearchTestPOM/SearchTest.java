package UnacdemySearchTestPOM;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import UnacademySearchPOM.SearchPOM;

public class SearchTest 
{
	WebDriver driver;
	@Test
	public void searchTest() throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\kbaburao\\Desktop\\SeleniumSoftware\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://unacademy.com/");
	driver.manage().window().maximize();
	
	SearchPOM sp = PageFactory.initElements(driver, SearchPOM.class);
//	sp.accountlick();
//	sp.profileClick();
	sp.searchBox();
	sp.name("sahil khandelwal");
	Actions act = new Actions(driver);
	act.sendKeys(Keys.ENTER).perform();	
//	sp.trend();

	sp.seeMore();
	sp.freeClass();
	sp.userCourses();
	sp.issueReport();
	sp.writeIssue("Some content was not loading");
	sp.sendIssue();
	sp.dwdApp();
	sp.appStore();
	sp.googlePlay();
	sp.links();
	sp.faceBook();
	sp.courseSyllabus();
	sp.testPractice();
	sp.testSeries();
	sp.clickIcon();
	sp.signOut();
	driver.close();	
	}
}

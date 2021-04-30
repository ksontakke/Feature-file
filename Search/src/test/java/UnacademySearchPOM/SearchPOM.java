package UnacademySearchPOM;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPOM 
{
	WebDriver driver;
	
	//@FindBy(xpath="//img[@src='https://static.uacdn.net/thumbnail/user/default.png']")
	//WebElement account;
	//@FindBy(xpath="//p[contains(text(),'Profile')]")
	//WebElement profile;
	@FindBy(id="searchInput")
	WebElement search;
//	@FindBy(xpath="//p[contains(text(),'sahil khandelwal')]")
//	WebElement trending;
//	@FindBy(xpath="//div[@class='Carousel__CardContainer-sc-1owlrrs-4 cIqTFa']//div[1]//a[1]//div[2]//div[2]//button[1]")
//	WebElement follow;
	
	@FindBy(xpath="//a[contains(text(),'SEE ALL')]")
	WebElement seeall;
	@FindBy(linkText="Free classes & tests")
	WebElement freeoptions;
	@FindBy(partialLinkText="Quick cours")
	WebElement quickcourse;
	@FindBy(xpath="//li[@data-id='library']")
	WebElement library;
	@FindBy(xpath="//span[contains(text(),'Report an issue')]")
	WebElement issue;
	@FindBy(xpath="//textarea[@placeholder='Type in your query']")
	WebElement textissue;
	@FindBy(className="Button__StyledButton-dg3jck-0 jerpTs")
	WebElement sendissue;
	@FindBy(className="PlusNavBar__Item-sc-1chblf9-8 hQAPWM")
	WebElement getapp;
	@FindBy(xpath="//img[@alt='appStore']")
	WebElement appstore;
	@FindBy(className="LearnOnTheGo__Img-dlb5bo-6 QyqaT")
	WebElement googleplay;
	@FindBy(xpath="//span[contains(text(),'Other links')]")
	WebElement otherlinks;
	@FindBy(xpath="//a[@href='https://www.facebook.com/unacademy/']")
	WebElement facebook;
	@FindBy(xpath="//a[contains(text(),'Home')]")
	WebElement homepage;
	@FindBy(linkText="Syllabus")
	WebElement syllabus;
	@FindBy(xpath="//span[contains(text(),'Test series & Practice')]")
	WebElement testpractice;
	@FindBy(linkText="Test series")
	WebElement testseries;
	@FindBy(className="Avatar__StyledAvatar-sc-1pabonf-0 hfGBuT HeaderUser__UserAvatar-zjqo1z-8 eyuwbo")
	WebElement icon;
	@FindBy(className="CustomMenuItem__StyledItem-a6uuee-0 GjjfX")
	WebElement signout;
	
	public void search(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
//	public void accountlick()
//	{
//		account.click();
//	}
//	public void profileClick()
//	{
//		profile.click();
//	}
	public void searchBox()
	{
		search.click();
	}
	public void name(String name)
	{
		search.sendKeys(name);
	}
//	public void trend()
//	{
//		trending.click();
//	}
//	public void follow()
//	{
//		follow.click();
//	}
	public void seeMore()
	{
		seeall.click();
	}
	public void freeClass()
	{
		freeoptions.click();
	}
	public void userCourses()
	{
		library.click();
	}
	public void issueReport()
	{
		issue.click();
	}
	public void writeIssue(String issue)
	{
		textissue.sendKeys(issue);		
	}
	public void sendIssue()
	{
		sendissue.click();	
	}
	public void dwdApp()
	{
		getapp.click();
	}
	public void appStore() throws InterruptedException
	{
		appstore.click();
		Thread.sleep(3000);
		driver.close();
	}
	public void googlePlay() throws InterruptedException
	{
		googleplay.click();
		Thread.sleep(3000);
		driver.close();
	}
	public void links()
	{
		otherlinks.click();
	}
	public void faceBook() throws InterruptedException
	{
		facebook.click();
		Thread.sleep(3000);
		driver.close();
	}
	public void courseSyllabus()
	{
		syllabus.click();
	}
	public void testPractice()
	{
		testpractice.click();
	}
	public void testSeries()
	{
		testseries.click();
	}
	public void clickIcon()
	{
		icon.click();
	}
	public void signOut()
	{
		signout.click();
	}	
}

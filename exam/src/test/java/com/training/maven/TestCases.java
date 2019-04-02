package com.training.maven;
import java.io.IOException;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.LogStatus;


public class TestCases extends ReusablesXero 
{
	public static void main(String[] args)throws IOException, InterruptedException
	{
		TC1A();
		TestcaseX1B();
		TestcaseX1C();
		TestcaseX1D();
		TestcaseX2A();
		/*TestcaseX2B();*/
		TestcaseX2C();
		TestcaseX2D();
		TestcaseX2E();
		TC3A();
		TC4A();
		/*TC6A();
		TC7A();*/
		TC8A();
		TC8B();
		TC8C();
		
		
}
	public static void TC1A()
	{
		try
		{
	
		// TODO Auto-generated method stub
		//System.out.println("Start");
		initializeDriver();
		extentReports("TC1A");

		launchUrl("https://login.xero.com/","TcX1");
		WebElement un = findElement(By.xpath("//input[@placeholder='Email address']"), "Username");
		enterText(un, "Username", "sasi14585@gmail.com");
		WebElement pass = findElement(By.xpath("//input[@id='password']"), "Password");
		enterText(pass, "Password", "Sweety123");

		WebElement log=findElement(By.xpath("//button[@id='submitButton']"),"Log In");
		clickButton(log,"Login");
		}
         catch(Exception e) {
	
		endReport();
		
	}
		
		}
	
	public static void TestcaseX1B() throws IOException, InterruptedException {
try {
	
		extentReports("TcX2"); 
		initializeDriver();
		launchUrl("https://login.xero.com/","TCX2");

		WebElement lg=findElement(By.xpath("//a[@class='btn btn-tertiary-alt global-ceiling-bar-btn']"),"Log In");
		clickButton(lg,"Login");


		WebElement un = findElement(By.xpath("//input[@placeholder='Email address']"), "Username");
		enterText(un, "Username", "sasi14585@gmail.com");

		WebElement pass = findElement(By.xpath("//input[@id='password']"), "Password");
		enterText(pass, "Password", "Sweety1243");

		WebElement log=findElement(By.xpath("//button[@id='submitButton']"),"Log In");
		clickButton(log,"Login");

		String string1=findElement(By.xpath("//p[contains(text(),'Your email or password is incorrect')]"), "Error msg").getText();
		String string2="Your email or password is incorrect";
		Assert.assertEquals(string1,string2);
		System.out.println("Error message :" + string1);
		logger.log( LogStatus.PASS, "Error message :" + string1);
}
		catch(Exception e)
		{

		
		endReport();
	}
	}
	public static void TestcaseX1C() throws IOException, InterruptedException {
		try
		{
		extentReports("TcX3"); 
		initializeDriver();
		launchUrl("https://login.xero.com/","TCX3");

		WebElement un = findElement(By.xpath("//input[@placeholder='Email address']"), "Username");
		enterText(un, "Username", "");

		WebElement pass = findElement(By.xpath("//input[@id='password']"), "Password");
		enterText(pass, "Password", "Sweety123");

		WebElement log=findElement(By.xpath("//button[@id='submitButton']"),"Log In");
		clickButton(log,"Login");
		String string1=findElement(By.xpath("//li[contains(text(),'Your email or password is incorrect')]"), "Error msg").getText();
		   String string2="Your email or password is incorrect";
		   Assert.assertEquals(string1,string2);
		   System.out.println("Error message :" + string1);
		   logger.log( LogStatus.PASS, "Error message :" + string1);
		  }catch(Exception E)
		  {
		   endReport();
		  }
		 }
	public static void TestcaseX1D() throws IOException
	{
		try
		{
		initializeDriver();
		extentReports("tc04");

		launchUrl("https://login.xero.com/","TCX01");


		WebElement un = findElement(By.xpath("//input[@id='email']"), "Username");
		enterText(un, "Username", "sasi14585@gmail.com");

		WebElement pass = findElement(By.xpath("//input[@id='password']"), "Password");
		enterText(pass, "Password", "");

		WebElement Fp = findElement(By.xpath("//a[@class='forgot-password-advert']"), "Forgot your password?");
		Fp.click();

		WebElement em = findElement(By.xpath("//input[@id='UserName']"), "email");
		enterText(em, "email", "sasi14585@gmail.com");

		WebElement sl=findElement(By.xpath("//span[contains(@class,'text')]"),"Send Link");
		clickButton(sl,"Send Link");
		}
		catch(Exception e)
		{
		endReport();
	}
	}
	public static void TestcaseX2A() throws IOException
	{
		try
		{
			
			initializeDriver();
		extentReports("TC2A");

		launchUrl("https://login.xero.com/","TC2A");


		WebElement Tr = findElement(By.xpath("//a[contains(text(),'Try Xero for free')]"), "Trial");
		selectCheckBox(Tr,"Try Xero for free");

		WebElement fn = findElement(By.xpath("//input[@name='FirstName']"), "First name");
		enterText(fn, "First name", "Sasikala");

		WebElement ln = findElement(By.xpath("//input[@name='LastName']"), "Last name");
		enterText(ln, "Last name", "Baskaran");

		WebElement ea = findElement(By.xpath("//input[@name='EmailAddress']"), "Email Address");
		enterText(ea, "Email Address", "sasi14585@gmail.com");


		WebElement pn = findElement(By.xpath("//input[@name='PhoneNumber']"), "Phone number");
		enterText(pn, "Phone number", "2817366460");

		WebElement Cn = findElement(By.xpath("//select[@name='LocationCode']"), "Country");
		selectCheckBox(Cn,"United States");

		//WebElement rb= findElement(By.xpath("//div[@class='g-recaptcha form-group']"), "Im not a robot");
		//selectCheckBox(rb,"Im not a robot");


		WebElement ih = findElement(By.xpath("//input[@value='true']"), "Agreement Checked");
		selectCheckBox(ih,"I have read and I agree to the terms of use, privacy notice and offer details");

		WebElement Gs=findElement(By.xpath("//span[@class='g-recaptcha-submit']"),"Get Started");
		clickButton(Gs,"Get Started");
		}
		catch(Exception e)
		{
		endReport();
	}
	}


	public static void TestcaseX2B() throws IOException
	{
		try
		{
		initializeDriver();
		extentReports("TC2B");

		launchUrl("https://login.xero.com/","TC2B");

		WebElement Tr = findElement(By.xpath("//a[contains(text(),'Try Xero for free')]"), "Trial");
		Tr.click();

		WebElement Gs=findElement(By.xpath("//span[@class='g-recaptcha-submit']"),"Get Started");
		clickButton(Gs,"Get Started");

		WebElement fn = findElement(By.xpath("//span[contains(text(),\"First name can't be empty\")]"), "First name");
		String str1=fn.getText();
		String str2="First name can't be empty";
		Assert.assertEquals(str1,str2);
		WebElement ln = findElement(By.xpath("//span[contains(text(),\"Last name can't be empty\")]"), "Last name");
		String str3=ln.getText();
		String str4="Last name can't be empty";
		Assert.assertEquals(str3,str4);
		WebElement em = findElement(By.xpath("//input[@name='EmailAddress']"), "Email Address");
		enterText(em, "Email Address", "sasii5@gmail");

		WebElement Pn = findElement(By.xpath("//span[contains(text(),\"Phone number can't be empty\")]"), "Phone number");
		String str7=Pn.getText();
		String str8="Phone number can't be empty";
		Assert.assertEquals(str7,str8);
		WebElement dd= findElement(By.xpath("//*[@class='form-select-arrow icon']"), "DropDown");
		  enterText(dd, "DropDown", "United States");

		//WebElement Ag = findElement(By.xpath("//div[@class='form-checkbox']"), "Agreement");
		//selectCheckBox(Ag,"I have read and I agree to the terms of use, privacy notice and offer details");

		WebElement Gs1=findElement(By.xpath("//span[@class='g-recaptcha-submit']"),"Get Started");
		clickButton(Gs1,"Get Started");


		WebElement email = findElement(By.xpath("//span[@id='signup-form-error-message-6']"), "Email address is invalid");
		String  str5=email.getText();
		String str6="Email address is invalid";
		Assert.assertEquals(str5,str6);
		}
		catch(Exception E)
		{
		endReport();
	}	
	}

	public static void TestcaseX2C() throws IOException
	{
		try
		{
		initializeDriver();
		extentReports("TcX2c");

		launchUrl("https://www.xero.com/us/","TC2C");

		WebElement Fr=findElement(By.xpath("//a[@class='hero-btn hero-btn-1 hero-cta btn btn-primary']"),"free trial");
		Fr.click();

		WebElement tr=findElement(By.xpath("//a[contains(text(),'terms of use')]"),"terms of use");
		tr.click();

		Set<String>getAllWindows=driver.getWindowHandles();
		String[] getwin=getAllWindows.toArray(new String[getAllWindows.size()]);
		System.out.println(getAllWindows.size());
		driver.switchTo().window(getwin[1]);

		String termsurl=driver.getCurrentUrl();
		System.out.println(driver.getCurrentUrl());
		validateText(termsurl,"https://www.xero.com/us/about/terms/");

		driver.switchTo().window(getwin[0]);
		WebElement pr=findElement(By.xpath("//a[contains(text(),'privacy notice')]"),"privacy notice webpage got opened");
		pr.click();

		String privacyurl=driver.getCurrentUrl();
		System.out.println(driver.getCurrentUrl());
		validateText(privacyurl,"https://www.xero.com/us/about/terms/");
		}
		catch(Exception e)
		{
		endReport();
		}
	}

	public static void TestcaseX2D() throws IOException

	{
		try
		{
		initializeDriver();
		extentReports("TcX2d.html");

		launchUrl("https://www.xero.com/us/","TC2D");

		WebElement Fr=findElement(By.xpath("//a[@class='hero-btn hero-btn-1 hero-cta btn btn-primary']"),"Try Xero for Free");
		Fr.click();

		WebElement od=findElement(By.xpath("//a[contains(text(),'offer details')]"),"offer details");
		od.click();

		Set<String>getAllWindows=driver.getWindowHandles();
		String[] getwin=getAllWindows.toArray(new String[getAllWindows.size()]);
		System.out.println(getAllWindows.size());
		driver.switchTo().window(getwin[1]);

		String offerdetails=driver.getCurrentUrl();
		System.out.println(driver.getCurrentUrl());
		validateText(offerdetails,"https://www.xero.com/us/signup/offer-details/");
		}
		catch(Exception e)
		{
		endReport();
		driver.quit();
	}
	}
	public static void TestcaseX2E() throws IOException
	{
		try
		{
		initializeDriver();
		extentReports("TC2E");

		launchUrl("https://www.xero.com/us/","TC2E");

		WebElement Fr=findElement(By.xpath("//a[@class='hero-btn hero-btn-1 hero-cta btn btn-primary']"),"Try Xero for free");
		clickButton(Fr,"Try Xero for free");

		WebElement ab=findElement(By.xpath("//a[contains(text(),'accountant or bookkeeper')]"),"accountant or bookkeeper");
		clickButton(ab,"accountant or bookkeeper");
		String offerdetails=driver.getCurrentUrl();
		System.out.println(driver.getCurrentUrl());
		validateText(offerdetails,"https://www.xero.com/us/signup/offer-details/");
		}
		catch(Exception e)
		{
			endReport();
		}
		
	}


	public static void TC3A() {
		try
		{
				initializeDriver();
		extentReports("TC3A");

		launchUrl("https://www.xero.com","TC3A");
		WebElement lg=findElement(By.xpath("//a[@class='btn btn-tertiary-alt global-ceiling-bar-btn']"),"Login");
		clickButton(lg,"Login");
		WebElement un = findElement(By.xpath("//input[@placeholder='Email address']"), "Username");
		enterText(un, "Username", "sasi14585@gmail.com");
		WebElement pass = findElement(By.xpath("//input[@id='password']"), "Password");
		enterText(pass, "Password", "Sweety123");
		WebElement log=findElement(By.xpath("//button[@id='submitButton']"),"Log In");
		clickButton(log,"Login");
		WebElement dashboard=findElement(By.xpath("//a[@class='xrh-focusable xrh-tab--body xrh-tab--body-is-selected']"),"DashBoard");
		  clickButton(dashboard,"DashBoard");
		  WebElement business=findElement(By.xpath("//a[@class='xrh-focusable xrh-tab--body xrh-tab--body-is-selected']"),"Business");
		  clickButton(business,"Business");
		  findElement(By.xpath("//a[contains(text(),'Invoices')]"),"Invoices").isDisplayed();
		  findElement(By.xpath("//a[contains(text(),'Quotes')]"),"Quotes").isDisplayed();
		  findElement(By.xpath("//a[contains(text(),'Bills to pay')]"),"Bills to pay").isDisplayed();
		  findElement(By.xpath("//a[contains(text(),'Purchase orders')]"),"Purchase orders").isDisplayed();
		  findElement(By.xpath("//a[contains(text(),'Purchases overview')]"),"Purchases overview").isDisplayed();
		  findElement(By.xpath("//a[contains(text(),'Expense claims')]"),"Expense claims").isDisplayed();
		  findElement(By.xpath("//a[contains(text(),'Expense claims')]"),"Expense claims").isDisplayed();
		  findElement(By.xpath("//a[contains(text(),'Checks')]"),"Checks").isDisplayed();
		  WebElement account=findElement(By.xpath("//button[contains(text(),'Accounting')]"),"Account");
		  clickButton(account,"Account");
		  findElement(By.xpath("//a[contains(text(),'Bank accounts')]"),"Bank accounts").isDisplayed();
		  findElement(By.xpath("//a[contains(text(),'Reports')]"),"Reports").isDisplayed();
		  findElement(By.xpath("//a[contains(text(),'Advanced')]"),"Advanced").isDisplayed();
		  findElement(By.xpath("//a[contains(text(),'Account Transactions')]"),"Account Transactions").isDisplayed();
		  findElement(By.xpath("//a[contains(text(),'Aged Payables Summary')]"),"Aged Payables Summary").isDisplayed();
		  findElement(By.xpath("//a[contains(text(),'Aged Receivables Summary')]"),"Aged Receivables Summary").isDisplayed();
		  findElement(By.xpath("//a[contains(text(),'Balance Sheet')]"),"Balance Sheet").isDisplayed();
		  findElement(By.xpath("//a[contains(text(),'Income Statement')]"),"Income Statement").isDisplayed();
		  findElement(By.xpath("//a[contains(text(),'Sales Tax Report')]"),"Sales Tax Report").isDisplayed();
		  findElement(By.xpath("//a[contains(text(),'Chart of accounts')]"),"Chart of accounts").isDisplayed();
		  findElement(By.xpath("//a[contains(text(),'Fixed assets')]"),"Fixed assets").isDisplayed();
		  WebElement reports=findElement(By.xpath("//a[contains(text(),'Reports')]"),"Reports");
		  clickButton(reports,"Reports");
		  WebElement contact=findElement(By.xpath("//button[contains(text(),'Contacts')]"),"Contacts");
		  clickButton(contact,"Contacts");
		  findElement(By.xpath("//a[contains(text(),'All contacts')]"),"All contacts").isDisplayed();
		  findElement(By.xpath("//a[contains(text(),'Customers')]"),"Customers").isDisplayed();
		  findElement(By.xpath("//a[contains(text(),'Suppliers')]"),"Suppliers").isDisplayed();
		  WebElement abc=findElement(By.xpath("//div[@class='xrh-appbutton--body']"),"abc");
		  clickButton(abc,"abc");
		  findElement(By.xpath("//a[contains(text(),'Files')]"),"Files").isDisplayed();
		  findElement(By.xpath("//a[contains(text(),'Settings')]"),"Settings").isDisplayed();
		  findElement(By.xpath("//a[contains(text(),'Subscription and billing')]"),"Subscription and billing").isDisplayed();
		  findElement(By.xpath("//a[@title='Demo Company']"),"Demo Company").isDisplayed();
		  findElement(By.xpath("//a[@class='xrh-verticalmenuitem--body xrh-verticalmenuitem--body-blue']"),"Add new Organization").isDisplayed();
		  findElement(By.xpath("//a[contains(text(),'Payroll powered by Gusto')]"),"Payroll powered by Gusto").isDisplayed();
		  findElement(By.xpath("//a[contains(text(),'Projects')]"),"Projects").isDisplayed();
		  findElement(By.xpath("//a[contains(text(),'WorkflowMax')]"),"WorkflowMax").isDisplayed();
		  findElement(By.xpath("//a[contains(text(),'App marketplace')]"),"App marketplace").isDisplayed();
		  findElement(By.xpath("//a[contains(text(),'My Xero')]"),"My Xero").isDisplayed();
		  WebElement setting =findElement(By.xpath("//a[contains(text(),'Settings')]"),"Setting");
		  clickButton(setting,"Setting");
		  WebElement plus=findElement(By.xpath("//button[@title='Create new']//div[@class='xrh-focusable--child xrh-iconwrapper']"),"CreateNew");
		  clickButton(plus,"CreateNew");
		  findElement(By.xpath("//div[@class='xrh-dropdown-layout xrh-addon--dropdown xrh-dropdown-is-open xrh-dropdown-is-opening xrh-dropdown-positionright']//a[@class='xrh-verticalmenuitem--body'][contains(text(),'Invoice')]"),"Invoice").isDisplayed();
		  findElement(By.xpath("//div[@class='xrh-dropdown-layout xrh-addon--dropdown xrh-dropdown-is-open xrh-dropdown-is-opening xrh-dropdown-positionright']//a[@class='xrh-verticalmenuitem--body'][contains(text(),'Bill')]"),"Bill").isDisplayed();
		  findElement(By.xpath("//a[contains(text(),'Contact')]"),"Contact").isDisplayed();
		  findElement(By.xpath("//div[@class='xrh-dropdown-layout xrh-addon--dropdown xrh-dropdown-is-open xrh-dropdown-is-opening xrh-dropdown-positionright']//a[@class='xrh-verticalmenuitem--body'][contains(text(),'Quote')]"),"Quote").isDisplayed();
		  findElement(By.xpath("//div[@class='xrh-dropdown-layout xrh-addon--dropdown xrh-dropdown-is-open xrh-dropdown-is-opening xrh-dropdown-positionright']//a[@class='xrh-verticalmenuitem--body'][contains(text(),'Purchase order')]"),"Purchase order").isDisplayed();
		  findElement(By.xpath("//a[contains(text(),'Spend money')]"),"Spend money").isDisplayed();
		  findElement(By.xpath("//a[contains(text(),'Receive money')]"),"Receive money").isDisplayed();
		  findElement(By.xpath("//a[contains(text(),'Transfer money')]"),"Transfer money").isDisplayed();
		  WebElement abc1 =findElement(By.xpath("//div[@class='xrh-appbutton--body']"),"abc1 ");
		  clickButton(abc1,"abc1");
		  WebElement files =findElement(By.xpath("//a[contains(text(),'Files')]")," Files");
		  clickButton(files,"Files");

		  WebElement notifications =findElement(By.xpath("//button[@title='Notifications']//div[@class='xrh-focusable--child xrh-iconwrapper']"),"Notifications ");
		  clickButton(notifications,"Notifications");
		  WebElement search =findElement(By.xpath("//button[@title='Search']//div[@class='xrh-focusable--child xrh-iconwrapper']"),"search");
		  clickButton(search,"search");
		  WebElement help =findElement(By.xpath("//button[@title='Help']//div[@class='xrh-focusable--child xrh-iconwrapper']"),"help ");
		  clickButton(help,"help");

		}
		catch(Exception e)
		{
			endReport();
		}
		
		}

	public static void TC4A() throws InterruptedException {
try
{
		initializeDriver();
		extentReports("TcX4A");

		launchUrl("https://login.xero.com/","TcX4A");


		WebElement un = findElement(By.xpath("//input[@placeholder='Email address']"), "Username");
		enterText(un, "Username", "sasi14585@gmail.com");


		WebElement pass = findElement(By.xpath("//input[@id='password']"), "Password");
		enterText(pass, "Password", "Sweety123");

		WebElement log=findElement(By.xpath("//button[@id='submitButton']"),"Log In");
		clickButton(log,"Login");

		WebElement usermenu=findElement(By.xpath("//abbr[@class='xrh-avatar xrh-avatar-color-6']"),"usermenu");
		usermenu.click();

		WebElement logout=findElement(By.xpath("//div[@class='xrh-dropdown-layout xrh-addon--dropdown xrh-dropdown-is-open xrh-dropdown-is-opening xrh-dropdown-positionright']//a[@class='xrh-verticalmenuitem--body'][contains(text(),'Log out')]"),"logout");
		logout.click();
		Thread.sleep(3000);
		WebElement uname=findElement(By.id("email"),"username");
		String actualmsg=uname.getText();
		System.out.println("Username field is Empty");
		String expectedmsg="sasi14585@gmail.com";
		validateText(actualmsg,expectedmsg);
}
catch(Exception e)
{
		endReport();
		driver.quit();
	}
	}
	public static void TC6A() throws InterruptedException {
	try
	{
		
		initializeDriver();
		WebDriverWait wait = new WebDriverWait(driver, 40);
		extentReports("Tc4A");

		launchUrl("https://login.xero.com/","Tc4A");
		WebElement un = findElement(By.xpath("//input[@placeholder='Email address']"), "Username");
		enterText(un, "Username", "sasi14585@gmail.com");
		WebElement pass = findElement(By.xpath("//input[@id='password']"), "Password");
		enterText(pass, "Password", "Sweety123");
		WebElement log=findElement(By.xpath("//button[@id='submitButton']"),"Log In");
		clickButton(log,"Login");
		WebElement usermenu=findElement(By.xpath("//abbr[@class='xrh-avatar xrh-avatar-color-6']"),"usermenu");
		usermenu.click();
		WebElement Sb=findElement(By.xpath("//span[@class='xrh-verticalmenuitem--subheading']"),"sb profile");
		Sb.click();
		//Add photo
		//Actions mousehoover=new Actions(driver);
		//mousehoover.moveToElement(driver.findElement(By.xpath("//*[text()='Moderator']"))).perform();;
		//WebElement uploadimage=driver.findElement(By.xpath("//span[contains(text(),'Upload Image')]"));
		//uploadimage.click();
		//Thread.sleep(5000);
		//WebElement photoframe=driver.findElement(By.id("uploadPhotoContentId"));
		//driver.switchTo().frame(photoframe);
		//WebElement browse= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("#filefield-1244-button-fileInputEl")));
		//browse.sendKeys("C:\\Users\\BShankar\\Desktop\\IMG_8189.JPG");
		//WebElement upload=driver.findElement(By.xpath("//span[@id='button-1192-btnInnerEl']"));
		//upload.click();
	}
		//Actions action=new Actions(driver); 
		//action.dragAndDropBy(driver.findElement(By.xpath(".//*[@id='j_id0:outer']/div[1]/div/div/div/div[6]")), 100, 20);
		//driver.findElement(By.xpath(".//*[@id='j_id0:j_id7:save']")).click(); 
		//driver.switchTo().defaultContent();
catch(Exception e)
{
		endReport();
	}
	}
	public static void TC7A() throws InterruptedException
	{
try
{
		initializeDriver();
		extentReports("Tc7A");

		launchUrl("https://login.xero.com/","Tc7A");


		WebElement un = findElement(By.xpath("//input[@placeholder='Email address']"), "Username");
		enterText(un, "Username", "gopala.anumanchipalli@gmail.com");


		WebElement pass = findElement(By.xpath("//input[@id='password']"), "Password");
		enterText(pass, "Password", "password12");

		WebElement log=findElement(By.xpath("//button[@id='submitButton']"),"Log In");
		clickButton(log,"Login");

		WebElement xero=findElement(By.xpath("//div[@class='xrh-appbutton--body']"),"My Xero");
		xero.click();

		WebElement org=findElement(By.xpath("//a[@class='xrh-verticalmenuitem--body xrh-verticalmenuitem--body-blue']"),"Org");
		org.click();
		WebElement org1=findElement(By.xpath("//input[@id='text-1022-inputEl']"),"Org");
		org1.sendKeys("Self");
		WebElement org2=findElement(By.xpath("//input[@id='countryCmb-inputEl']"),"Org");
		enterText(org2,"Organization","United States");
		WebElement pst=findElement(By.xpath("//input[@id='cmbTimeZone-inputEl']"),"pst");
		pst.click();
		WebElement org3=findElement(By.xpath("//input[@id='industrysearchcombofield-1025-inputEl']"),"Org");
		org3.sendKeys("Engineering");
		WebElement org4=findElement(By.xpath("//input[@id='combo-1029-inputEl']"),"Org");
		enterText(org4,"Accounting Software","QuickBooks Online");
		Thread.sleep(4000);

		WebElement st=findElement(By.xpath("//a[@id='simplebutton-1035']"),"Start Trial");
		clickButton(st,"Start Trial");
}
catch(Exception E)
{
		endReport();
	}
	}
	
	public static void TC8A() throws InterruptedException {
		
		try
		{
			initializeDriver();
			 extentReports("Tc8A");
		 
		 launchUrl("https://login.xero.com/","Tc8A");
		 

		WebElement un = findElement(By.xpath("//input[@placeholder='Email address']"), "Username");
		enterText(un, "Username", "gopala.anumanchipalli@gmail.com");


		WebElement pass = findElement(By.xpath("//input[@id='password']"), "Password");
		enterText(pass, "Password", "password12");

		WebElement log=findElement(By.xpath("//button[@id='submitButton']"),"Log In");
		clickButton(log,"Login");

		WebElement xero=findElement(By.xpath("//div[@class='xrh-appbutton--body']"),"Self Click");
		xero.click();
		WebElement myxero=findElement(By.xpath("//a[contains(text(),'My Xero')]"),"MyXero");
		clickButton(myxero,"MyXero");
		System.out.println(driver.getCurrentUrl());
		Set<String> getAllwindows=driver.getWindowHandles();
		String[] getwin=getAllwindows.toArray(new String[getAllwindows.size()]);
		System.out.println(getAllwindows.size());
		driver.switchTo().window(getwin[1]);
		System.out.println(driver.getCurrentUrl()); 
		WebElement org=findElement(By.xpath("//a[@class='x-btn green']"),"Add Organisation ");
		clickButton(org,"Add Organisation ");
		WebElement name = findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[1]/span[1]/div[1]/div[1]/div[1]/div[1]/table[2]/tbody[1]/tr[1]/td[2]/input[1]"), "name");
		name.sendKeys("Self");
		WebElement country = findElement(By.xpath("//input[@id='countryCmb-inputEl']"), "country");
		country.sendKeys("United States");
		WebElement timeselect = findElement(By.xpath("//*[@id=\"cmbTimeZone-inputEl\"]"),"Timeselect");
		timeselect.sendKeys("(UTC-08:00) Pacific Time (US & Canada)");
		WebElement industry = findElement(By.xpath("//input[@id='industrysearchcombofield-1025-inputEl']"), "industry");
		industry.sendKeys("Accounting");
		Thread.sleep(4000);
		WebElement StartTrial = findElement(By.id("simplebutton-1035"), "StartTrial");
		StartTrial.click();
		}
		catch(Exception e)
		{
		endReport();
	}
	}
	public static void TC8B() throws InterruptedException {
		
		try
		{
			initializeDriver();
			 extentReports("Tc8B");
		 
		 launchUrl("https://login.xero.com/","Tc8B");
		 

		WebElement un = findElement(By.xpath("//input[@placeholder='Email address']"), "Username");
		enterText(un, "Username", "gopala.anumanchipalli@gmail.com");


		WebElement pass = findElement(By.xpath("//input[@id='password']"), "Password");
		enterText(pass, "Password", "password12");

		WebElement log=findElement(By.xpath("//button[@id='submitButton']"),"Log In");
		clickButton(log,"Login");

		WebElement xero=findElement(By.xpath("//div[@class='xrh-appbutton--body']"),"Self Click");
		xero.click();
		WebElement myxero=findElement(By.xpath("//a[contains(text(),'My Xero')]"),"MyXero");
		clickButton(myxero,"MyXero");
		System.out.println(driver.getCurrentUrl());
		Set<String> getAllwindows=driver.getWindowHandles();
		String[] getwin=getAllwindows.toArray(new String[getAllwindows.size()]);
		System.out.println(getAllwindows.size());
		driver.switchTo().window(getwin[1]);
		System.out.println(driver.getCurrentUrl()); 
		WebElement org=findElement(By.xpath("//a[@class='x-btn green']"),"Add Organisation ");
		clickButton(org,"Add Organisation ");
		WebElement name = findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[1]/span[1]/div[1]/div[1]/div[1]/div[1]/table[2]/tbody[1]/tr[1]/td[2]/input[1]"), "name");
		name.sendKeys("Self");
		WebElement country = findElement(By.xpath("//input[@id='countryCmb-inputEl']"), "country");
		country.sendKeys("United States");
		WebElement timeselect = findElement(By.xpath("//*[@id=\"cmbTimeZone-inputEl\"]"),"Timeselect");
		timeselect.sendKeys("(UTC-08:00) Pacific Time (US & Canada)");
		WebElement industry = findElement(By.xpath("//input[@id='industrysearchcombofield-1025-inputEl']"), "industry");
		industry.sendKeys("Accounting");
		Thread.sleep(4000);
		WebElement buyNow = findElement(By.id("simplebutton-1035"), "BuyNow");
		buyNow.click();
		}
		catch(Exception e)
		
		{endReport();
	}
	}
	public static void TC8C() throws InterruptedException {
		
		try
		{
			initializeDriver();
			 extentReports("Tc8C");
		 
		 launchUrl("https://login.xero.com/","Tc8C");
		 

		WebElement un = findElement(By.xpath("//input[@placeholder='Email address']"), "Username");
		enterText(un, "Username", "gopala.anumanchipalli@gmail.com");


		WebElement pass = findElement(By.xpath("//input[@id='password']"), "Password");
		enterText(pass, "Password", "password12");

		WebElement log=findElement(By.xpath("//button[@id='submitButton']"),"Log In");
		clickButton(log,"Login");

		WebElement home=findElement(By.xpath("//*[@class='xrh-icon xrh-appbutton--caret xrh-icon-svg']"),"home");
		clickButton(home,"home");

		Thread.sleep(3000);
		WebElement myxero=findElement(By.xpath("//a[contains(text(),'My Xero')]"),"myxero");
		clickButton(myxero,"myxero");
		delaytime();

		Set<String> getAllwindows=driver.getWindowHandles();

		String[] getwin=getAllwindows.toArray(new String[getAllwindows.size()]);

		System.out.println(getAllwindows.size());

		driver.switchTo().window(getwin[1]);

		System.out.println(driver.getCurrentUrl());

		WebElement org=findElement(By.xpath("//a[@class='x-btn green']"),"Add Organisation ");
		  clickButton(org,"Add Organisation ");
		  WebElement name = findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[1]/span[1]/div[1]/div[1]/div[1]/div[1]/table[2]/tbody[1]/tr[1]/td[2]/input[1]"), "name");
		  name.sendKeys("Self");
		  WebElement country = findElement(By.xpath("//input[@id='countryCmb-inputEl']"), "country");
		  country.sendKeys("United States");
		  WebElement timeselect = findElement(By.xpath("//*[@id=\"cmbTimeZone-inputEl\"]"),"Timeselect");
		  timeselect.sendKeys("(UTC-08:00) Pacific Time (US & Canada)");
		  WebElement industry = findElement(By.xpath("//input[@id='industrysearchcombofield-1025-inputEl']"), "industry");
		  industry.sendKeys("Accounting");
		  Thread.sleep(4000);
		  WebElement buyNow = findElement(By.id("simplebutton-1035"), "BuyNow");
		  buyNow.click();
		  //String selectplan = findElement(By.xpath("//span[contains(text(),'Select a plan')]"), "Select plan").getText();
		  //System.out.println(validate(selectplan,"Select a plan"));
		  Thread.sleep(3000);
		  WebElement Early = findElement(By.xpath("//section[@id='Early']//div[@class='xui-styledcheckboxradio--radio']"),"Radio Button");
		  Early.click();
		  WebElement continueButton = findElement(By.id("continueButton"), "continueButton");
		  clickButton(continueButton, "continueButton");
		  WebElement contactAddress = findElement(By.name("contactAddress"), "contactAddress");
		  enterText(contactAddress, "contactAddress","3450 granada ave");
		  WebElement contactCity = findElement(By.name("contactCity"), "contactCity");
		  enterText(contactCity, "contactCity","santa clara");
		  WebElement postal = findElement(By.xpath("//div[@id='postalAddress']//button[@type='button']"), "postal");
		  clickButton(postal, "postal");
		  WebElement postalselect = findElement(By.xpath("//li[@id='California']//button[@type='button']"), "postalselect");
		  postalselect.click();
		  WebElement contactPostalCode = findElement(By.id("contactPostalCode"), "contactPostalCode");
		  enterText(contactPostalCode,"contactPostalCode", "95051");
		  WebElement continueButton1 = findElement(By.xpath("//button[contains(text(),'Continue to Review & Pay')]"), "continueButton1");
		  clickButton(continueButton1, "continueButton1");
		  WebElement frame=findElement(By.xpath("//*[@id=\"stripe-card-number\"]/div/iframe"),"card number iframe");
		  driver.switchTo().frame(frame);
		  System.out.println("Switched to frame"+ frame);
		  WebElement cardnumber = findElement(By.name("cardnumber"), "cardnumber");
		  cardnumber.sendKeys("12345"); 
		  driver.switchTo().defaultContent();
		  WebElement frame2=findElement(By.xpath("//*[@id=\"stripe-card-cvc\"]/div/iframe"),"card cvc iframe");
		  driver.switchTo().frame(frame2);
		  WebElement cardcvc = findElement(By.name("cvc"), "cardcvc");
		  cardcvc.sendKeys("1231");
		  driver.switchTo().defaultContent();
		  WebElement cardholdername = findElement(By.xpath("//*[@id=\"stripe-cardholder-name\"]"), "card holder name");
		  cardholdername.sendKeys("abc");
		  WebElement frame1=findElement(By.xpath("//*[@id=\"stripe-card-expiry\"]/div/iframe"),"card expiry iframe");
		  driver.switchTo().frame(frame1);
		  WebElement cardexpiry = findElement(By.name("exp-date"), "cardexpiry");
		  cardexpiry.sendKeys("3/12/2020"); 
		  driver.switchTo().defaultContent();
		  WebElement continueButton2 = findElement(By.id("continueButton"), "Confirm Purchase");
		  clickButton(continueButton2, "Confirm Purchase");
		  }catch(Exception E)
		  {
		  endReport();
		  }
		 }
}


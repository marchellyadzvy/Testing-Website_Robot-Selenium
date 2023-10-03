package stepDefinition;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SmokeTest {
	WebDriver driver;
	JavascriptExecutor js;
	
//===================1.==============LOGIN========================== FORM
//		@Given("^open chrome and start application$")
//		public void open_chrome_and_start_application() throws Throwable {
//			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32 (1)\\chromedriver.exe");
//			driver = new ChromeDriver();
//			
//			driver.manage().window().maximize();
//			
//			driver.get("https://www.elevenia.co.id/");
//		    Thread.sleep(3000);
//		}
//		@When("^I enter valid email and valid password$")
//		public void I_enter_valid_email_and_valid_password() throws Throwable {
//			Thread.sleep(1500);
//			driver.findElement(By.xpath("//*[@id=\"mainPopBanner\"]/div[2]/a")).click();
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("//*[@id=\"gnbLogin\"]/a")).click();
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("//*[@id=\"loginName\"]")).sendKeys("novarat788@gmail.com");
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("//*[@id=\"passWord\"]")).sendKeys("Coba12345.");  
//			Thread.sleep(2000);
//		}
//		
//		@Then("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {	
//		driver.findElement(By.xpath("//*[@id=\"container\"]/article/div[1]/fieldset/div/a")).click();
//		Thread.sleep(1500);
//		driver.findElement(By.xpath("//*[@id=\"mainPopBanner\"]/div[2]/a")).click();
//		}

	
////===============================2. CHANGE ACCOUNT INFORMATION===========FORM
//		@Given("^open chrome and start application$")
//		public void open_chrome_and_start_application() throws Throwable {
//			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32 (1)\\chromedriver.exe");
//			driver = new ChromeDriver();
//			driver.manage().window().maximize();
//			js = (JavascriptExecutor) driver;
//			driver.get("https://www.elevenia.co.id/");
//	    	Thread.sleep(3000);
//		}
//		@When("^I enter valid email and valid password$")
//		public void I_enter_valid_email_and_valid_password() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"mainPopBanner\"]/div[2]/a")).click();
//			driver.findElement(By.xpath("//*[@id=\"gnbLogin\"]/a")).click();
//			driver.findElement(By.xpath("//*[@id=\"loginName\"]")).sendKeys("novarat788@gmail.com");
//			driver.findElement(By.xpath("//*[@id=\"passWord\"]")).sendKeys("Coba12345.");  	
//			}
//		@When("^I can login successfully$")
//		public void I_can_login_successfully() throws Throwable {	
//			driver.findElement(By.xpath("//*[@id=\"container\"]/article/div[1]/fieldset/div/a")).click();
//			Thread.sleep(1500);
//			driver.findElement(By.xpath("//*[@id=\"mainPopBanner\"]/div[2]/a")).click();
//			}
//		@When("^I click profile$")
//		public void I_click_profile() throws Throwable {
//			driver.findElement(By.xpath("//*[@id=\"gnbUserNm\"]/a")).click();
//			}
//		@When("I fill address")
//		public void i_fill_address() throws InterruptedException {
//			Thread.sleep(5000);
//			js.executeScript("window.scrollBy(0,500);");
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("//*[@id=\"skn_left_content\"]/nav/ul/li[5]/ul/li[1]/a")).click();
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("//*[@id=\"mem_pwd\"]")).sendKeys("Coba12345.");
//			driver.findElement(By.xpath("//*[@id=\"container\"]/section[2]/form/div/div/a[1]")).click();
//			Thread.sleep(2000);
//			js.executeScript("window.scrollBy(0,400);");
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("//*[@id=\"container\"]/section[2]/form/div[7]/table/tbody/tr[7]/td/ul/li[2]/input")).sendKeys("Laguboti");
//			Thread.sleep(2000);
//			js.executeScript("window.scrollBy(0,400);");
//			}
//		@Then("I have added my address")
//		public void i_have_added_my_address() throws Throwable {
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("//*[@id=\"confirmButton\"]")).click();
//			}
		
//==================3. Shipping Address List============FORM
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32 (1)\\chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		js = (JavascriptExecutor) driver;
//		driver.get("https://www.elevenia.co.id/");
//    	Thread.sleep(3000);
//	}
//
//	@When("^I enter valid email and valid password$")
//	public void I_enter_valid_email_and_valid_password() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"mainPopBanner\"]/div[2]/a")).click();
//	driver.findElement(By.xpath("//*[@id=\"gnbLogin\"]/a")).click();
//	driver.findElement(By.xpath("//*[@id=\"loginName\"]")).sendKeys("novarat788@gmail.com");
//	driver.findElement(By.xpath("//*[@id=\"passWord\"]")).sendKeys("Coba12345.");  
//	}
//	
//	@When("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {	
//		driver.findElement(By.xpath("//*[@id=\"container\"]/article/div[1]/fieldset/div/a")).click();
//		Thread.sleep(1500);
//		driver.findElement(By.xpath("//*[@id=\"mainPopBanner\"]/div[2]/a")).click();
//		}
//	@When("^I click profile$")
//	public void I_click_profile() throws Throwable {
//	driver.findElement(By.xpath("//*[@id=\"gnbUserNm\"]/a")).click();
//	}
//	
//	@When("I click button add")
//	public void i_click_button_add() throws InterruptedException {
//		Thread.sleep(2000);
//		js.executeScript("window.scrollBy(0,500);");
//		driver.findElement(By.xpath("//*[@id=\"skn_left_content\"]/nav/ul/li[5]/ul/li[3]/a")).click();
//		Thread.sleep(1500);
//		driver.findElement(By.xpath("//*[@id=\"btnAddAddress\"]")).click();
//		}
//	
//	@When("^I add new shipping address$")
//	public void i_add_new_shipping_address() throws Throwable {
//		Thread.sleep(2000); 
//		driver.findElement(By.xpath("//*[@id=\"addrNM\"]")).sendKeys("AKSESORIS KOREA KW");
//		driver.findElement(By.xpath("//*[@id=\"rcvrNM\"]")).sendKeys("Nova Jleg");
//	}
//	
//	@When("^I choose Bengkulu$")
//	public void i_choose_Bengkulu() throws InterruptedException {
//		Thread.sleep(400);
//		driver.findElement(By.xpath("//*[@id=\"idProvince_chosen\"]/a/span")).click();
//		Thread.sleep(400);
//		driver.findElement(By.xpath("//*[@id=\"idProvince_chosen\"]/div/ul/li[5]")).click();
//		Thread.sleep(200);
//	}
//	
//	@When("^I choose district$")
//	public void i_choose_district() throws InterruptedException {
//		Thread.sleep(400);
//		driver.findElement(By.xpath("//*[@id=\"idCity_chosen\"]/a/span")).click();
//		Thread.sleep(400);
//		driver.findElement(By.xpath("//*[@id=\"idCity_chosen\"]/div/ul/li[5]")).click();
//		Thread.sleep(200);
//	}
//	
//	@When("^I enter another address$")
//	public void i_enter_another_address() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"dtlsAddr\"]")).sendKeys("Bengkulu Suci Banget");
//	}
//	
//	@When("^I enter postalcode$")
//	public void i_enter_postalcode() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"postalCode\"]")).sendKeys("27561");
//	}
//	
//	@When("^I enter number phone$")
//	public void i_enter_number_phone() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"prtblTlphnNO1\"]")).sendKeys("0823");
//		driver.findElement(By.xpath("//*[@id=\"prtblTlphnNO2\"]")).sendKeys("45362891");
//	}
//	
//	@Then("I can add new shipping address")
//	public void i_can_add_new_shipping_address() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"AddAddressDialog\"]/form/section/div/div/a[2]")).click();
//	}
	
	//=====4. FUNGSI berikan pertanyaan FORM========================================
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32 (1)\\chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		js = (JavascriptExecutor) driver;
//		driver.get("https://www.elevenia.co.id/");
//    	Thread.sleep(3000);
//	}
//
//	@When("^I enter valid email and valid password$")
//	public void I_enter_valid_email_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"mainPopBanner\"]/div[2]/a")).click();
//		driver.findElement(By.xpath("//*[@id=\"gnbLogin\"]/a")).click();
//		driver.findElement(By.xpath("//*[@id=\"loginName\"]")).sendKeys("novarat788@gmail.com");
//		driver.findElement(By.xpath("//*[@id=\"passWord\"]")).sendKeys("Coba12345.");  
//	}
//	
//	@When("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {	
//		driver.findElement(By.xpath("//*[@id=\"container\"]/article/div[1]/fieldset/div/a")).click();
//		Thread.sleep(1500);
//		driver.findElement(By.xpath("//*[@id=\"mainPopBanner\"]/div[2]/a")).click();
//	}
//	
//	@When("^I search item$")
//	public void i_search_item() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"AKCKwd\"]")).sendKeys("Sepatu Sport");
//	}
//	
//	@When("^I get my item$")
//	public void i_get_my_item() throws Throwable {	
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"AKCFrm\"]/div/button")).click();
//	}
//	
//	@When("^I choose my item$")
//	public void i_choose_my_item() throws Throwable {
//		Thread.sleep(2500);
//		js.executeScript("window.scrollBy(0,350);");
//		driver.findElement(By.xpath("//*[@id=\"prod_29350089\"]/div/a[2]")).click();
//	}
//	
//	@When("^I choose kolom tanya jawab$")
//	public void i_choose_kolom_tanya_jawab() throws Throwable {
//		Thread.sleep(2500);
//		js.executeScript("window.scrollBy(0,300);");
//		js.executeScript("document.querySelector(\"body > section > section > div.prdDetails.row-fluid > div.gridF > div.card.no-pad > div > div > div.seaTabs_switch > a.seaTabs_tab.forum_qna > span\").click()");
//	}
//	
//	@When("^I give my question$")
//	public void i_give_my_question() throws Throwable {
//		Thread.sleep(2500);
//		js.executeScript("window.scrollBy(0,250);");
//		driver.findElement(By.xpath("//*[@id=\"parentCommentArea29350089\"]")).sendKeys("Apakah produk ini masih ada?");
//	}
//	
//	@Then("^I send my question$")
//	public void i_send_my_question() throws Throwable {
//		js.executeScript("window.scrollBy(0,450);");
//		driver.findElement(By.xpath("//*[@id=\"dvPrdQnAList\"]/div[1]/div[2]/div[2]/a")).click();
//	}

	//=====5. FUNGSI Searching Item========================================
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32 (1)\\chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		js = (JavascriptExecutor) driver;
//		driver.get("https://www.elevenia.co.id/");
//    	Thread.sleep(3000);
//	}
//
//	@When("^I enter valid email and valid password$")
//	public void I_enter_valid_email_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"mainPopBanner\"]/div[2]/a")).click();
//		driver.findElement(By.xpath("//*[@id=\"gnbLogin\"]/a")).click();
//		driver.findElement(By.xpath("//*[@id=\"loginName\"]")).sendKeys("novarat788@gmail.com");
//		driver.findElement(By.xpath("//*[@id=\"passWord\"]")).sendKeys("Coba12345.");  
//	}
//	
//	@When("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {	
//		driver.findElement(By.xpath("//*[@id=\"container\"]/article/div[1]/fieldset/div/a")).click();
//		Thread.sleep(1500);
//		driver.findElement(By.xpath("//*[@id=\"mainPopBanner\"]/div[2]/a")).click();
//	}
//	
//	@When("^I search item$")
//	public void i_search_item() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"AKCKwd\"]")).sendKeys("Pakaian Bayi");
//	}
//	
//	@Then("^I get my item$")
//	public void i_get_my_item() throws Throwable {	
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"AKCFrm\"]/div/button")).click();
//	}
	
	//=====6. FUNGSI ADD TO CART========================================
//	@Given("^open chrome and start application$")
//	public void open_chrome_and_start_application() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32 (1)\\chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		js = (JavascriptExecutor) driver;
//		driver.get("https://www.elevenia.co.id/");
//    	Thread.sleep(3000);
//	}
//
//	@When("^I enter valid email and valid password$")
//	public void I_enter_valid_email_and_valid_password() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"mainPopBanner\"]/div[2]/a")).click();
//		driver.findElement(By.xpath("//*[@id=\"gnbLogin\"]/a")).click();
//		driver.findElement(By.xpath("//*[@id=\"loginName\"]")).sendKeys("novarat788@gmail.com");
//		driver.findElement(By.xpath("//*[@id=\"passWord\"]")).sendKeys("Coba12345.");  
//	}
//	
//	@When("^I can login successfully$")
//	public void I_can_login_successfully() throws Throwable {	
//		driver.findElement(By.xpath("//*[@id=\"container\"]/article/div[1]/fieldset/div/a")).click();
//		Thread.sleep(1500);
//		driver.findElement(By.xpath("//*[@id=\"mainPopBanner\"]/div[2]/a")).click();
//	}
//	
//	@When("^I search item$")
//	public void i_search_item() throws Throwable {
//		driver.findElement(By.xpath("//*[@id=\"AKCKwd\"]")).sendKeys("Pakaian Bayi");
//	}
//	
//	@When("^I get my item$")
//	public void i_get_my_item() throws Throwable {	
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"AKCFrm\"]/div/button")).click();
//	}
//	
//	@Then("^I choose my item$")
//	public void i_choose_my_item() throws Throwable {
//		Thread.sleep(2500);
//		driver.findElement(By.xpath("//*[@id=\"prod_26684360\"]/div")).click();	
//	}
//	
//	@When("^I add to cart$")
//	public void i_add_to_cart() {
//		js.executeScript("document.querySelector(\"section > section > form:nth-child(2) > div.compWrap.card > div.gridC > div.btnArea > a.btnStyle.btnFlat.btnL.btnOrangeW\").click()");
//	}
//	
//	@Then("^My item is already in my cart$")
//	public void my_item_is_already_in_my_cart() throws Throwable {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"mo_lay144\"]/div[2]/a[1]")).click();
//		Thread.sleep(3000);
//	}
	
	//=====7. FUNGSI hapus item cart========================================
	@Given("^open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		js = (JavascriptExecutor) driver;
		driver.get("https://www.elevenia.co.id/");
    	Thread.sleep(3000);
	}

	@When("^I enter valid email and valid password$")
	public void I_enter_valid_email_and_valid_password() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"mainPopBanner\"]/div[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"gnbLogin\"]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"loginName\"]")).sendKeys("novarat788@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"passWord\"]")).sendKeys("Coba12345.");  
	}
	
	@When("^I can login successfully$")
	public void I_can_login_successfully() throws Throwable {	
		driver.findElement(By.xpath("//*[@id=\"container\"]/article/div[1]/fieldset/div/a")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//*[@id=\"mainPopBanner\"]/div[2]/a")).click();
	}
	
	@When("^I search item$")
	public void i_search_item() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"AKCKwd\"]")).sendKeys("Pakaian Bayi");
	}
	
	@When("^I get my item$")
	public void i_get_my_item() throws Throwable {	
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"AKCFrm\"]/div/button")).click();
	}
	
	@When("^I choose my item$")
	public void i_choose_my_item() throws Throwable {
		Thread.sleep(2500);
		driver.findElement(By.xpath("//*[@id=\"prod_26684360\"]/div")).click();	
	}
	
	@When("^I add to cart$")
	public void i_add_to_cart() {
		js.executeScript("document.querySelector(\"section > section > form:nth-child(2) > div.compWrap.card > div.gridC > div.btnArea > a.btnStyle.btnFlat.btnL.btnOrangeW\").click()");
	}
	
	@When("^My item is already in my cart$")
	public void my_item_is_already_in_my_cart() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"mo_lay144\"]/div[2]/a[1]")).click();
		Thread.sleep(3000);
	}
	
	@When("^I delete my item$")
	public void i_delete_my_item() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"frmTmall\"]/table/tbody/tr/td[7]/a[3]")).click();
	}
	
	@Then("^I successfully deleted my item in cart$")
	public void I_successfully_deleted_my_item_in_cart() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"chkDelPopY\"]")).click();	
	}
}


package demoblaze;

public class logintest {

		WebDriver driver;

	@BeforeMethod
	void initialization() {
		driver = new ChromeDriver();
		driver.get("https://www.demoblaze.com/index.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));

	}

	@AfterMethod(enabled = true)
	void quit() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}

	@Test
	void name() throws InterruptedException {

		WebElement nameofpage = driver.findElement(By.xpath("//a[contains(text(),'PRODUCT STORE')]"));
		String pagename = nameofpage.getText();
		String expectedname = "PRODUCT STORE";
		
		
		System.out.println(pagename);

		Assert.assertEquals(expectedname, pagename);



	}

	@Test(priority = 1)

	void Signup() throws InterruptedException {

		driver.findElement(By.xpath("//a[text() = \"Sign up\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id = \"sign-username\"]")).sendKeys("tasnim");
		driver.findElement(By.xpath("//input[@id = \"sign-password\"]")).sendKeys("abcd123");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("button[onclick='register()']")).click();

	}

	@Test(priority = 2)

	void Login() throws InterruptedException {
		driver.findElement(By.xpath("//a[@id = \"login2\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='loginusername']")).sendKeys("tasnim");
		driver.findElement(By.xpath("//input[@id='loginpassword']")).sendKeys("abcd123");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("button[onclick='logIn()']")).click();

	}

	@Test(priority = 3)
	void buymobile() throws InterruptedException {
		Thread.sleep(2000);

		driver.findElement(By.xpath("/html[1]/body[1]/div[5]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/h4[1]/a[1]"))
				.click();
		driver.findElement(By.xpath("//a[contains(@onclick,'addToCart(1)')]")).click();
		
		driver.navigate().back();
		
		driver.navigate().back();
		driver.findElement(By.xpath("//a[contains(text(), 'Iphone 6 32gb')]")).click();
		driver.findElement(By.xpath("//a[contains(@onclick,'addToCart(5)')]")).click();
		driver.navigate().back();
		
		driver.navigate().refresh();
		driver.findElement(By.xpath("//a[@id = \"cartur\"]")).click();
		
		
		driver.navigate().refresh();
		
		driver.findElement(By.xpath("//button[@class = \"btn btn-success\"]")).click();
		
	}

	@Test(priority = 4)
	void buylaptop() throws InterruptedException {
		
		driver.findElement(By.xpath("//a[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[5]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/h4[1]/a[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(@onclick,'addToCart(9)')]")).click();
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().refresh();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Sony vaio i5')]")).click();
		driver.navigate().refresh();
		
		driver.findElement(By.xpath("//a[contains(@onclick,'addToCart(8)')]")).click();
		driver.navigate().refresh();
		driver.findElement(By.xpath("//a[@id = \"cartur\"]")).click();
		driver.navigate().refresh();
		driver.findElement(By.xpath("//button[@class = \"btn btn-success\"]")).click();
		
}
	
	@Test(enabled = false)
	void buymonitor() throws InterruptedException {
		driver.findElement(By.xpath("//a[contains(text(),'Monitors')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Apple monitor 24')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(@onclick,'addToCart(10)')]")).click();
		driver.navigate().back();
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'ASUS Full HD')]")).click();
		driver.findElement(By.xpath("//a[contains(@onclick,'addToCart(14)')]")).click();
		driver.navigate().back();
		
		driver.navigate().refresh();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@id = \"cartur\"]")).click();
		driver.navigate().refresh();
		driver.findElement(By.xpath("//button[@class = \"btn btn-success\"]")).click();
		
	}
	
	

	
	
	
	
}

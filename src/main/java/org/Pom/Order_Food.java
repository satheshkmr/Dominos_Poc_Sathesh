package org.Pom;

import javax.xml.xpath.XPath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.bytebuddy.asm.MemberSubstitution.FieldValue;

public class Order_Food {

	private WebDriver driver;

	@FindBy(xpath = "//button[text()='ORDER ONLINE NOW']")
	private WebElement Order_online;

	@FindBy(xpath = "//span[@class='checkmark']")
	private WebElement Delivery_Button;

	@FindBy(xpath = "//input[contains(@placeholder,'Enter Area')]")
	private WebElement Enter_area;

	@FindBy(xpath = "(//span[@class='lst-desc-main ellipsis'])[1]")
	private WebElement location_click;

	@FindBy(xpath = "//span[text()='VEG PIZZA']")
	private WebElement VEG_PIZZA;

	@FindBy(xpath = "(//span[text()='Margherita']/../../div[@class='itm-dsc__actn__adCrt']/div/button/span)[2]")
	private WebElement mar_add_cart;

	@FindBy(xpath = "//span[text()='NO THANKS']")
	private WebElement No_thanks;

	@FindBy(xpath ="(//div[@class='crt-cntnt']//child::div[@data-label='increase'])[1]")
	private WebElement mar_QTY;

	@FindBy(xpath ="(//span[text()='Peppy Paneer']/../../div[@class='itm-dsc__actn__adCrt']/div/button/span)[2]")


	private WebElement peppy_panner_cart;

	@FindBy(xpath = "(//div[@class='crt-cntnt']//child::div[@data-label='increase'])[2]")
	private WebElement peppy_panner_qty;

	@FindBy(xpath = "(//span[text()='Primavera Gourmet-Pizza']/../../div[@class='itm-dsc__actn__adCrt']/div/button/span)[3]")
	private WebElement Gourmet_cart;

	@FindBy(xpath ="(//div[@class='sc-iELTvK cYbiOn']//child::div[@data-label='increase'])[6]")

	private WebElement Gourmet_qty;


	@FindBy(xpath = "(//div[@class='crt-cntnt']//child::div[@data-label='decrease'])[1]")
	private WebElement mar_reduce_qty;

	@FindBy(xpath = "//span[text()='BEVERAGES']")
	private WebElement BEVERAGES;

	@FindBy(xpath = "//span[text()='Pepsi 475ml']/../../div[@class='itm-dsc__actn__adCrt']/div/button/span")

	private WebElement pepsi_cart;

	@FindBy(xpath ="//div[@data-label='Pepsi 475ml']//child::div[@data-label='increase']")

	private WebElement pepsi_add_qty;


	@FindBy(xpath = "//div[@data-label='Pepsi 475ml']//child::div[@data-label='decrease']")

	private WebElement pepsi_reduce_qty;

	@FindBy(xpath = "//button[@data-label='miniCartCheckout']")

	private WebElement checkout;

	@FindBy(xpath = "//button[@data-label='Place Order']")

	private WebElement place_order;

	@FindBy(xpath = "(//button[@class='ng-binding'])[1]")
	private WebElement notification;
	
	@FindBy(xpath = "//div[@data-label='Veg Pizza']/div[6]/div/div/div[1]/div/div[3]/span")
	private WebElement assert_mar;
	
	@FindBy(xpath = "//div[@data-label='Veg Pizza']/div[9]/div/div/div[1]/div/div[3]/span")
	private WebElement assert_panner;
	
	@FindBy(xpath = "//div[@data-label='Veg Pizza']/div[7]/div/div/div[1]/div/div[3]/span")
	private WebElement assert_gourt;
	
	@FindBy(xpath="//div[@class='menu-right']/div/div/div[2]/div[1]/span[2]")
	private WebElement Checkout_subtotal;
	
	@FindBy(xpath = "//div[@data-label='Beverages']/div[1]/div/div/div[1]/div/div[3]/span")
	private WebElement assert_pepsi;
	
	@FindBy(xpath = "//div[@class='right']/div/div[6]/div/div/div[1]/span[2]/span")
	private WebElement aseert_placeorder;


	public Order_Food (WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver , this);

	}


	public WebElement getOrder_online() {
		return Order_online;
	}


	public WebElement getDelivery_Button() {
		return Delivery_Button;
	}


	public WebElement getEnter_area() {
		return Enter_area;
	}


	public WebElement getVEG_PIZZA() {
		return VEG_PIZZA;
	}


	public WebElement getMar_add_cart() {
		return mar_add_cart;
	}


	public WebDriver getDriver() {
		return driver;
	}


	public WebElement getMar_QTY() {
		return mar_QTY;
	}


	public WebElement getPeppy_panner_cart() {
		return peppy_panner_cart;
	}


	public WebElement getPeppy_panner_qty() {
		return peppy_panner_qty;
	}


	public WebElement getGourmet_cart() {
		return Gourmet_cart;
	}


	public WebElement getGourmet_qty() {
		return Gourmet_qty;
	}


	public WebElement getMar_reduce_qty() {
		return mar_reduce_qty;
	}


	public WebElement getBEVERAGES() {
		return BEVERAGES;
	}


	public WebElement getPepsi_cart() {
		return pepsi_cart;
	}


	public WebElement getPepsi_add_qty() {
		return pepsi_add_qty;
	}


	public WebElement getPepsi_reduce_qty() {
		return pepsi_reduce_qty;
	}


	public WebElement getCheckout() {
		return checkout;
	}


	public WebElement getPlace_order() {
		return place_order;
	}


	public WebElement getNotification() {
		return notification;
	}


	public WebElement getLocation_click() {
		return location_click;
	}


	public WebElement getNo_thanks() {
		return No_thanks;
	}


	public WebElement getAssert_mar() {
		return assert_mar;
	}


	public WebElement getAssert_panner() {
		return assert_panner;
	}


	public WebElement getAssert_gourt() {
		return assert_gourt;
	}


	public WebElement getAssert_pepsi() {
		return assert_pepsi;
	}


	public WebElement getAseert_placeorder() {
		return aseert_placeorder;
	}


	public WebElement getCheckout_subtotal() {
		return Checkout_subtotal;
	}


}



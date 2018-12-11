package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class homeScreen {
	
	public homeScreen(AndroidDriver<MobileElement> driver) {

		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.TextView")
	public WebElement homeIcon;
	
	@AndroidFindBy(id = "com.imaginecurve.curve.dev:id/join_us")
	public WebElement getStartedButton;
	

	@AndroidFindBy(id = "Open")
	public WebElement open;

	@AndroidFindBy(id = "Pick Card")
	public WebElement pickCard;

	@AndroidFindBy(id = "Add Card")
	public WebElement addCard;

	@AndroidFindBy(id = "com.imaginecurve.curve.dev:id/fab")
	public WebElement moreOptions;
	
	@AndroidFindBy(id = "com.imaginecurve.curve.dev:id/addCardButton")
	public WebElement addCardButton;
	
	@AndroidFindBy(id = "android:id/button1")
	public WebElement addYourCardAlertOkayButton;
	
	@AndroidFindBy(id = "com.android.packageinstaller:id/permission_deny_button")
	public WebElement cameraPermissonDenyButton;
	
	@AndroidFindBy(id = "com.imaginecurve.curve.dev:id/button_add")
	public WebElement cardInformationButton;
	
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Switch")
	public WebElement sendEmailReceiptToggle;
	
	@AndroidFindBy(id = "android:id/button1")
	public WebElement upgradeToCurveBlackUpgradeButton;
	
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.Button")
	public WebElement upgradeNowButton;
	
	@AndroidFindBy(id = "Close")
	public WebElement backButton;
	
	@AndroidFindBy(id = "Navigate up")
	public WebElement xButton;
	
	@AndroidFindBy(id = "com.imaginecurve.curve.dev:id/menu_item_next")
	public WebElement retailerSelectionNextButton;
	
	@AndroidFindBy(id = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.Button")
	public WebElement retailerSelectionConfirmButton;
	
	
	

}


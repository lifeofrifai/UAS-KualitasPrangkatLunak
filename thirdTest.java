import java.net.MalformedURLException;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class thirdTest extends base{

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		
		AndroidDriver<AndroidElement> driver =capabilities();
		
	
		
//		driver.findElementByXPath("//android.widget.FloatingActionButton[@text='']").click();
		

		
		
		driver.findElementById("com.example.note:id/fab_add").click();
		driver.findElementByXPath("//android.widget.ImageButton[@content-desc='Navigate up']").click();
		driver.findElementByXPath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[2]").click();
		
		
		
		
		

	}

}

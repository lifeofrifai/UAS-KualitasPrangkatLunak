import java.net.MalformedURLException;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class firstTest extends base{

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		
		AndroidDriver<AndroidElement> driver =capabilities();
		
	
		
//		driver.findElementByXPath("//android.widget.FloatingActionButton[@text='']").click();
		

		
		
//		driver.findElementById("com.example.note:id/fab_add").click();
		
		driver.findElementByXPath("//android.widget.ImageButton[@index='1']").click();
		
		
		
		
		
		

	}

}

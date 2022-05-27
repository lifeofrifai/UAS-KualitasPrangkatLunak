import java.net.MalformedURLException;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class secondTest extends base{

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		
		AndroidDriver<AndroidElement> driver =capabilities();
		
	
		
//		driver.findElementByXPath("//android.widget.FloatingActionButton[@text='']").click();
		

//		driver.findElementByXPath("//android.widget.ImageButton[@index='1']").click();
//		driver.findElementByXPath("//android.widget.EditText[@text='Judul Buku']").sendKeys("Laskar Pelangi");
//		driver.findElementByXPath("//android.widget.EditText[@text='Penulis']").sendKeys("Andrea Hirata");
//		driver.findElementByXPath("//android.widget.Button[@text='SIMPAN']").click();
		
//		driver.findElementById("com.example.note:id/fab_add").click();
//		driver.findElementById("com.example.note:id/edt_title").sendKeys("Laskar Pelangi");
//		driver.findElementById("ccom.example.note:id/edt_description").sendKeys("Andrea Hirata");
//		driver.findElementById("com.example.note:id/btn_submit").click();
		
		
		
		driver.findElementByXPath("//android.widget.ImageButton[@index='1']").click();
		driver.findElementByXPath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.EditText").sendKeys("Laskar Pelangi");
		driver.findElementByXPath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.EditText").sendKeys("Andrea Hirata");
		driver.findElementByXPath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.Button").click();
		
		
		
//		driver.findElementByXPath("//android.widget.EditText[@text='Judul Buku']").sendKeys("Laskar Pelangi");
//		driver.findElementByXPath("//android.widget.EditText[@text='Penulis']").sendKeys("Andrea Hirata");
//		driver.findElementByXPath("//android.widget.Button[@text='SIMPAN']").click();
		
		
		
		

	}

}

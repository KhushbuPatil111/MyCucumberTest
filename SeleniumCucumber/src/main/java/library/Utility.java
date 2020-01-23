package library;

import java.io.File;
import java.io.IOException;

import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

public class Utility {
	
	public static void CaptureScreenshot(WebDriver driver, String screenshotname) 
	{
		try {
			TakesScreenshot ts = (TakesScreenshot)driver;
			File ffile = ts.getScreenshotAs(OutputType.FILE);
			try {
				FileUtils.copyFile(ffile, new File("./Screenshots/"+screenshotname+".png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		} catch (WebDriverException e) {
			
			System.out.println("Exception while taking screenshot"+ e.getMessage());
		
		}
		
		System.out.println("Screenshot taken successfully!");
		
		
	}

}

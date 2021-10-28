package com.testingshastra.utility;

import java.awt.image.BufferedImage;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.imageio.ImageIO;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.testingshastra.keywords.UIKeywords;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;
import ru.yandex.qatools.ashot.shooting.ShootingStrategy;

public class TestListener implements ITestListener{
	
	UIKeywords keywords = UIKeywords.getInstance();
	
		public void onTestFailure(ITestResult result) {
			AShot ashot = new AShot();
			ShootingStrategy strategy = ShootingStrategies.viewportPasting(2000);
			ashot.shootingStrategy(strategy);
			Screenshot scr = ashot.takeScreenshot(UIKeywords.driver);
			BufferedImage img = scr.getImage();
			try {
				Date date = new Date();  
				SimpleDateFormat formatter = new SimpleDateFormat("dd-M-yyyy-hh-mm-ss");  
				String    strDate = formatter.format(date);
				String dir =System.getProperty("user.dir");
				System.out.println("dir:"+dir);
				String fileName = dir+"/screenshots/"+strDate+".jpg";
				ImageIO.write(img, "jpg", new File(fileName));
			} catch (Exception e) {
				e.printStackTrace();
			}			
		}
}
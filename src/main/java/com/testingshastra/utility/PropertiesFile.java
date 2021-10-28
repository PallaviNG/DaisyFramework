package com.testingshastra.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFile {
	public static String getProperty(String fileName, String key) {
		String value = "";
		String dir = System.getProperty("user.dir");
		String x = System.getProperty("x");
		try {
			FileInputStream fis = new FileInputStream(dir+fileName);
			Properties props = new Properties();
			props.load(fis);
			value = props.getProperty(key);
			
			fis.close();
		}
		catch(FileNotFoundException ex) {
			ex.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return value;
	}

	/**
	 * THis method returns the value of locator mentioned in ObjectRepository
	 * 
	 * @param key
	 */
	public static String getObject(String key) {
		String dir = System.getProperty("user.dir");
		String value = "";
		try {
			FileInputStream fis = new FileInputStream(dir + "/src/test/resources/ObjectRepository.properties");
			Properties prop = new Properties();
			prop.load(fis);
			value = prop.getProperty(key);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return value;

	}
}

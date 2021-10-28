package com.testingshastra.config;

import com.testingshastra.utility.PropertiesFile;

public class Application {
	private static final String FILEPATH = "/src/main/resources/application.properties";
	
	public void getBrowser() {
		PropertiesFile.getProperty(FILEPATH, "Chrome");
	}
	
	public void getAppURL() {
		PropertiesFile.getProperty(FILEPATH, "daisy.dev.app.url");
	}
}
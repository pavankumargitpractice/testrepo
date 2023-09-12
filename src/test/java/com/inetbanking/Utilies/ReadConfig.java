package com.inetbanking.Utilies;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ReadConfig {
	Properties pro;
	
	// below is the constructor when any object is created below constructor will be triggered and file will be loaded
	public ReadConfig(){
		File src= new File("./Configuration/Config.properties");
		try {
			FileInputStream fs= new FileInputStream(src);
			pro = new Properties();
			pro.load(fs);
		} catch (Exception e) {
			System.out.println("Error message is"+e.getMessage());
		}
			
		}
	
	public String getApplicationURL(){
		String url= pro.getProperty("baseURL");
		System.out.println(url);
		return url;
	}


	public String getUsername(){
		String username= pro.getProperty("username");
		return username;
	}
	
	public String getPassword(){
		String password= pro.getProperty("password");
		return password;
	}
	
	public String getChromePath(){
		String chromepath= pro.getProperty("chromepath");
		return chromepath;
	}

	public String getFirefoxPath() {
		// TODO Auto-generated method stub
		String firefoxpath= pro.getProperty("firefoxpath");
		return firefoxpath;
	}

	public String getIEPath() {
		String iepath= pro.getProperty("iepath");
		return iepath;
	}
	
}

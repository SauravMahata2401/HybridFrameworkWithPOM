package com.framework.utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigDataProvider {
	
	Properties pro;
	
	public ConfigDataProvider(){
		
		File src = new File("./Config/Config.properties");
		
		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public String getDatafromConfig(String KeyToSearch){
		
		return pro.getProperty(KeyToSearch);
	}

}

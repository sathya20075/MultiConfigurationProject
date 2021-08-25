package com.apps.mcp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class MultiConfigurationProject
{

	public static void main(String args[]) {
		
		
		String DEV_PROPS_PATH="C:\\Users\\LENOVO\\.jenkins\\workspace\\multi_configuration_test\\default\\devconfig.properties";
		String STAGING_PROPS_PATH="C:\\Users\\LENOVO\\.jenkins\\workspace\\multi_configuration_test\\default\\stagingconfig.properties";
		String TEST_PROPS_PATH="C:\\Users\\LENOVO\\.jenkins\\workspace\\multi_configuration_test\\default\\testconfig.properties";
		Properties props = new Properties();
		try {
			props.load(new FileReader(DEV_PROPS_PATH));
			props.load(new FileReader(STAGING_PROPS_PATH));
			props.load(new FileReader(TEST_PROPS_PATH));
			
			System.out.println("DEV DB URL -----------------> " + props.getProperty("DEV_DB_URL"));
			System.out.println("STAGING DB URL -----------------> " + props.getProperty("STAGING_DB_URL"));
			System.out.println("TEST DB URL -----------------> " + props.getProperty("TEST_DB_URL"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}

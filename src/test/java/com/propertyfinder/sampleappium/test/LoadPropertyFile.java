package com.propertyfinder.sampleappium.test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class LoadPropertyFile { 
		
	InputStream inputStream;
 
	public Properties getPropValues(String pfileNameEnv){
		Properties result = null;
		try {
			result = new Properties();
			inputStream = getClass().getClassLoader().getResourceAsStream(pfileNameEnv);
 
			if (inputStream != null) {
				result.load(inputStream);
			} else {
				throw new FileNotFoundException("property file '" + pfileNameEnv + "' not found in the classpath");
			}
					
		} catch (Exception e) {
			System.out.println("Exception: " + e);
		} finally {
			try {
				inputStream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return result;
	}
}



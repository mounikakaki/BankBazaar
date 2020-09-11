package com.spacexdata.utils;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.commons.collections4.functors.CatchAndRethrowClosure;

public class ProteryFile {
	
	FileInputStream fi;
	Properties prop;
	String value="";
		public String get(String s) {
			String dir = System.getProperty("user.dir");
			String current = dir+"/src/main/resources/config.properties";
			try {
				 fi = new FileInputStream(current);
				 prop = new Properties();
				 Properties prop = new Properties();
				 prop.load(fi);
				 value =prop.getProperty(s);
				 
			}
			catch(Exception e) {
				
			}

			return value;
			

		}
		
		
}

	


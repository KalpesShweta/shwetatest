package day2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
     Properties prop= new Properties();
	FileInputStream fis= new FileInputStream(System.getProperty("user.dir")+ 
			"/src/Config/config.properties");
	prop.load(fis);
	System.out.println(prop.getProperty("name"));
	System.out.println(prop.getProperty("desig"));
	System.out.println(prop.getProperty("dept"));
	System.out.println(prop.getProperty("age"));
	
	FileOutputStream fos= new FileOutputStream(System.getProperty("user.dir")+ 
			"/src/Config/config.properties");
	prop.setProperty("test", "testdata");
	prop.store(fos,null);
	System.out.println(prop.getProperty("test"));
	}

}

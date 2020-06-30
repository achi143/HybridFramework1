package test.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Readconfie {

	Properties pro;

	public Readconfie() {

		File f = new File("./ConfieProperties/confie.properties");

		try {

			FileInputStream fis = new FileInputStream(f);

			pro = new Properties();

			pro.load(fis);
		} catch (Exception e) {

			System.out.println("Exception is " + e.getMessage());
		}
	}

	public String getApplicationUrl() {

		String url = pro.getProperty("baseUrl");
		return url;
	}

	public String getUsername() {

		String username = pro.getProperty("Username");
		return username;
	}

	public String getpassword() {

		String password = pro.getProperty("password");
		return password;
	}

	public String getchromepath() {

		String chrome = pro.getProperty("chrome");
		return chrome;
	}

	public String getfirefoxpath() {

		String firefox = pro.getProperty("firefox");
		return firefox;
	}

	

}

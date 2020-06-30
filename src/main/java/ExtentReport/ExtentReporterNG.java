package ExtentReport;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReporterNG {
	
	static ExtentReports extent;
	
	public static ExtentReports extentReportGenerator() {
		

		String path = System.getProperty("user.dir")+"\\Reports\\index.html";
		
		ExtentSparkReporter reporter = new ExtentSparkReporter(path); // this is responce for creating the path
		
		reporter.config().setDocumentTitle("Automation results");
		
		reporter.config().setReportName("web Automation Testing");
		
		reporter.config().setTheme(Theme.DARK);
		
		extent = new ExtentReports(); // responce for driver our 
		
		extent.attachReporter(reporter);
		
		extent.setSystemInfo("Tester","Ashrith");
		
		return extent;
	}

}

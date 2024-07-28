package chat.automation.Template.actions;

import java.sql.Timestamp;
import java.util.Date;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class Demo {

	public static void main(String[] args) {
		{
	        Properties prop = System.getProperties();
	        Set<String> a = prop.stringPropertyNames();
	        Iterator<String> keys = a.iterator();
	        while (keys.hasNext())
	        {
	            String key = keys.next();
	            String value = System.getProperty(key);
	            System.out.println(key + "=" + value);
	        }
	        String myReportPath = new Timestamp(new Date().getTime()).toString().replace(" ", "").split(":")[0];
	        System.out.println(myReportPath);

		}
	}
}



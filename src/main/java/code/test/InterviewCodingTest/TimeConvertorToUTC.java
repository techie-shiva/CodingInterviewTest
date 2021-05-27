package code.test.InterviewCodingTest;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class TimeConvertorToUTC {
	public static void main(String[] args)   {
		String timezone = "UTC";
		localTimeToUTCConvertor(timezone);
		

	}

	public static String localTimeToUTCConvertor(String timezone)  {
		if (timezone.equalsIgnoreCase("UTC")) {
			// Date class object to get current date and time
			Date currentTime = new Date(); 

			//Formatting just current time from above date object
			DateFormat s = new SimpleDateFormat("HH:mm:ss");

			//Printing the UTC time for local time
			System.out.println("Local time : " + s.format(currentTime));


			// Setting the UTC timezone  for conversion
			s.setTimeZone(TimeZone.getTimeZone(timezone));


			String utcTime = s.format(currentTime);
			//Printing the UTC time for local time
			System.out.println("Time IN "+timezone+" : "+utcTime);
			
			return "UTC time converted";

		}
		else {
			System.out.println("Please use correct timezone");
			return "Please use correct timezone";
			
		}	
	
		
		
}
}
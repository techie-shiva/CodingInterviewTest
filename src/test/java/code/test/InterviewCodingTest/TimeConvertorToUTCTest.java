package code.test.InterviewCodingTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TimeConvertorToUTCTest {
	
	@Test
	public void testLocalTimeToUTCConvertorWithIncorrectTimeZone() {
		TimeConvertorToUTC localTimeToUTCConvertor = new TimeConvertorToUTC();
		 String test = localTimeToUTCConvertor.localTimeToUTCConvertor("PST");
		assertEquals("Please use correct timezone", test);
		
	}
	
	@Test
	public void testLocalTimeToUTCConvertorWithCorrectTimeZone() {
		TimeConvertorToUTC localTimeToUTCConvertor = new TimeConvertorToUTC();
		 String test = localTimeToUTCConvertor.localTimeToUTCConvertor("UTC");
		assertEquals("UTC time converted", test);
		
	}


}

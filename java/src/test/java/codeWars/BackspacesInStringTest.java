package codeWars;

import com.juanjo.katas.codeWars.BackspacesInString;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BackspacesInStringTest {
	
	private static BackspacesInString backspacesInString;
	
	private static String [] words = {"abc#d##c", "abc##d######", "#######", "", null};
	
	private static HashMap<String, String> inOutCases;
	
	@BeforeAll
	private static void initValues() {
		backspacesInString = new BackspacesInString();
		inOutCases = new HashMap<String, String>();
		inOutCases.put("abc##d######", "");
	  inOutCases.put("abc#d##c", "ac");
	  inOutCases.put("#######", "");
	  inOutCases.put("", "");
	}
	
	@Test
	public void testCleaning(){
		String stringToClean = "";
		
		//Iterate a Map with Java <=7
/*		for (Map.Entry<String, String> entry : inOutCases.entrySet()) {
			assertEquals(entry.getValue(), backspacesInString.cleanString(entry.getKey()));
		}*/
		
		//Iterate a Map with Java >=8
		inOutCases.forEach(
				(k, v) -> assertEquals(v, backspacesInString.cleanString(k))
		);
		
	}
	
	@Test
	public void testCleaningNullOrEmptyString() {
		String strNull = null;
		String strEmpty = "";
		
		assertEquals("", backspacesInString.cleanString(strNull));
		assertEquals("", backspacesInString.cleanString(strEmpty));
	}
    
}
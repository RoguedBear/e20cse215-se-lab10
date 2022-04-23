package e20cse215.lab10.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class TestAddString {
	
	private JUnitFunctions functions;

	@ParameterizedTest
    @CsvSource({
    	"'','',''", // empty string
    	"1,1,11",
    	"with,' space',with space"
    	})
	void testAddString(String string1, String string2, String expected) {
		String result = functions.addString(string1, string2);
		assertEquals(expected, result);
	}

}

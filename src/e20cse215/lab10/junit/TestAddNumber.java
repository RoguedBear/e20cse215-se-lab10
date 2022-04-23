package e20cse215.lab10.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class TestAddNumber {

	private JUnitFunctions functions;

	@ParameterizedTest
    @CsvSource({
    	"0, 0, 0",
    	"-1, -1, -2",
    	"1, 1, 2",
    	"99, 1, 100"
    	})
	void testAddNumber(int num1, int num2, int expected) {
		int result = functions.addNumbers(num1, num2);
		assertEquals(expected, result);
	}

}

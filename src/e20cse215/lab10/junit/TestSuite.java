package e20cse215.lab10.junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({TestAddNumber.class, TestAddString.class})
public class TestSuite {

}

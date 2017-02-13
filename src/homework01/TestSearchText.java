/**
 *
 */
package homework01;

import java.io.FileNotFoundException;

import org.junit.Test;

/**
 * @author Administrator
 *
 */
public class TestSearchText {

	@Test(expected = FileNotFoundException.class)
	public void testoutputMatchesList1() {
		SearchText.outputMatches("", "");
	}

	@Test
	public void testoutputMatchesList2() {
		SearchText.outputMatches("", "");
	}

}

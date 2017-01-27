import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 *
 */

/**
 * @author Administrator
 *
 */
public class SinchokuDodesuka {

	private static final String FIRST_STRING = "進捗";
	private static final String SECOND_STRING = "どう";
	private static final String THIRD_STRING = "です";
	private static final String FOURTH_STRING = "か？";

	private static List<String> SinchokuDodesukaList =
			Arrays.asList(FIRST_STRING,SECOND_STRING,THIRD_STRING,FOURTH_STRING);

	public static String getSinchokuDodesuka() {

		StringBuilder returnValue = new StringBuilder();
		Random rnd = new Random();
		while(!returnValue.toString().endsWith(FIRST_STRING + SECOND_STRING + THIRD_STRING + FOURTH_STRING)) {
			returnValue.append(SinchokuDodesukaList.get(rnd.nextInt(4)));
		}

		return returnValue.toString() ;
	}

	public static String getSinchokuDodesukaString() {
		String returnValue = "";
		Random rnd = new Random();
		while(!returnValue.endsWith(FIRST_STRING + SECOND_STRING + THIRD_STRING + FOURTH_STRING)) {
			returnValue += SinchokuDodesukaList.get(rnd.nextInt(4));
		}

		return returnValue;

	}

	public static String getSinchoduDodesukaStringBuffer() {
		StringBuffer returnValue = new StringBuffer();
		Random rnd = new Random();
		while(!returnValue.toString().endsWith(FIRST_STRING + SECOND_STRING + THIRD_STRING + FOURTH_STRING)) {
			returnValue.append(SinchokuDodesukaList.get(rnd.nextInt(4)));
		}

		return returnValue.toString() ;
	}

}

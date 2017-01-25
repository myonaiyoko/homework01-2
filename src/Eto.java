import java.util.ArrayList;
import java.util.List;

/**
 *
 */


/**
 * @author Myonai
 *
 */
public class Eto {

	private static List<String> etoList;

	public static String getEto(int year) {

		if(year < 1) {
			throw new IllegalArgumentException("紀元前は計算できません。");
		}

		if (etoList == null) {
			etoList = new ArrayList<String>();
			etoList.add("申");
			etoList.add("酉");
			etoList.add("戌");
			etoList.add("亥");
			etoList.add("子");
			etoList.add("丑");
			etoList.add("寅");
			etoList.add("卯");
			etoList.add("辰");
			etoList.add("巳");
			etoList.add("午");
			etoList.add("未");
		}
//		List<String> etoList = new ArrayList<String>();

		return etoList.get(year % 12);
	}

}

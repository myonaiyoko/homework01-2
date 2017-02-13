/**
 *
 */
package homework01;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Administrator
 *
 */
public class SearchText {

	private static final String ENCORDING = "MS932";

	public static void outputMatches(String pathname, String keyword) {
		List<String> matchesList = outputMatchesList(pathname, keyword);
		for (String s : matchesList) {
			System.out.println(s);
		}
	}

	private static List<String> outputMatchesList(String pathname, String keyword) {
		File file;
		FileInputStream fis;
		InputStreamReader isr;
		BufferedReader br;

		try {
			file = new File(pathname);
			fis = new FileInputStream(file);
			isr = new InputStreamReader(fis, ENCORDING);
			br = new BufferedReader(isr);

			List<String> matchesList = new ArrayList<String>();
			String line;
			for (int i = 1; (line = br.readLine()) != null; i++) {
				if (line.indexOf(keyword) > -1) {
					matchesList.add(String.valueOf(i) + line);
				}
			}

			br.close();

			return matchesList;

		} catch (FileNotFoundException e) {
			System.out.println(e);
			return null;
		} catch (IOException e) {
			System.out.println(e);
			return null;
		}
	}
}

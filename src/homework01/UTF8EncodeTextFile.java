package homework01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class UTF8EncodeTextFile {

	private static final String INPUT_ENCODING = "MS932";
	private static final String OUTPUT_ENCODING = "UTF8";
	private static final String ADD_FILENAME = ".utf-8";

	public static void encodeUTF8(String pathname) {

		File infile = new File(pathname);
		try {
			FileInputStream fis = new FileInputStream(infile);
			InputStreamReader isr = new InputStreamReader(fis, INPUT_ENCODING);
			BufferedReader br = new BufferedReader(isr);

			File outFile = new File(getOutFileName(pathname));
			PrintWriter pr = new PrintWriter(
					new BufferedWriter(new OutputStreamWriter(new FileOutputStream(outFile), OUTPUT_ENCODING)));
			String str;
			while ((str = br.readLine()) != null) {
				pr.println(str);
			}
			pr.close();
			br.close();
		} catch (FileNotFoundException e) {

		} catch (IOException e) {

		}

	}

	private static String getOutFileName(String infilename) {
		if (infilename == null) {
			return null;
		}

		int point = infilename.lastIndexOf(".");

		if (point >= 0) {
			return infilename.substring(0, point) + ADD_FILENAME + infilename.substring(point, infilename.length());
		} else {
			return infilename + ADD_FILENAME;
		}
	}

}

/**
 *
 */
package homework01;

import java.io.File;

/**
 * @author Administrator
 *
 */
public class FolderTree {

	protected static final String HEADER_SPACE = "  ";
	protected static final String TREE_SIGN = "┗";

	public static void outputTree(String pathname) {
		System.out.println(pathname);
		getFolderFileList(pathname, "");
	}

	private static void getFolderFileList(String pathname, String header) {
		header += HEADER_SPACE;
		File file = new File(pathname);
		for (File f : file.listFiles()) {
			String outString = header;
			outString += TREE_SIGN;
			System.out.println(outString + f.getName());
			if (f.isDirectory()) {
				getFolderFileList(f.getAbsolutePath(), header);
			}

		}
	}
}

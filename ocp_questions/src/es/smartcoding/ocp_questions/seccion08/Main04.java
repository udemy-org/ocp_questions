/**
 * 
 */
package es.smartcoding.ocp_questions.seccion08;

import java.io.File;

/**
 * @author pep
 *
 */
public class Main04 {

	public static void deleteTree(File file) {
		if (!file.isFile()) { //  (1)
			for (File entry : file.listFiles()) { // (2)
				deleteTree(entry);
			}
		}
		else {
			file.delete();
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

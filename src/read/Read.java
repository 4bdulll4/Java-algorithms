package read;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Vector;


public class Read {

	/* Reading the file */

	public void readFile(String dir, int arr[]) {

		String a[];
		Vector<String> v = new Vector<String>();
		String line = null;
		try {

			BufferedReader buffer = new BufferedReader(new InputStreamReader(root.test.class.getResourceAsStream(dir)));
			while ((line = buffer.readLine()) != null)
				v.add(line);			
		} catch (IOException e) {
			e.printStackTrace();
		}

		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(v.elementAt(i));
		}
	}

	/* Initialize Array */

	public int init(String dir) {

		int N = 0; // counter for number of lines.

		try {
			BufferedReader buffer = new BufferedReader(new InputStreamReader(root.test.class.getResourceAsStream(dir)));
			while (buffer.readLine() != null) {
				N++;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return N;
	}
}

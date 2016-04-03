package search;

public class Sequential {
	public int search(int arr[], int key) {
		int N = arr.length - 1;
		int element = 0;
		boolean flag = false;

		while (element <= N && key != arr[element]) {
			element++;
		}
		if (element > N) {
			return -1;
		} else
			return element;
	}

}
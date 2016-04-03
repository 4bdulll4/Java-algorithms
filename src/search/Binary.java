package search;

public class Binary {

	public int search(int arr[], int key) {

		int upper = arr.length - 1;
		int lower = 0;
		int element = 0;
		int flag = 0;

		/*
		 * flag = 0 ---> not found yet. 
		 * flag = 1 ---> element is found. 
		 * flag = 2---> no such element.
		 */

		while (flag == 0) {
			element = (int) (lower + upper) / 2;

			if (key == arr[element]) {
				flag = 1;
				return element;
			}

			if (key < arr[element]) {
				upper = element - 1;
			} else
				lower = element + 1;

			if (lower > upper) {
				flag = 2;
			}
		}
		return -1;
	}
}

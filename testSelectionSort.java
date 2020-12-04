import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;

public class testSelectionSort {
	@Test
	public void test() {
		testPositive();
		testNegative();
		testMixed();
		testDuplicates();
		}
	public testSelectionSort() {

	}
	public void testPositive(){
		int[] arr = new int[5];
		arr[0] = 8;
		arr[1] = 9;
		arr[2] = 7;
		arr[3] = 10;
		arr[4] = 2;

		int[] Sortedarr = new int[5];
		Sortedarr[0] = 2;
		Sortedarr[1] = 7;
		Sortedarr[2] = 8;
		Sortedarr[3] = 9;
		Sortedarr[4] = 10;
		/** add tests to check for this unit test **/

		}

	public void testNegative(){
		/** Test data contains negative values only **/


		}
	public void testMixed(){
        /** Test data contains with both positive, negative and zeros **/
        int[] arr = new int[5];
		arr[0] = 8;
		arr[1] = -14;
		arr[2] = 7;
		arr[3] = -5;
		arr[4] = 2;
		int[] Sortedarr = new int[5];
		Sortedarr[0] = -14;
		Sortedarr[1] = -5;
		Sortedarr[2] = 2;
		Sortedarr[3] = 7;
		Sortedarr[4] = 8;
		/** add tests to check for this unit test **/
		SelectionSort test = new SelectionSort();
		arr = test.basicSelectionSort(arr);
		assertArrayEquals("MT Failed", Sortedarr, arr);

		}
	public void testDuplicates(){
		/** Test data contains duplicates **/
    int[] arr = new int[5];
		arr[0] = 1;
		arr[1] = 1;
		arr[2] = -2;
		arr[3] = -2;
		arr[4] = 3;
		int[] Sortedarr = new int[5];
		Sortedarr[0] = -2;
		Sortedarr[1] = -2;
		Sortedarr[2] = 1;
		Sortedarr[3] = 1;
		Sortedarr[4] = 3;
		/** add tests to check for this unit test **/
		SelectionSort test = new SelectionSort();
		arr = test.basicSelectionSort(arr);
		assertArrayEquals("DT Failed", Sortedarr, arr);


		}
	}

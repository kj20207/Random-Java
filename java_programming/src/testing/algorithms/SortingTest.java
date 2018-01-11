package testing.algorithms;

import algorithms.sorting.InsertionSort;
import algorithms.sorting.SelectionSort;
import testing.Generator;

public class SortingTest {

	public static void main(String args[]){

		System.out.println(new Integer(5).compareTo(new Integer(1)));

		SelectionSort<Integer> selectionSort = new SelectionSort<Integer>();
		InsertionSort<Integer> insertionSort = new InsertionSort<Integer>();

		Integer randoms[] = Generator.getInstance().randomNumberArray(1, 100, true, 10);

		printArray("--- Random Array: ", randoms);
		System.out.println();

		System.out.println("--- Selection Sort ---");
		printArray("- Asc: ", selectionSort.sortAscending((randoms.clone())));
		printArray("- Dsc: ", selectionSort.sortDescending((randoms.clone())));

		System.out.println("--- Insertion Sort ---");
		printArray("- Asc: ", insertionSort.sortAscending((randoms.clone())));
		printArray("- Dsc: ", insertionSort.sortDescending((randoms.clone())));


	}

	public static void printArray(String header, Integer nums[]){
		System.out.print(header);
		for(int i = 0; i < nums.length; i++){
			if(i > 0){
				System.out.print(", ");
			}
			System.out.print(nums[i]);
		}
		System.out.println();
	}


}

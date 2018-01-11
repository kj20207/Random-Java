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

		Generator.printArray("--- Random Array: ", randoms);
		System.out.println();

		System.out.println("--- Selection Sort ---");
		Generator.printArray("- Asc: ", selectionSort.sortAscending((randoms.clone())));
		Generator.printArray("- Dsc: ", selectionSort.sortDescending((randoms.clone())));

		System.out.println("--- Insertion Sort ---");
		Generator.printArray("- Asc: ", insertionSort.sortAscending((randoms.clone())));
		Generator.printArray("- Dsc: ", insertionSort.sortDescending((randoms.clone())));


	}

}

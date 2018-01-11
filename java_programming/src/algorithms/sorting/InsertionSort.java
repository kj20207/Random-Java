package algorithms.sorting;

public class InsertionSort<T extends Comparable <T>> extends Sort<T> {
	
	@Override
	protected T[] sort(T arr[], int comparing){
		for(int i = 0; i < arr.length; i++){
			for(int j = i; j > 0 && arr[j].compareTo(arr[j - 1]) == comparing; j--){
				T tmp = arr[j];
				arr[j] = arr[j-1];
				arr[j-1] = tmp;
			}
		}
		return arr;
	}
		
}

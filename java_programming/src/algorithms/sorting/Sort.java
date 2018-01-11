package algorithms.sorting;

public abstract class Sort<T extends Comparable<T>> {

	public T[] sortAscending(T arr[]){
		return sort(arr, -1);
	}

	public T[] sortDescending(T arr[]){
		return sort(arr, 1);
	}

	protected abstract T[] sort(T arr[], int comparing);

}

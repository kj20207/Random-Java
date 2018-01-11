package algorithms.sorting;

public abstract class Sort<T extends Comparable<T>> {

	public T[] sortAscendingEqual(T arr[]){
		return sortEqual(arr, -1);
	}

	public T[] sortDescendingEqual(T arr[]){
		return sortEqual(arr, 1);
	}
	
	public T[] sortAscendingRange(T arr[]){
		return sortRange(arr, true);
	}
	
	public T[] sortDescendingRange(T arr[]){
		return sortRange(arr, false);
	}

	protected abstract T[] sortEqual(T arr[], int comparing);

	protected abstract T[] sortRange(T arr[], boolean asc);
}
